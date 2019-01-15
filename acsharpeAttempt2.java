//import java.util.Scanner;
//package com.javatutorialhq.java.examples;

public class acsharpeAttempt2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 new acsharpeAttempt2 ();
		
	
	}
	
	public acsharpeAttempt2 ()
    {	 
		int bin =2000; 
		double[] sample = new double[2000];//frequency values start 20, increment by 20, for 100 times
		
		for (int i=0; i<sample.length; i++){
			double m = (((double)i)+1.00)/220000.00;
			sample[i] = yValue(m);
			System.out.println("Value #"+i+" "+sample[i]);
		}
		
		System.out.println("\n");
		double [][]bins = new double[2][sample.length];
		
		double sum=0;
		//calculating real component (cosine function) 
		for (int i =0; i<bin; i++){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.cos(-2*(Math.PI)*(i+1)*(j+1)/((double)(sample.length) ));
					
			}
			bins[0][i]=sum;
			System.out.println ("X bin "+(i+1)+" = "+sum+" (real)");
			sum=0;
		}
		
		sum=0;
		System.out.println("\n\nImaginary Components");
		//calculating imaginary component (sine function)
		for (int i =0; i<bin; i++){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.sin(-2*(Math.PI)*(i+1)*(j+1)/((double)(sample.length)));
					
			}
			bins[1][i]=sum;
			System.out.println ("X bin "+(i+1)+" = "+sum+"i");
			sum=0;
		}
		
		
		double mag=0;
		//calculating magnitude
		for (int i=0;i<sample.length; i++){
			mag=Math.pow(bins[0][i],2);
			mag+=Math.pow(bins[1][i],2);
			mag=Math.sqrt(mag);
			//System.out.println("Bin #: "+i+" Mag. ="+mag);
			mag=0;
		}
		
		
    }
	
	public double yValue (double m){
		
		return (Math.sin(880*m*(Math.PI)))+ (Math.sin(1100*m*(Math.PI))) +(Math.sin(1320*m*(Math.PI)));
	}
}