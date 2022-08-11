package com.example.demojenkins;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;


    @Transactional
    @Override
    public void createUser(UserDto userDto) {

        User user = User.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .tel(userDto.getTel())
                .build();

        userRepository.save(user);

        Product product = Product.builder()
                .name(userDto.getProductName())
                .no(userDto.getProductNo())
                .build();

        productRepository.save(product);
    }


    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users.stream()
                .map(u -> u.toUserDto())
                .collect(Collectors.toList());
    }

}
