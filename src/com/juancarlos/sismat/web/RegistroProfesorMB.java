package com.juancarlos.sismat.web;

import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.juancarlos.sismat.service.EmpleadoService;

@SuppressWarnings("serial")
@ManagedBean(name="registroProfesorMB")
@SessionScoped
@Component
public class RegistroProfesorMB implements Serializable{
	
	private String dni;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaNacimiento;
	private String direccion;
	private char sexo;
	private String celular;
	private String distrito;
	private String cargo;
	@Autowired
	EmpleadoService empleadoService;
	
	public void registrarEmpleado(){
		System.out.println("registroEmpleado");
		System.out.println(sexo);
		
		boolean resultado = empleadoService.registroEmpleado(dni,nombres,apellidoPaterno,apellidoMaterno,fechaNacimiento,direccion,sexo,celular,distrito,cargo);
		
		if(resultado){
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Se registro correctamente",""));
		}
		else{
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hubo un error en guardar la información",""));
		}		
	}
	
	public void actualizarRegistroEmpleado(){
		System.out.println("actualizarRegistrarEmpleado");
		
		boolean resultado = empleadoService.registroEmpleado(dni,nombres,apellidoPaterno,apellidoMaterno,fechaNacimiento,direccion,sexo,celular,distrito,cargo);
		
		if(resultado){
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Se actualizo correctamente",""));
		}
		else{
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hubo un error en actualizar la información",""));
		}		
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
