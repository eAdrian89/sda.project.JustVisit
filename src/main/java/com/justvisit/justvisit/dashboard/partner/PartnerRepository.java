package com.justvisit.justvisit.dashboard.partner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface PartnerRepository extends JpaRepository<Partner, Long> {
    Optional<Partner> findByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE Partner a " +
            "SET a.enabled = TRUE WHERE a.email = ?1")
    int enablePartner(String email);

}
