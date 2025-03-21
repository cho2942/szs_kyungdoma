package org.example.szs_kyungdoma.persistence.repository;

import org.example.szs_kyungdoma.persistence.entity.MemberJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<MemberJpaEntity, Long> {
}
