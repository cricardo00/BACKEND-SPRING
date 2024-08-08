package com.seguro.seguro.repository;

import com.seguro.seguro.model.BienesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BienesRepository extends JpaRepository<BienesEntity, Long> {

}
