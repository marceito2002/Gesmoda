package com.clisoft.articulos.identificadores.entidades;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="T11XX1000")
public class Identificador {

	@Id
	@Column(name="IDENTIFICADOR")
	private String identificador;
	
	@Column(name="MarcaMvt")
	private String MarcaMvt ;
	
	@Column(name="FECHA")
	private String fecha;	

	@OneToOne //S(mappedBy="identificador")
	private IdentificadorExt identificadorExt;
		
	@Column(name="CODIGO_PROVEEDOR")
	private String codProv;
	
	@Column(name="CODIGO_MARCA")
	private String codMarca;
	
	@Column(name="CODIGO_COLECCION")
	private String codColeccion;
	
	@Column(name="CODIGO_PRIMER_ORDEN")
	private String codOrden1;
	
	@Column(name="CODIGO_SEGUNDO_ORDEN")
	private String codOrden2;
	
	@Column(name="CODIGO_TERCER_ORDEN")
	private String codOrden3;
	
	@Column(name="DESCRIP_CUARTO_ORDEN")
	private String desOrden4;
	
	@Column(name="DESCRIP_AMPLIA")
	private String desAmplia;
	
	@Column(name="DESCRIP_TPV")
	private String desTpv;
	
	@Column(name="PRECIO_POR_VARIANTE")
	private String precioXVariante;
	
	@Column(name="GENERICO")
	private String generico;

	public String getMarcaMvt() {
		return MarcaMvt;
	}

	public void setMarcaMvt(String marcaMvt) {
		MarcaMvt = marcaMvt;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getCodProv() {
		return codProv;
	}

	public void setCodProv(String codProv) {
		this.codProv = codProv;
	}

	public String getCodMarca() {
		return codMarca;
	}

	public void setCodMarca(String codMarca) {
		this.codMarca = codMarca;
	}

	public String getCodColeccion() {
		return codColeccion;
	}

	public void setCodColeccion(String codColeccion) {
		this.codColeccion = codColeccion;
	}

	public String getCodOrden1() {
		return codOrden1;
	}

	public void setCodOrden1(String codOrden1) {
		this.codOrden1 = codOrden1;
	}

	public String getCodOrden2() {
		return codOrden2;
	}

	public void setCodOrden2(String codOrden2) {
		this.codOrden2 = codOrden2;
	}

	public String getCodOrden3() {
		return codOrden3;
	}

	public void setCodOrden3(String codOrden3) {
		this.codOrden3 = codOrden3;
	}

	public String getDesOrden4() {
		return desOrden4;
	}

	public void setDesOrden4(String desOrden4) {
		this.desOrden4 = desOrden4;
	}

	public String getDesAmplia() {
		return desAmplia;
	}

	public void setDesAmplia(String desAmplia) {
		this.desAmplia = desAmplia;
	}

	public String getDesTpv() {
		return desTpv;
	}

	public void setDesTpv(String desTpv) {
		this.desTpv = desTpv;
	}

	public String getPrecioXVariante() {
		return precioXVariante;
	}

	public void setPrecioXVariante(String precioXVariante) {
		this.precioXVariante = precioXVariante;
	}

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}

	public IdentificadorExt getIdentificadorExt() {
		return identificadorExt;
	}

	public void setIdentificadorExt(IdentificadorExt identificadorExt) {
		this.identificadorExt = identificadorExt;
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
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
		Identificador other = (Identificador) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Identificador [MarcaMvt=" + MarcaMvt + ", fecha=" + fecha + ", identificador=" + identificador
				+ ", identificadorExt=" + identificadorExt + ", codProv=" + codProv + ", codMarca=" + codMarca
				+ ", codColeccion=" + codColeccion + ", codOrden1=" + codOrden1 + ", codOrden2=" + codOrden2
				+ ", codOrden3=" + codOrden3 + ", desOrden4=" + desOrden4 + ", desAmplia=" + desAmplia + ", desTpv="
				+ desTpv + ", precioXVariante=" + precioXVariante + ", generico=" + generico + "]";
	}


	
	
	
}
