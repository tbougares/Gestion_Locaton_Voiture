package Gestion_Locaton_Voiture.Controlleur;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gestion_Locaton_Voiture.Dto.auth.AuthentificationRequest;
import Gestion_Locaton_Voiture.Dto.auth.AuthentificationResponse;
import Gestion_Locaton_Voiture.Dto.auth.RegisterRequest;
import Gestion_Locaton_Voiture.Services.Impl.AuthService;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public ResponseEntity<Void> register(
            @RequestBody @Valid RegisterRequest request
    ) {
    	
        service.register(request);
        return ResponseEntity.accepted().build();
    }


    @PostMapping("/login")
    public ResponseEntity<AuthentificationResponse> authenticate(
            @RequestBody @Valid AuthentificationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }


}