package com.demo.AlumnosTable.dao;

import org.springframework.data.repository.CrudRepository;



import java.util.Optional;

public interface AlumnoDao extends CrudRepository {

    /*@Override*/
    Optional<Object> findById(Long id);

}
