package Gestion_Locaton_Voiture.Services.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Gestion_Locaton_Voiture.Dto.auth.AuthMapper;
import Gestion_Locaton_Voiture.Dto.auth.AuthentificationRequest;
import Gestion_Locaton_Voiture.Dto.auth.AuthentificationResponse;
import Gestion_Locaton_Voiture.Dto.auth.RegisterRequest;
import Gestion_Locaton_Voiture.Entity.User;
import Gestion_Locaton_Voiture.Repository.RoleRepository;
import Gestion_Locaton_Voiture.Repository.UserRepository;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthMapper mapper;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authManager;
    private final JwtService jwtService;
    private final RoleRepository roleRepository;

    public void register(RegisterRequest request) {
        var user = mapper.toUser(request);
        var encryptedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encryptedPassword);
        // get or create student role
        /*Role studentRole = roleRepository.findByName(RoleEnum.ROLE_STUDENT)
                        .orElseGet(() -> {
                            var newStudentRole = Role.builder()
                                    .name(RoleEnum.ROLE_STUDENT)
                                    .build();
                            return roleRepository.save(newStudentRole);
                        });

        student.setRoles(List.of(studentRole));*/

        userRepository.save(user);
    }

    public AuthentificationResponse authenticate(AuthentificationRequest request) {
        Authentication authenticatedUser = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var userDetails = (User) authenticatedUser.getPrincipal();
        HashMap<String, Object> claims = new HashMap<>();
        var authorities = userDetails.getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .toList();
        claims.put("Email", userDetails.getUsername());
        claims.put("authorities", authorities);
        var jwtToken = jwtService.generateToken(claims, userDetails);
        return AuthentificationResponse.builder()
                .token(jwtToken)
                .build();
    }
}