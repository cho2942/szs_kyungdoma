package org.example.szs_kyungdoma.persistence.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.szs_kyungdoma.common.HashingAndEncryptionUtils;
import org.example.szs_kyungdoma.dto.member.MemberSignupRequest;
import org.example.szs_kyungdoma.persistence.BaseTimeEntity;

@Getter
@NoArgsConstructor
@Table(name = "member")
@Entity
public class MemberJpaEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String userId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String regNo;

    @Builder
    private MemberJpaEntity(String userId, String password, String name, String regNo) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.regNo = regNo;
    }

    public static MemberJpaEntity createMemberJpaEntity(final MemberSignupRequest memberSignupRequest, final HashingAndEncryptionUtils hashingAndEncryptionUtils) {
        return MemberJpaEntity.builder()
                .userId(memberSignupRequest.getUserId())
                .password(hashingAndEncryptionUtils.hashString(memberSignupRequest.getPassword()))
                .name(memberSignupRequest.getName())
                .regNo(hashingAndEncryptionUtils.encrypt(memberSignupRequest.getRegNo()))
                .build();
    };


}
