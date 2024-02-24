package Gestion_Locaton_Voiture.Dto.auth;
import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Entity.User;

@Service
public class AuthMapper {

    public User toUser(RegisterRequest s) {
    	User user = new User();
        user.setEmail(s.getEmail());
        // FIXME
        user.setPassword(s.getPassword());
        //user.setEnabled(true);
        return user;
    }
}