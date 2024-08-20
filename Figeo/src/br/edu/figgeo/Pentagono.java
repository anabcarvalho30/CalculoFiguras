package br.edu.figgeo;

public class Pentagono{
	
	public double apotema;
	public double lado;
	public double area;
	
	public void calcArea() {
		area = ((lado*apotema)/2)*5;
	System.out.println(area);
	}
	
}
