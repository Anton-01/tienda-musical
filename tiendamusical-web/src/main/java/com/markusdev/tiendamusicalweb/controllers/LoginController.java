package com.markusdev.tiendamusicalweb.controllers;

import com.markusdev.tiendamusicalentities.entities.Person;
import com.markusdev.tiendamusicalservices.service.LoginService;
import com.markusdev.tiendamusicalweb.utils.CommonUtils;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
@Getter
@Setter
public class LoginController {
    private String user;
    private String password;

    @ManagedProperty("#{loginServiceImpl}")
    private LoginService loginServiceImpl;

    @PostConstruct
    public void init(){
        System.out.println("Starting login view....");
    }

    public void signIn(){
        Person personConsulted = this.loginServiceImpl.consultUserLogin(this.user, this.password);
        if ( personConsulted != null){
            CommonUtils.showMessage(FacesMessage.SEVERITY_INFO, "! Success ¡", "Welcome home");
        }else{
            CommonUtils.showMessage(FacesMessage.SEVERITY_ERROR, "! Ups ¡", "The username and / or password are incorrect\n ");
        }
    }

}
