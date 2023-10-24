package br.edu.figplanas;

public class losango extends figGeoPlana{
	private double DiagonalMaior;
	private double DiagonalMenor;
	public losango() {
		DiagonalMaior = 0;
		DiagonalMenor = 0;
		area = 0;
	}
	 public double getDiagonalMaior() {
		return DiagonalMaior;
	}
	public void setDiagonalMaior(double diagonalMaior) {
		DiagonalMaior = diagonalMaior;
	}
	public double getDiagonalMenor() {
		return DiagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		DiagonalMenor = diagonalMenor;
	}
	public double getArea() {
		return area;
	}
	public void CalArea() {
	    	area = (DiagonalMaior*DiagonalMenor)/2;
	    }
	

}
