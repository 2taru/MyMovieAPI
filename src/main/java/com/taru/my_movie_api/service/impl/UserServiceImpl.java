package com.taru.my_movie_api.service.impl;

import com.taru.my_movie_api.dto.UserDTO;
import com.taru.my_movie_api.mapper.UserMapper;
import com.taru.my_movie_api.models.User;
import com.taru.my_movie_api.repository.UserRepository;
import com.taru.my_movie_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = UserMapper.mapToEntity(userDTO);
        userRepository.save(user);
        return UserMapper.mapToDto(user);
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO getByUsername(String username) {
        return null;
    }

    @Override
    public UserDTO findByEmail(String email) {
        return null;
    }

    @Override
    public void deleteUserByUsername(String username) {

    }
}