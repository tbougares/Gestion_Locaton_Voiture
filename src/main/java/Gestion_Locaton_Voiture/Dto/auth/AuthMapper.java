package Gestion_Locaton_Voiture.Dto.auth;
import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Entity.User;

@Service
public class AuthMapper {

    public User toUser(RegisterRequest s) {
    	User student = new User();
        student.setEmail(s.getEmail());
        // FIXME
        student.setPassword(s.getPassword());
        student.setEnabled(true);
        return student;
    }
}