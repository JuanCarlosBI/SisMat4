package com.juancarlos.sismat.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.juancarlos.sismat.dao.EmpleadoDao;
import com.juancarlos.sismat.dominio.Colegio;
import com.juancarlos.sismat.dominio.Empleado;

@Repository
public class EmpleadoDaoImpl extends HibernateDaoSupport implements EmpleadoDao {

	@Autowired
	public EmpleadoDaoImpl(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
	
	public Empleado datosEmpleado(Integer idEmpleado) {
		logger.info("en datosEmpleado()");
		
		return getHibernateTemplate().get(Empleado.class, idEmpleado);
	}

	

	public boolean registroEmpleado(Empleado empleado){
		boolean resultado;
		
		try {
			getHibernateTemplate().save(empleado);	
			getHibernateTemplate().flush();
			resultado = true;
			
		} catch (Exception e) {
			resultado = false;
		}	
		
		return resultado;
	}

	public boolean actualizarRegistroEmpleado(Empleado empleado) {
		boolean resultado;
		boolean eliminado;
		
		try {	
			eliminado = eliminaEmpleado(empleado.getIdEmpleado());
			
			if(eliminado){
				getHibernateTemplate().update(empleado);	
				getHibernateTemplate().flush();
				resultado = true;
			}
			else{
				resultado = false;
			}			
		} catch (Exception e) {
			resultado = false;
		}	
		
		return resultado;	
	}

	
	public boolean eliminaEmpleado(Integer idEmpleado) {
		boolean resultado;
		Empleado empleado = encontrarEmpleado(idEmpleado);
		
		if(!(empleado == null)){				
			try {
				getHibernateTemplate().delete(empleado);
				resultado = true;
			} catch (Exception e) {
				resultado = false;
			}				
		}
		else{
		resultado = false;
		}
	
		
		return resultado;
	}

	@SuppressWarnings("unchecked")
	public Empleado encontrarEmpleado(Integer idEmpleado){
		List<Empleado> empleados;
		Empleado empleado = new Empleado();
		String sql="";
		try {
			sql = "from Empleados where IdEmpleado='"+idEmpleado+"'";
			empleados = getHibernateTemplate().find(sql);
			
			if(!empleados.isEmpty()){
				if(empleados.size() == 1){
					empleado = empleados.get(0);
				}
			}
			else{
				empleado = null;
			}
			
		} catch (Exception e) {
			empleado = null;
		}
		
		return empleado;
	}
	public boolean eliminaEmpleado(Empleado empleado) {
		
		return false;
	}

}
