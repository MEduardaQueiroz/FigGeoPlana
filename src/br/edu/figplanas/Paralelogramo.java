package br.edu.figplanas;

public class Paralelogramo extends figGeoPlana {
	private double altura;
	private double base;
	public Paralelogramo(){
		altura = 0;
		base = 0;
		area = 0;
	}
	public void CalArea() {
    	area = base*altura;
    	
    }

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
}
