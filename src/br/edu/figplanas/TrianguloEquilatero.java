package br.edu.figplanas;

public class TrianguloEquilatero extends figGeoPlana {
	private double lado;
	private double altura;
	public TrianguloEquilatero(){
		lado = 0;
		altura = 0;
		area = 0;
	}
	public void CalArea() {
    	area = (Math.pow(lado,3)*Math.sqrt(3))/4;
    }
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
