package array;

public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
FactorialTest fact = new FactorialTest();
		
		long answer = fact.findFactorialAgain(5); //1st call
		System.out.println("factorial : "+answer);
		

	}

}


class FactorialTest
{
	long findFactorial(int num) { // 5 = 5 x 4 x 3 x 2 x 1
		
		long factorial = 1;
		
		while(num > 0 ) {
			factorial = factorial * num;
			num--;
		}
		return factorial;
	}
	
	
	long findFactorialAgain(int num) { // 5 = 5 x 4 x 3 x 2 x 1
		
		if(num==0) 
			return 1 ;
		else  {
			//System.out.println("num "+num);
			//answer =(num * findFactorialAgain (num-1)) ;
			//System.out.println("answer "+answer);
			long ans = num * findFactorialAgain (num-1) ;
			System.out.println("ans : "+ans);
			return ans;
		}
	}

}
