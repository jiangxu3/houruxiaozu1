package com.javakar.springbootbestpractices.authentication.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class UserDto {

    private Long id;
    @NotBlank
    @Size(max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private Set<String> role;

    public UserDto(User user){
        id = user.getId();
        username = user.getUsername();
        email = user.getEmail();
        role = user.getRoles().stream()
        .map(role -> role.getName().name()).collect(Collectors.toSet());

    }

}
