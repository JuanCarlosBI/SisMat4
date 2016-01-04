package com.juancarlos.sismat.dao;

import com.juancarlos.sismat.dominio.Empleado;

public interface EmpleadoDao {

	public Empleado datosEmpleado(Integer idEmpleado);
	public boolean registroEmpleado(Empleado empleado);
	public boolean actualizarRegistroEmpleado(Empleado empleado);
	public boolean eliminaEmpleado(Empleado empleado);
}
