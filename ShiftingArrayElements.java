package array;

import java.util.Arrays;

public class ShiftingArrayElements {

	public static void main(String[] args) {
		int SA [] = {1,2,3,4};  
		int k = 3;
		System.out.println(Arrays.toString(SA));
		int rotatedArray [] = RotationTest.solution(SA, k);
		System.out.println(Arrays.toString(rotatedArray));

		
	}
	
	class RotationTest{
		public static int[] solution(int sourceArray[], int k)
		{
			int targetArray [] = new int [ sourceArray.length];
			for(int i=0; i<sourceArray.length; i++) {
			int rotationIndex = (i+k) % sourceArray.length;
			targetArray [rotationIndex]= sourceArray[i];
			
			}
			return targetArray;
		}
	//int sourceArray [] = {3,8,6,9,4};
}
}