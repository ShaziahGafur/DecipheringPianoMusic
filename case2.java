//import java.util.Scanner;
//package com.javatutorialhq.java.examples;

public class case2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 new case2 ();
		
	
	}
	
	public case2 ()
    {	 
		int bin =8;
		//sample values used
		double[] sample = new double[] {0, 1.7071, 1, -0.2929, 0, 0.2929, -1, -1.7071}; 
		
		
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