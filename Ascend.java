// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int lim = Integer.parseInt(args[0]);
		int a = ((int)(Math.random() * lim));
		int b = ((int)(Math.random() * lim));
		int c = ((int)(Math.random() * lim));

		//Finds largest number
		 int max = Math.max((int) a,(int) b);
		 int tempMax = max;
		 max = Math.max(tempMax, (int) c);

		 //Finds smallest number
		 int min = Math.min((int) a,(int) b);
		 int tempMin = min;
		 min = Math.min(tempMin, (int) c);

		 //Finds the middle number
		 int mid = a + b + c - max - min;

		 System.out.println(a + " " + b + " " + c);
		 System.out.println(min + " " + mid + " " + max);
		 

		
	}
}
