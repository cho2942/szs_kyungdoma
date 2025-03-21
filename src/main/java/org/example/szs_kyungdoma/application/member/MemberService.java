package org.example.szs_kyungdoma.application.member;

import lombok.RequiredArgsConstructor;
import org.example.szs_kyungdoma.common.HashingAndEncryptionUtils;
import org.springframework.stereotype.Service;
import org.example.szs_kyungdoma.dto.member.MemberSignupRequest;
import org.example.szs_kyungdoma.persistence.entity.MemberJpaEntity;
import org.example.szs_kyungdoma.persistence.repository.MemberRepository;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final HashingAndEncryptionUtils hashingAndEncryptionUtils;

    public void signup(final MemberSignupRequest memberSignupRequest) {
        MemberJpaEntity memberJpaEntity = MemberJpaEntity.createMemberJpaEntity(memberSignupRequest, hashingAndEncryptionUtils);
        memberRepository.save(memberJpaEntity);
    }

//    public void login(final MemberLoginRequest memberLoginRequest, final HttpServletRequest httpServletRequest) {
//        memberLogin.login(memberLoginRequest, httpServletRequest);
//    }
}
