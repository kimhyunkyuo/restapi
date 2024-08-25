package com.example.restapi.member;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String username;
    @Column(length = 50, nullable = false, unique = true)
    private String password;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;
    @CreatedDate
    private LocalDateTime writeDate;
    @LastModifiedDate
    private LocalDateTime modifyDate;
}
