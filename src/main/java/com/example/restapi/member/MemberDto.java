package com.example.restapi.member;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MemberDto {
    private Long id;

    @Size(min = 3, max = 50)
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String email;

    private Role role;

}

