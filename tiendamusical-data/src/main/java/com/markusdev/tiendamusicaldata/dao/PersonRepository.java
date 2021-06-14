package com.markusdev.tiendamusicaldata.dao;

import com.markusdev.tiendamusicalentities.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    @Query("SELECT p FROM Person p WHERE p.user = ?1 AND p.password = ?2")
    Person findByUserPassword(String user, String password);
}
