package Gestion_Locaton_Voiture.Services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import Gestion_Locaton_Voiture.Dto.UserDto;
import Gestion_Locaton_Voiture.Repository.UserRepository;
import Gestion_Locaton_Voiture.Services.UserService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	
	private final UserRepository userRepository;

	@Override
	public List<UserDto> findAll(){
		// TODO Auto-generated method stub
		return userRepository.findAll().stream()
		        .map(UserDto::fromEntity)
		        .collect(Collectors.toList());
	}

}
