package com.java.fis.finaltest.Repository;

import com.java.fis.finaltest.Entity.CriminalCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CriminalCaseRepository extends JpaRepository<CriminalCase, Long> {

}
