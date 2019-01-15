package com.clisoft.articulos.identificadores.entidades;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
//	@Id
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name="IDENTIFICADOR")
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

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

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
		result = prime * result + ((MarcaMvt == null) ? 0 : MarcaMvt.hashCode());
		result = prime * result + ((codColeccion == null) ? 0 : codColeccion.hashCode());
		result = prime * result + ((codMarca == null) ? 0 : codMarca.hashCode());
		result = prime * result + ((codOrden1 == null) ? 0 : codOrden1.hashCode());
		result = prime * result + ((codOrden2 == null) ? 0 : codOrden2.hashCode());
		result = prime * result + ((codOrden3 == null) ? 0 : codOrden3.hashCode());
		result = prime * result + ((codProv == null) ? 0 : codProv.hashCode());
		result = prime * result + ((desAmplia == null) ? 0 : desAmplia.hashCode());
		result = prime * result + ((desOrden4 == null) ? 0 : desOrden4.hashCode());
		result = prime * result + ((desTpv == null) ? 0 : desTpv.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((generico == null) ? 0 : generico.hashCode());
		result = prime * result + ((identificadorExt == null) ? 0 : identificadorExt.hashCode());
		result = prime * result + ((precioXVariante == null) ? 0 : precioXVariante.hashCode());
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
		if (MarcaMvt == null) {
			if (other.MarcaMvt != null)
				return false;
		} else if (!MarcaMvt.equals(other.MarcaMvt))
			return false;
		if (codColeccion == null) {
			if (other.codColeccion != null)
				return false;
		} else if (!codColeccion.equals(other.codColeccion))
			return false;
		if (codMarca == null) {
			if (other.codMarca != null)
				return false;
		} else if (!codMarca.equals(other.codMarca))
			return false;
		if (codOrden1 == null) {
			if (other.codOrden1 != null)
				return false;
		} else if (!codOrden1.equals(other.codOrden1))
			return false;
		if (codOrden2 == null) {
			if (other.codOrden2 != null)
				return false;
		} else if (!codOrden2.equals(other.codOrden2))
			return false;
		if (codOrden3 == null) {
			if (other.codOrden3 != null)
				return false;
		} else if (!codOrden3.equals(other.codOrden3))
			return false;
		if (codProv == null) {
			if (other.codProv != null)
				return false;
		} else if (!codProv.equals(other.codProv))
			return false;
		if (desAmplia == null) {
			if (other.desAmplia != null)
				return false;
		} else if (!desAmplia.equals(other.desAmplia))
			return false;
		if (desOrden4 == null) {
			if (other.desOrden4 != null)
				return false;
		} else if (!desOrden4.equals(other.desOrden4))
			return false;
		if (desTpv == null) {
			if (other.desTpv != null)
				return false;
		} else if (!desTpv.equals(other.desTpv))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (generico == null) {
			if (other.generico != null)
				return false;
		} else if (!generico.equals(other.generico))
			return false;
		if (identificadorExt == null) {
			if (other.identificadorExt != null)
				return false;
		} else if (!identificadorExt.equals(other.identificadorExt))
			return false;
		if (precioXVariante == null) {
			if (other.precioXVariante != null)
				return false;
		} else if (!precioXVariante.equals(other.precioXVariante))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Identificador [MarcaMvt=" + MarcaMvt + ", fecha=" + fecha + ", identificador=" + identificadorExt + ", codProv=" + codProv + ", codMarca=" + codMarca
				+ ", codColeccion=" + codColeccion + ", codOrden1=" + codOrden1 + ", codOrden2=" + codOrden2
				+ ", codOrden3=" + codOrden3 + ", desOrden4=" + desOrden4 + ", desAmplia=" + desAmplia + ", desTpv="
				+ desTpv + ", precioXVariante=" + precioXVariante + ", generico=" + generico + "]";
	}


	
	
	
}
