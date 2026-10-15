        package Methods;

        public class Main {
	    //Question 1//
		static String hello(String name)
		{
			return name;
		}
		
		//Question 2//
		static float add(float v1,float v2)
		{
			return v1+v2;
		}
		
		//Question 3//
		static int subtraction(int a, int b)
		{
			return a-b;
		}
		
		//Question 4//
		static int multiplication(int a, int b)
		{
			return a*b;
		}
		
		//Question 5//
		static int division(int a, int b)
		{
			return a/b;
		}
			//Question 7//
	    int calculateTotalCricketBalls(int children,int balls)
	   {
		return children*balls;
	}

		//Question 6//
		static int modulus(int a, int b)
		{
			return a%b;
		}
		
		//Question 7//
		int calculateTotalCricketBalls(int children,int balls)
		{
			return children*balls;
		}
		
		
	    public static void main(String[] args) {
	    	System.out.println("Question 1");
			hello("Hello Aanya");
			System.out.println(hello("Hello ANSH"));
			
			
			System.out.println("Question 2");
			add(10.2f,12.5f );
			System.out.println(add(10.2f,12.5f ));
			
			System.out.println("Question 3");
			subtraction(5, 10);
			System.out.println(subtraction(5, 10));
			
			
			System.out.println("Question 4");
			multiplication(45,50);
			System.out.println(multiplication(45,50));
			
			System.out.println("Question 5");
			division(2, 10);
			System.out.println(division(10,2));
		

	}

}
