//import java.util.Scanner;
//package com.javatutorialhq.java.examples;

public class fourier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 new fourier ();
		
	
	}
	
	public fourier ()
    {	 
		int bin =8;
		double[] sample = new double[] {0, 0.707, 1, 0.707, 0, -0.707, -1, -0.707};
		
		System.out.println ("Sample Values Used:");
		for (int i=0; i<sample.length; i++){
			System.out.println(sample[i]);
		}
		
		System.out.println("\n");
		
		double sum=0;
		//calculating real component (cosine function) 
		for (int i =0; i<bin; i++){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.cos(-2*(Math.PI)*i*j/(sample.length));
					
			}
			System.out.println ("X bin "+i+" = "+sum+" (real)");
			sum=0;
		}
		
		sum=0;
		System.out.println("\n\nImaginary Components");
		//calculating imaginary component (sine function)
		for (int i =0; i<bin; i++){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.sin(-2*(Math.PI)*i*j/(sample.length));
					
			}
			System.out.println ("X bin "+i+" = "+sum+"i");
			sum=0;
		}
		
		
		
    }
	
}