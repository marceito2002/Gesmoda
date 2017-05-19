package com.clisoft.clientes.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T11XX400")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CodigoCliente")
	private long id;
	

	@Column(name="CodigoTienda")
	private String idTienda;
	
	@Column(name="NombreCliente")
	private String nombre;	
	
	@Column(name="ApellidosCliente")
	private String apellidos;
	
	@Column(name="DireccionCliente")
	private String direccion;
	
	@Column(name="LocalidadCliente")
	private String localidad;
	
	@Column(name="CodPostalCliente")
	private String codPostal;
	
	@Column(name="ProvinciaCliente")
	private String provincia;
	
	@Column(name="fechaNacimientoCliente")
	private String fechaNacimiento;
	
	@Column(name="DniCliente")
	private String dni;
	
	@Column(name="TlfMovilCliente")
	private String telefono;

	@Column(name="email")
	private String Email;

	@Column(name="FechaAltaCliente")
	private String fechaAlta;

	@Column(name="idioma")
	private String idioma;

	@Column(name="Fact_Direccion")
	private String direccFact;

	@Column(name="Fact_Localidad")
	private String localidadFact;

	@Column(name="Fact_CodPostal")
	private String codpostalFact;
	
	@Column(name="Fact_Provincia")
	private String provinciaFact;
	
	@Column(name="LimiteCredito")
	private String limiteCredito;
	
	@Column(name="TipoDescuento")
	private String tipoDto;
	
	@Column(name="SaldoCliente")
	private String saldo;

	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(String idTienda) {
		this.idTienda = idTienda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion( String  direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getDireccFact() {
		return direccFact;
	}

	public void setDireccFact(String direccFact) {
		this.direccFact = direccFact;
	}

	public String getLocalidadFact() {
		return localidadFact;
	}

	public void setLocalidadFact(String localidadFact) {
		this.localidadFact = localidadFact;
	}

	public String getCodpostalFact() {
		return codpostalFact;
	}

	public void setCodpostalFact(String codpostalFact) {
		this.codpostalFact = codpostalFact;
	}

	public String getProvinciaFact() {
		return provinciaFact;
	}

	public void setProvinciaFact(String provinciaFact) {
		this.provinciaFact = provinciaFact;
	}

	public String getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(String limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getTipoDto() {
		return tipoDto;
	}

	public void setTipoDto(String tipoDto) {
		this.tipoDto = tipoDto;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", idTienda=" + idTienda + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + ", localidad=" + localidad + ", codPostal=" + codPostal + ", provincia="
				+ provincia + ", fechaNacimiento=" + fechaNacimiento + ", dni=" + dni + ", telefono=" + telefono
				+ ", Email=" + Email + ", fechaAlta=" + fechaAlta + ", idioma=" + idioma + ", direccFact=" + direccFact
				+ ", localidadFact=" + localidadFact + ", codpostalFact=" + codpostalFact + ", provinciaFact="
				+ provinciaFact + ", limiteCredito=" + limiteCredito + ", tipoDto=" + tipoDto + ", saldo=" + saldo
				+ "]";
	}



	
	
}
