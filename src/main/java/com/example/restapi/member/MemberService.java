package com.example.restapi.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

     private final MemberRepository memberRepository;

     public Member save(Member member){
       Optional<Member> optionalMember = memberRepository.findByEmail(member.getEmail());

       if (optionalMember.isPresent()){
           throw new IllegalStateException("이미 존재하는 회원입니다.");
       }
         return memberRepository.save(member);
     }
}
