package array;

public class RecursionTest2 {
	public static void emptyVase(int flowerInVase) {
		if(flowerInVase > 0) {
			
			emptyVase(flowerInVase - 1);
			System.out.println(">"+flowerInVase);
		}
		else {
			//nothing...
		}
	}
	public static void main(String[] args) {
		emptyVase(7);
	}
}


