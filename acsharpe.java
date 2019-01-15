
public class acsharpe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 new acsharpe ();
		
	
	}
	
	public acsharpe ()
    {

		
		int bin =10;
		double[] sample = new double[] {0.00, 1.00/1100.00, 2.00/1100.00, 3.00/1100.00, 4.00/1100.00, 5.00/1100.00, 6.00/1100.00, 7.00/1100.00, 8.00/1100.00, 9.00/1100.00};
		
		double [][]bins = new double[2][sample.length];
		
		for (int i=0; i<sample.length; i++){
			System.out.println(sample[i]);
		}
		
		double sum=0;
		//cosine function
		for (int i =0; i<bin; i++){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.cos(-2*(Math.PI)*i*j/(sample.length));
					
			}
			bins[0][i]=sum;
			System.out.println ("X bin "+i+" = "+bins[0][i]+" (R)");
			sum=0;
		}	
		
		sum=0;
		System.out.println("\n\nImaginary Components");
		//calculating imaginary component (sine function)
		for (int i =0; i<bin; i++){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.sin(-2*(Math.PI)*i*j/(sample.length));
					
			}
			bins[1][i]=sum;
			System.out.println ("X bin "+i+" = "+sum+"i");
			sum=0;
		}
		double mag=0;
		
		//calculating magnitude
		for (int i=0;i<sample.length; i++){
			mag=Math.pow(bins[0][i],2);
			mag+=Math.pow(bins[1][i],2);
			mag=Math.sqrt(mag);
			System.out.println("Bin #: "+i+" Mag. ="+mag);
			mag=0;
		}
		
		
		
    }
}