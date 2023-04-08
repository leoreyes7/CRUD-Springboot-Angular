package com.pr7.crudsbang.repositoy;

import com.pr7.crudsbang.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
