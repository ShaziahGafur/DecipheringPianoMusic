
public class acsharpeAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 new acsharpeAll ();
		
	
	}
	
	public acsharpeAll ()
    {

		double[] sample = new double[2000];//frequency values start 20, increment by 20, for 100 times
		
		for (int i=0; i<sample.length; i++){
			sample[i] = ((double)i)/1100.00;
			
		}
		
		double [][]bins = new double[2][sample.length];
		 
		for (int i=0; i<sample.length; i++){
			System.out.println("Sample pt #"+i+": \t"+sample[i]);
		}
		
		double sum=0;
		//cosine function
		for (int i =0; i<sample.length; i++){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=((sample[j]*Math.cos( (double)(-2*(Math.PI)*  j*  i) ) / ((double)(sample.length)) ));
					
			}
			bins[0][i]=sum;
			System.out.println ("X bin "+i+" = "+bins[0][i]+" (R)");
			sum=0;
		}	
		
		sum=0;
		System.out.println("\n\nImaginary Components");
		//calculating imaginary component (sine function)
		for (int i =0; i<sample.length; i++){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.sin(-2*(Math.PI)*i*j/((double)(sample.length)));
					
			}
			bins[1][i]=sum;
			System.out.println ("X bin "+i+" = "+sum+"i");
			sum=0;
		}
		double mag=0;
		System.out.println("//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\");
		//calculating magnitude
		for (int i=0;i<sample.length; i++){
			mag=Math.pow(bins[0][i],2);
			mag+=Math.pow(bins[1][i],2);
			mag=Math.sqrt(mag);
			System.out.println(mag);
			mag=0;
		}
		
		
		
    }
}