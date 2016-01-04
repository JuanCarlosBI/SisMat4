package com.juancarlos.sismat.web;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.juancarlos.sismat.service.AlumnoService;


@SuppressWarnings("serial")
@ManagedBean(name="registroAlumnosMB")
@SessionScoped
@Component
public class RegistroAlumnosMB implements Serializable{

}


