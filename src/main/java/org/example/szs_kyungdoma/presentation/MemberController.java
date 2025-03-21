package org.example.szs_kyungdoma.presentation;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.szs_kyungdoma.application.member.MemberService;
import org.example.szs_kyungdoma.dto.member.MemberSignupRequest;

@RequiredArgsConstructor
@RequestMapping("/szs")
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public void signup(@RequestBody @Valid final MemberSignupRequest memberSignupRequest) {
        memberService.signup(memberSignupRequest);
    }

//    @PostMapping("/login")
//    public void login(@RequestBody final MemberLoginRequest memberLoginRequest,
//                      final HttpServletRequest request) {
//        memberService.login(memberLoginRequest, request);
//    }
}
