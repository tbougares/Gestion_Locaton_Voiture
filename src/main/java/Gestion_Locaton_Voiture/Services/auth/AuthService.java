package Gestion_Locaton_Voiture.Services.auth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Dto.auth.RegisterRequest;
import Gestion_Locaton_Voiture.Entity.User;
import Gestion_Locaton_Voiture.Repository.UserRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
	
	private final UserRepository userRepository;
	private final PasswordEncoder PasswordEncoder;
	
	
	public void Register(RegisterRequest request) {
		User user = new User();
		user.setEmail(request.getEmail());
		user.setPassWord(PasswordEncoder.encode(request.getPassword()));
		user.setEnabled(true);
		
		
	}

}
