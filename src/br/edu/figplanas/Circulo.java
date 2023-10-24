package br.edu.figplanas;

public class Circulo extends figGeoPlana{
	private double raio;
	
	public Circulo() {
		raio = 0;
		area = 0;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getArea() {
		return area;
	}
	public void CalArea() {
    	area = 3.1418*Math.pow(raio,2);
    }
}
