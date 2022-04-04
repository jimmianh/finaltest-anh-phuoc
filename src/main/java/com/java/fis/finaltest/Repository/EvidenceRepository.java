package com.java.fis.finaltest.Repository;

import com.java.fis.finaltest.Entity.Evidence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EvidenceRepository extends JpaRepository<Evidence, Long> {

}
