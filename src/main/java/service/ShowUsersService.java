package main.java.service;

import java.util.List;
import javax.transaction.Transaction;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.entity.Users;
import main.java.repository.UsersRepository;

@Service
@Transactional(rollbackOn = Exception.class)
public class ShowUsersService {

	@Autowired
	UsersRepository userRepository;

	public List<Users> searchAll() {
		return userRepository.findAll();
	}
}
