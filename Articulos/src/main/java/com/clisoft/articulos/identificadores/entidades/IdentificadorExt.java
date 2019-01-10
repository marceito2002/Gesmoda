package com.clisoft.articulos.identificadores.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="T11XX1001")
public class IdentificadorExt {

//	@Id
//	@Column(name="IDENTIFICADOR")
//	private String identificador;
	@Id
	@OneToOne(fetch=FetchType.LAZY, mappedBy="identificadorExt")
	private Identificador identificador;
	
	@Column(name="DESCRIP_QUINTO_ORDEN")
	private String desOrden5;
	
	@Column(name="DESCRIP_SEXTO_ORDEN")
	private String desOrden6;
	
	@Column(name="DESCRIP_SEPTIMO_ORDEN")
	private String desOrden7 ;
	
	@Column(name="DESCRIP_OCTAVO_ORDEN")
	private String desOrden8;
	
	@Column(name="DESCRIP_NOVENO_ORDEN")
	private String desOrden9;
	
	@Column(name="DESCRIP_CARACT_1")
	private String desCaract1;
	
	@Column(name="DESCRIP_CARACT_2")
	private String desCaract2;
	
	@Column(name="DESCRIP_CARACT_3")
	private String desCaract3;
	
	@Column(name="DESCRIP_CARACT_4")
	private String desCaract4;
	
	@Column(name="DESCRIP_CARACT_5")
	private String desCaract5;
	
	@Column(name="DESCRIP_CARACT_6")
	private String desCaract6;
	
	@Column(name="DESCRIP_CARACT_7")
	private String desCaract7;
	
	@Column(name="DESCRIP_CARACT_8")
	private String desCaract8;
	
	@Column(name="DESCRIP_CARACT_9")
	private String desCaract9;
	
	@Column(name="DESCRIP_CARACT_10")
	private String desCaract10;
	
	@Column(name="DESCRIP_CARACT_11")
	private String desCaract11;
	
	@Column(name="DESCRIP_CARACT_12")
	private String desCaract12;
	
	@Column(name="CODEBAR_AUTOMATICO")
	private String codebarAuto;
	
	@Column(name="MINIMO")
	private String minimo ;
	
	@Column(name="SERIE_PRIMERA")
	private String serie1;
	
	@Column(name="SERIE_SEGUNDA")
	private String serie2;
	
	@Column(name="SERIE_TERCERA")
	private String serie3;


	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	public String getDesOrden5() {
		return desOrden5;
	}

	public void setDesOrden5(String desOrden5) {
		this.desOrden5 = desOrden5;
	}

	public String getDesOrden6() {
		return desOrden6;
	}

	public void setDesOrden6(String desOrden6) {
		this.desOrden6 = desOrden6;
	}

	public String getDesOrden7() {
		return desOrden7;
	}

	public void setDesOrden7(String desOrden7) {
		this.desOrden7 = desOrden7;
	}

	public String getDesOrden8() {
		return desOrden8;
	}

	public void setDesOrden8(String desOrden8) {
		this.desOrden8 = desOrden8;
	}

	public String getDesOrden9() {
		return desOrden9;
	}

	public void setDesOrden9(String desOrden9) {
		this.desOrden9 = desOrden9;
	}

	public String getDesCaract1() {
		return desCaract1;
	}

	public void setDesCaract1(String desCaract1) {
		this.desCaract1 = desCaract1;
	}

	public String getDesCaract2() {
		return desCaract2;
	}

	public void setDesCaract2(String desCaract2) {
		this.desCaract2 = desCaract2;
	}

	public String getDesCaract3() {
		return desCaract3;
	}

	public void setDesCaract3(String desCaract3) {
		this.desCaract3 = desCaract3;
	}

	public String getDesCaract4() {
		return desCaract4;
	}

	public void setDesCaract4(String desCaract4) {
		this.desCaract4 = desCaract4;
	}

	public String getDesCaract5() {
		return desCaract5;
	}

	public void setDesCaract5(String desCaract5) {
		this.desCaract5 = desCaract5;
	}

	public String getDesCaract6() {
		return desCaract6;
	}

	public void setDesCaract6(String desCaract6) {
		this.desCaract6 = desCaract6;
	}

	public String getDesCaract7() {
		return desCaract7;
	}

	public void setDesCaract7(String desCaract7) {
		this.desCaract7 = desCaract7;
	}

	public String getDesCaract8() {
		return desCaract8;
	}

	public void setDesCaract8(String desCaract8) {
		this.desCaract8 = desCaract8;
	}

	public String getDesCaract9() {
		return desCaract9;
	}

	public void setDesCaract9(String desCaract9) {
		this.desCaract9 = desCaract9;
	}

	public String getDesCaract10() {
		return desCaract10;
	}

	public void setDesCaract10(String desCaract10) {
		this.desCaract10 = desCaract10;
	}

	public String getDesCaract11() {
		return desCaract11;
	}

	public void setDesCaract11(String desCaract11) {
		this.desCaract11 = desCaract11;
	}

	public String getDesCaract12() {
		return desCaract12;
	}

	public void setDesCaract12(String desCaract12) {
		this.desCaract12 = desCaract12;
	}

	public String getCodebarAuto() {
		return codebarAuto;
	}

	public void setCodebarAuto(String codebarAuto) {
		this.codebarAuto = codebarAuto;
	}

	public String getMinimo() {
		return minimo;
	}

	public void setMinimo(String minimo) {
		this.minimo = minimo;
	}

	public String getSerie1() {
		return serie1;
	}

	public void setSerie1(String serie1) {
		this.serie1 = serie1;
	}

	public String getSerie2() {
		return serie2;
	}

	public void setSerie2(String serie2) {
		this.serie2 = serie2;
	}

	public String getSerie3() {
		return serie3;
	}

	public void setSerie3(String serie3) {
		this.serie3 = serie3;
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
		IdentificadorExt other = (IdentificadorExt) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IdentificadorExt [identificador=" + identificador + ", desOrden5=" + desOrden5 + ", desOrden6="
				+ desOrden6 + ", desOrden7=" + desOrden7 + ", desOrden8=" + desOrden8 + ", desOrden9=" + desOrden9
				+ ", desCaract1=" + desCaract1 + ", desCaract2=" + desCaract2 + ", desCaract3=" + desCaract3
				+ ", desCaract4=" + desCaract4 + ", desCaract5=" + desCaract5 + ", desCaract6=" + desCaract6
				+ ", desCaract7=" + desCaract7 + ", desCaract8=" + desCaract8 + ", desCaract9=" + desCaract9
				+ ", desCaract10=" + desCaract10 + ", desCaract11=" + desCaract11 + ", desCaract12=" + desCaract12
				+ ", codebarAuto=" + codebarAuto + ", minimo=" + minimo + ", serie1=" + serie1 + ", serie2=" + serie2
				+ ", serie3=" + serie3 + "]";
	}	
	
	
	
}
