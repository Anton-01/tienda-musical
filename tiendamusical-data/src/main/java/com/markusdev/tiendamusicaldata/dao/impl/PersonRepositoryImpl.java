package com.markusdev.tiendamusicaldata.dao.impl;

import com.markusdev.tiendamusicaldata.common.CommonRepository;
import com.markusdev.tiendamusicaldata.dao.PersonRepository;
import com.markusdev.tiendamusicalentities.entities.Person;

public class PersonRepositoryImpl extends CommonRepository<Person, PersonRepository> {

    public Person findByUserPassword(String user, String password){
        return this.repository.findByUserPassword(user, password);
    }
}
