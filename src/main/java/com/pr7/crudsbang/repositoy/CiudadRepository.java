package com.pr7.crudsbang.repositoy;

import com.pr7.crudsbang.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
}
