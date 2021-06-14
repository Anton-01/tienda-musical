package com.markusdev.tiendamusicalservices.service;

import com.markusdev.tiendamusicalentities.entities.Person;

public interface LoginService {

    Person consultUserLogin(String user, String password);
}
