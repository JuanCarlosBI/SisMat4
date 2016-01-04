package com.juancarlos.sismat.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juancarlos.sismat.dao.ColegioDao;
import com.juancarlos.sismat.dao.EmpleadoDao;
import com.juancarlos.sismat.dominio.Colegio;
import com.juancarlos.sismat.dominio.Empleado;
import com.juancarlos.sismat.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	@Autowired
	EmpleadoDao empleadoDao;
	
	public boolean registroEmpleado(String dni,String nombres,String apellidoPaterno ,String apellidoMaterno,Date fechaNacimiento,String direccion,char sexo,String celular,String distrito,String cargo){
		Empleado empleado = new Empleado();
		
		empleado.setDni(dni);
		empleado.setNombres(nombres);
		empleado.setApellidos(apellidoPaterno+" "+apellidoMaterno);
		empleado.setFechaNacimiento(fechaNacimiento);
		empleado.setDireccion(direccion);
		empleado.setSexo(sexo);
		empleado.setCelular(celular);
		empleado.setDistrito(distrito);
		empleado.setCargo(cargo);
			
		return empleadoDao.registroEmpleado(empleado);
	}

	public boolean actualizarRegistroEmpleado(String dni,String nombres,String apellidoPaterno ,String apellidoMaterno,Date fechaNacimiento,String direccion,char sexo,String celular,String distrito,String cargo){
		
		Empleado empleado = new Empleado();
		
		empleado.setDni(dni);
		empleado.setNombres(nombres);
		empleado.setApellidos(apellidoPaterno+" "+apellidoMaterno);
	//	aca tienes que convertir tu string a date
		
	 	empleado.setFechaNacimiento(fechaNacimiento);
		empleado.setDireccion(direccion);
		empleado.setSexo(sexo);
		empleado.setCelular(celular);
		empleado.setDistrito(distrito);
		empleado.setCargo(cargo);
			
		
		return empleadoDao.actualizarRegistroEmpleado(empleado);
	}

	
}
