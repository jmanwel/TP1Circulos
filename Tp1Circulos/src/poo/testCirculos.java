package poo;

import org.junit.Assert;
import org.junit.Test;

public class testCirculos {

	@Test // se crean los circulos y se validan sus radios 
	public void radioCorrecto() { 
		// radio 2 
		Circulo circulo = new Circulo(2.00);
	    Assert.assertEquals(1.00, circulo.mostrarRadio(), 2); 
	    System.out.println("El radio del circulo es "+circulo.mostrarRadio());
	    // radio 3.7
	    circulo = new Circulo(3.70); 
	    Assert.assertEquals(3.70,circulo.mostrarRadio(),2); 
	    System.out.println("El radio del circulo es "+circulo.mostrarRadio());
	    // radio 5 
	    circulo = new Circulo(5.00);
	    Assert.assertEquals(4.00, circulo.mostrarRadio(),2); 
	    System.out.println("El radio del circulo es "+circulo.mostrarRadio());
	    // radio 10.9
	    circulo = new Circulo(10.90); 
	    Assert.assertEquals(10.90,circulo.mostrarRadio(),2);
	    System.out.println("El radio del circulo es "+circulo.mostrarRadio());
	    System.out.println("///////////////////////////");
	  }
    @Test // se crean los circulos y se validan sus perimetros según formula
	public void perimetroCorrecto() {
		Circulo circulo = new Circulo(9.80);
		Assert.assertEquals(61.54, circulo.calcularPerimetro(), 2);
		System.out.println("El perimetro del circulo es "+circulo.calcularPerimetro());
		circulo  = new Circulo(16.60);
		Assert.assertEquals(104.24, circulo.calcularPerimetro(), 2);
		System.out.println("El perimetro del circulo es "+circulo.calcularPerimetro());
	}
}
