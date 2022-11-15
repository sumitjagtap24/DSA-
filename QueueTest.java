package array;

public class QueueTest {

	public static void main(String[] args) {

			MyQueue que = new MyQueue(5);
			que.add(10);
			que.add(20);
			que.add(30);
			que.add(40);
			que.add(50);
//			que.add(60);

			System.out.println("Removing elements one by one: ");
			System.out.println(que.remove());
			System.out.println(que.remove());
			System.out.println(que.remove());
			System.out.println(que.remove());
			System.out.println(que.remove());
			System.out.println(que.remove());
//			System.out.println(que.remove());

			

	}

} 	
	 class QueueCapacityExceededException extends RuntimeException{
		 QueueCapacityExceededException(String str) {
			 super(str);}
}
	 class RunTimeException extends RuntimeException{
		 RunTimeException(String str){
			 super(str);
	}
}
	class MyQueue
	{
		int front = -1;
		int index= -1;
		int length;
		int array[];
		
		MyQueue(int length){
			this.length = length;
			array  = new int [length];
			
		}
		void add(int item) {
					if(index > length - 2) {
			throw new QueueCapacityExceededException ("Queue is full ");
		}
					array [++index] = item;
					System.out.println("Adding: " +item + " at index : " + index);

		}
		 
		int remove() {
			//return array [ length - (index--) - 1];
			if(front > index - 1) {
				throw new RunTimeException ("Rear reached ");
			}
			return array [ ++front];
		}
	}
	
	
	
	
	