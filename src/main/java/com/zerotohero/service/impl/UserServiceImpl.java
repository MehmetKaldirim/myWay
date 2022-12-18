package com.zerotohero.service.impl;

import com.zerotohero.dto.UserDTO;
import com.zerotohero.entity.User;
import com.zerotohero.mapper.MapperUtil;
import com.zerotohero.repository.UserRepository;
import com.zerotohero.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final MapperUtil mapperUtil;


    public UserServiceImpl(UserRepository userRepository, MapperUtil mapperUtil) {
        this.userRepository = userRepository;
        this.mapperUtil = mapperUtil;

    }

    @Override
    public List<UserDTO> listAllUsers() {
        List<User> list = userRepository.findAll();

        return list.stream().map(user -> mapperUtil.convert(user, new UserDTO())).collect(Collectors.toList());
    }


    @Override
    public User save(UserDTO dto) {
        //dto.setPassword(passwordEncoder.encode(dto.getPassword()));
        dto.setEnabled(true);
        userRepository.save(mapperUtil.convert(dto, new User()));

        return mapperUtil.convert(dto, new User());
    }

    @Override
    public UserDTO update(UserDTO dto) {

        User user = userRepository.findByEmail(dto.getEmail());
        System.out.println("here is email  = " + dto.getEmail());
        User convertedUser = mapperUtil.convert(dto, new User());
        //set id to converted object which we found in DB by Email

        System.out.println("taka" + convertedUser.getFirstName());
        convertedUser.setId(user.getId());
        convertedUser.setEnabled(user.getEnabled());

        System.out.println(" before save " + convertedUser);
        userRepository.save(convertedUser);

        return findByEmail(dto.getEmail());
    }



    @Override
    public void deleteByEmail(String email) {
        userRepository.deleteByEmail(email);
    }

    @Override
    public void delete(String email) {
        User user = userRepository.findByEmail(email);
        user.setIsDeleted(true);
        userRepository.save(user);
    }

    @Override
    public UserDTO findById(Long id) {
        return mapperUtil.convert(userRepository.findById(id).get(), new UserDTO());
    }

    @Override
    public UserDTO findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return mapperUtil.convert(user, new UserDTO());
    }


}
