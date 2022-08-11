package com.example.demojenkins;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    private String name;

    private String tel;


    public UserDto toUserDto() {
        return UserDto.builder()
                .id(this.id)
                .name(this.name)
                .email(this.email)
                .tel(this.tel)
                .build();
    }
}
