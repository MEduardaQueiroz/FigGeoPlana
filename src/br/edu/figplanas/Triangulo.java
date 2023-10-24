package br.edu.figplanas;

public class Triangulo extends figGeoPlana{
    //Atributos
	private double base;
	private double altura;
	public Triangulo() {
		base = 0;
	    altura = 0;
	    area = 0;
	}
    public void CalArea() {
        area = (base*altura)/2;
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
 
