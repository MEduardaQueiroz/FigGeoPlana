package br.edu.figplanas;

public class Retangulo extends figGeoPlana{
	private double base;
	private double altura;
	
	public Retangulo(){
		base = 0;
	    altura = 0;
	    area = 0;
	}
	 public void CalAreaRet () {
	    	area = base*altura;
	    }
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArea() {
		return area;
	}

}
