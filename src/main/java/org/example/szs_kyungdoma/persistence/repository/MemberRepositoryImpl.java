package org.example.szs_kyungdoma.persistence.repository;

import lombok.RequiredArgsConstructor;
import org.example.szs_kyungdoma.persistence.entity.MemberJpaEntity;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class MemberRepositoryImpl implements MemberRepository {

    private final MemberJpaRepository memberJpaRepository;

    public void save(final MemberJpaEntity memberJpaEntity) {
        memberJpaRepository.save(memberJpaEntity);
    }
}
