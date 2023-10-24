package br.edu.figplanas;

public class Quadrado extends figGeoPlana{
	private double lado;
	public Quadrado() {
		lado = 0;
		area = 0;
	}
    public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getArea() {
		return area;
	}
	public void calarea() {
    	area = Math.pow(lado,2);
    }
}
