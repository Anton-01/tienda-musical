package com.markusdev.tiendamusicalservices.service.impl;

import com.markusdev.tiendamusicaldata.dao.PersonRepository;
import com.markusdev.tiendamusicalentities.entities.Person;
import com.markusdev.tiendamusicalservices.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private PersonRepository personRepositoryImpl;

    @Override
    public Person consultUserLogin(String user, String password) {
        return this.personRepositoryImpl.findByUserPassword(user, password);
    }
}
