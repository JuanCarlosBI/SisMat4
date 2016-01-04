package com.juancarlos.sismat.service;

import java.sql.Date;

public interface EmpleadoService {
	public boolean registroEmpleado(String dni,String nombres,String apellidoPaterno ,String apellidoMaterno,java.util.Date fechaNacimiento,String direccion,char sexo,String celular,String distrito,String cargo);
	public boolean actualizarRegistroEmpleado(String dni,String nombres,String apellidoPaterno ,String apellidoMaterno,java.util.Date fechaNacimiento,String direccion,char sexo,String celular,String distrito,String cargo);
	
}
