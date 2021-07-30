package com.ttsr;

import com.ttsr.builders.MemberBuilder;
import com.ttsr.members.Member;

public class Test {
    public static void main(String[] args) {
        MemberBuilder memberBuilder = new MemberBuilder();
        memberBuilder.setRole("director");
        memberBuilder.setRating(5);
        memberBuilder.setName("Ivan");
        memberBuilder.setLastname("Ivanov");
        memberBuilder.setPhoneNumber("7777777777A");
        memberBuilder.setEmail("ivan.ivanov@corp.com");

        Member member =  memberBuilder.build();
        System.out.println(member.print());
    }
}
