//import java.util.Scanner;
//package com.javatutorialhq.java.examples;

public class simple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 new simple ();
		
	
	}
	
	public simple ()
    {	 
		int bin =20;
		//sample values used
		double[] sample = new double[] {0, 2.9021, 0, -2.1756,	0, 1, 0, 0.1756, 0,	-0.9021, 0, 0.9021, 0, -0.1756,	0, -1, 0, 2.1756, 0, -2.9021}; 
		
		
		System.out.println("\n");
		
		double sum=0;
		//calculating real component (cosine function) 
		for (int i =0; i<bin; i++){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.cos(-2*(Math.PI)*i*j/(double)(sample.length));
					
			}
			System.out.println ("X bin "+i+" = "+sum+" (real)");
			sum=0;
		}
		
		sum=0;
		System.out.println("\n\nImaginary Components"); 
		//calculating imaginary component (sine function)	
		for (int i =0; i<bin; i++){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.sin(-2*(Math.PI)*i*j/(double)(sample.length));
					
			}
			System.out.println ("X bin "+i+" = "+sum+"i");
			sum=0;
		}
		
		
		
    }
	

}