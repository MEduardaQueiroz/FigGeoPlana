package br.edu.principal;

import java.util.Scanner;

import br.edu.figplanas.Circulo;
import br.edu.figplanas.Paralelogramo;
import br.edu.figplanas.Quadrado;
import br.edu.figplanas.Retangulo;
import br.edu.figplanas.Trapezio;
import br.edu.figplanas.Triangulo;
import br.edu.figplanas.TrianguloEquilatero;
import br.edu.figplanas.losango;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		
		Triangulo t1 = new Triangulo();
		t1.setAltura(4);
		t1.setBase(12);
		t1.CalArea();
	    System.out.println("A area do trangulo é: "+t1.getArea());
		
		Quadrado  q1 = new Quadrado();
		q1.setLado(10);
		q1.calarea();
		System.out.println("A area do quadrado é: "+q1.getArea());

		Trapezio tra = new Trapezio();
		tra.setBaseMaior(6);
		tra.setBaseMenor(4);
		tra.getAltura();
		tra.calAreaaTra();
		System.out.println("A area do quadrado é: "+tra.getArea());
		
		
		losango losan = new losango();
		losan.setDiagonalMaior(4);
		losan.setDiagonalMenor(5);
		losan.CalArea();
		System.out.println("A area do losango é: "+ losan.getArea());
	
		Retangulo ret = new Retangulo();
		ret.CalAreaRet();
		ret.setAltura(5);
		ret.setBase(6);
		System.out.println("A area do Retangulo é: "+ ret.getArea());
		
		Paralelogramo gramo = new Paralelogramo();
		gramo.CalArea();
		gramo.setAltura(8);
		gramo.setBase(3);
		System.out.println("A area do Paralelogramo é: "+ gramo.getArea());
		
		TrianguloEquilatero equi = new TrianguloEquilatero();
		equi.CalArea();
		equi.setAltura(7);
		equi.setLado(9);
		System.out.println("A area do TrianguloEquilatero é: "+ equi.getArea());
		
		Circulo cir = new Circulo();
		cir.CalArea();
		cir.setRaio(8);
		System.out.println("A area do Circulo é: "+ cir.getArea());
		
	
		}

}
