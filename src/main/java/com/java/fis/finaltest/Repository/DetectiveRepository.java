package com.java.fis.finaltest.Repository;

import com.java.fis.finaltest.Entity.Detective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DetectiveRepository extends JpaRepository<Detective, Long> {

}
