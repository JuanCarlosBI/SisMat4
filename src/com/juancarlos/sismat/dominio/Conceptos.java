package com.juancarlos.sismat.dominio;
// Generated 20-abr-2015 23:35:22 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Conceptos generated by hbm2java
 */
@Entity
@Table(name="conceptos"
    ,catalog="dbcolegio2"
)
public class Conceptos  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Short idConcepto;
     private String nombreConcepto;
     private Date fechaVencimiento;
     private BigDecimal precio;
     private char estado;
     private String codigoColegio;

    public Conceptos() {
    }

    public Conceptos(String nombreConcepto, Date fechaVencimiento, BigDecimal precio, char estado, String codigoColegio) {
       this.nombreConcepto = nombreConcepto;
       this.fechaVencimiento = fechaVencimiento;
       this.precio = precio;
       this.estado = estado;
       this.codigoColegio = codigoColegio;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="IdConcepto", unique=true, nullable=false)
    public Short getIdConcepto() {
        return this.idConcepto;
    }
    
    public void setIdConcepto(Short idConcepto) {
        this.idConcepto = idConcepto;
    }

    
    @Column(name="NombreConcepto", nullable=false, length=50)
    public String getNombreConcepto() {
        return this.nombreConcepto;
    }
    
    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FechaVencimiento", nullable=false, length=10)
    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    
    @Column(name="Precio", nullable=false, precision=6)
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    
    @Column(name="Estado", nullable=false, length=1)
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }

    
    @Column(name="CodigoColegio", nullable=false, length=11)
    public String getCodigoColegio() {
        return this.codigoColegio;
    }
    
    public void setCodigoColegio(String codigoColegio) {
        this.codigoColegio = codigoColegio;
    }




}


