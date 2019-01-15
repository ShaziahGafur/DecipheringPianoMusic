
public class acsharpeInfinity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 new acsharpeInfinity ();
		
	
	}
	
	public acsharpeInfinity ()
    {

		
		//int bin =2000;
		double[] sample = new double[100];//frequency values start 20, increment by 20, for 100 times
		
		for (int i=0; i<sample.length; i++){
			double m = (20*(((double)i)+1))/1100.00;
			sample[i] = yValue(m);
			
		}
		
		double [][]bins = new double[2][sample.length];
		
		for (int i=0; i<sample.length; i++){
			System.out.println(sample[i]);
		}
		
		double sum=0;
		//cosine function
		/*for (int i =20; i<=2000; i+=20){//i needs to represents bin value 
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.cos(((double)(-2*(Math.PI)*i*((j+1)*20)))/((double)(sample.length)) );
					
			}
			bins[0][((i-20)/20)]=sum;
			System.out.println ("X bin "+i+" = "+bins[0][(i-20)/2000]+" (R)");
			sum=0;
		}	
		*/
		for (int j=0; j<sample.length; j++){ //bin value = (j+1)*20
			
			for (int i=1; i<=2000; i++){
				//calculate sum for each bin 
			
				sum+=yValue(((double)i)/((double)1100)) *Math.cos( (double)(-2*(Math.PI)*((j+1)*20)*i ) / ((double)(sample.length)));
				
			}
			if (sum<0.00001)
				sum=0;
			bins[0][j]=sum;
			System.out.println ("X bin "+((j+1)*20)+" = "+bins[0][j]+"\t\t(R)");
			sum=0;
		}
		
		
		
		
		sum=0;
		System.out.println("\n\nImaginary Components\n");
		//calculating imaginary component (sine function)
		/*for (int i =20; i<=2000; i+=20){
			for (int j=0; j<sample.length; j++){//j = index of sample array
				sum+=sample[j]*Math.sin(((double)(-2*(Math.PI)*i*((j+1)*20)))/((double)(sample.length)));
					
			}
			bins[1][((i-20)/20)]=sum;
			
			System.out.println ("X bin "+i+" = "+sum+"i");
			sum=0;
		}
		*/
		 
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