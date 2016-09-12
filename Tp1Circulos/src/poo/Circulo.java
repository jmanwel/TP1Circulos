package poo;

public class Circulo {

	private double radio;//parametro radio
	
	//constructor
	public  Circulo(double radio1){
		this.radio = radio1;
	}
	//metodo para calcular el perimetro
	public double calcularPerimetro(){
		return Math.PI*2*this.radio;
	}
	//getter
	public double mostrarRadio(){
		return this.radio;
	}
}