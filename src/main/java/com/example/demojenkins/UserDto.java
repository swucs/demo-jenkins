package com.example.demojenkins;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private Integer id;

    private String email;

    private String name;

    private String tel;

    private String productNo;

    private String productName;
}
