package org.example.szs_kyungdoma.persistence.repository;

import org.example.szs_kyungdoma.persistence.entity.MemberJpaEntity;

public interface MemberRepository {

    void save(final MemberJpaEntity memberJpaEntity);

}
