
public class IsPrime {

		public static boolean go(int[] ray)
		{
			
			boolean isPrime = false;
			for(int i = 0; i < ray.length; i++)
			{
				if(ray[i] % 2 != 0 || ray[i] % 3 != 0 || ray[i] % 5 != 0 || ray[i] % 7 != 0)
				{
					isPrime = true;
					break;
				}
			}
			
			return isPrime;
		}

	public static void main(String[] args) {
		System.out.println( IsPrime.go( new int[]{1, 2, 3, 4, 5} ) ;	

	}

}

