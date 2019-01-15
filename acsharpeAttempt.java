
public class acsharpeAttempt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 new acsharpeAttempt ();
		
	
	}
	
	public acsharpeAttempt ()
    {

		
		//int bin =2000;
		double[] sample = new double[100];//frequency values start 20, increment by 20, for 100 times
		
		for (int i=0; i<sample.length; i++){
			double m = (((double)i)+1.00)/11000.00;
			sample[i] = yValue(m);
			System.out.println("Value #"+i+" "+sample[i]);
		}
		
		
		double [][]bins = new double[2][sample.length];
		
		
		double sum=0;
	
		for (int j=0; j<sample.length; j++){ //bin value = (j+1)*20
			
			for (int i=1; i<=2000; i++){
				//calculate sum for each bin 
			
				sum+=yValue(((double)i)/((double)220000)) *Math.cos( (double)(-2*(Math.PI)*((j+1)*20)*i ) / ((double)(sample.length)));
				
			}
			if (sum<0.000000000001)
				sum=0;
			bins[0][j]=sum;
			System.out.println ("X bin "+((j+1)*20)+" = "+bins[0][j]+"\t\t(R)");
			sum=0;
		}
		
		
		
		
		sum=0;
		System.out.println("\n\nImaginary Components\n");
		//calculating imaginary component (sine function)
		
		for (int j=0; j<sample.length; j++){ //bin value = (j+1)*20
			
			for (int i=1; i<=2000; i++){
				//calculate sum for each bin 
			
				sum+=yValue(((double)i)/((double)1100)) *Math.sin( (double)(-2*(Math.PI)*((j+1)*20)*i ) / ((double)(sample.length)));
				
			}
			if (sum<0.00001)
				sum=0;
			bins[1][j]=sum;
			System.out.println ("X bin "+((j+1)*20)+" = "+bins[1][j]+"\t\t(I)");
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
	
	
	public double yValue (double m){
	
		return (Math.sin(880*m*(Math.PI)))+ (Math.sin(1100*m*(Math.PI))) +(Math.sin(1320*m*(Math.PI)));
	}
}