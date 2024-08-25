package com.example.restapi.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;


    @Test
    public void saveTest(){
      Member member = Member.builder()
              .username("kim")
              .email("sdr04076@naver.com")
              .password("1234")
              .build();
     Member dmMember = memberRepository.save(member);

     //맞는지 확인
        assertEquals("sdr04076@naver.com", dmMember.getEmail());
        assertEquals("1234", dmMember.getPassword());
    }
    @Test
    public void selectTest(){
        List<Member> list = memberRepository.findAll();

        for(Member member: list){
            System.out.println(member);
        }

    }



}