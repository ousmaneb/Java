public class ArrExample {

	public static void main(String[] args){
		//int N = Integer.parseInt(args[0]);
		
		int N=9;
		double[] a = new double[N];
		for (int i=0; i<N; i++) {
			a[i]=Math.random();
		}
		
		System.out.println();		
		System.out.println("a[i]");
		System.out.println("------------------------");
		for (int i=0; i<N; i++){
			System.out.println(a[i]);
		}

		System.out.println();
		System.out.println("a = "+a);
		System.out.println();
		
		double max = Double.NEGATIVE_INFINITY;
		//double max=0;

		for (int i=0; i<N; i++) {
			if (a[i] > max) max = a[i];
		}
		System.out.println("max = "+max);

		double sum=0.0;
		for (int i=0; i<N; i++){
			sum +=a[i];
		}
		System.out.println("average = "+sum/N);

		double[] b= new double[N];
		for (int i=0; i<N; i++) {
			b[i]=a[i];
		}
		
		for (int i=0; i<N; i++){
                	System.out.println(b[i]);
                }

		for (int i=0; i<N/2; i++){
			double temp=b[i];
			b[i] = b[N-i-1];
			b[N-i-1]=temp;
		}

		
		// print array values, one per line
        	System.out.println();
        	System.out.println("b[]");
        	System.out.println("-------------------");
        	for (int i = 0; i < N; i++) {
            		System.out.println(b[i]);
        	}
        	System.out.println();


        	// dot product of a[] and b[]
        	double dotProduct = 0.0;
        	for (int i = 0; i < N; i++) {
            		dotProduct += a[i] * b[i];
        	}
        System.out.println("dot product of a[] and b[] = " + dotProduct);
	


	}
}
