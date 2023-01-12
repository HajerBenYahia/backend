package com.poly.examen.repositories;

import com.poly.examen.entities.Operateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperateurRepository extends CrudRepository<Operateur, Long> {

}
