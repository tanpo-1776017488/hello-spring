package com.example.hello_spring.controller;

import com.example.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService mMemberService;

    @Autowired
    public MemberController(MemberService memberService) {
        mMemberService = memberService;
    }


}
