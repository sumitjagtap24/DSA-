package array;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryGapTest {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		System.out.println("enter number :"  );
//		Scanner sc1 = new Scanner(System.in);
//		int N2 = sc1.nextInt();
//		System.out.println("binary number :"  + N);

		

		int count = solution.SolveThis(1048);
	System.out.println("max 0 count is :"  + count);
	
	int count1 = solution.SolveThis(100);
	System.out.println("max 0 count is :"  + count1);
	
	int count2 = solution.SolveThis(1041);
	System.out.println("max 0 count is :"  + count2);
	}
	class solution{
		public static int SolveThis(int N) {                              // 1. store the number into N
			String binaryRepresentation = Integer.toBinaryString(N);     // 2. convert N into binary form
			System.out.println(N + " Binary : " + binaryRepresentation );
			int longestGap=0;         
			ArrayList<Integer> oneList = new ArrayList<Integer>();      // 3. find out the position of 1 skip o 
			for(int i=0; i<binaryRepresentation.length(); i++) {
				if(binaryRepresentation.charAt(i)=='0')
				{
					continue;
				}
				oneList.add(i);                                        //4. store the position into array list
			}
			for(int i=0;i<oneList.size()-1; i++) {                     // 5. walk through array list and find out index number
				int indicesDiff = oneList.get(i+1) - oneList.get(i) - 1;  // 6. find out the  indices difference   
				longestGap = Math.max(longestGap, indicesDiff);         // 7. compare length with indices difference
				
																				
			}
			return longestGap;
		}
	}

}
