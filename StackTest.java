package array;

public class StackTest {

	public static void main(String[] args) {
		MyStack theStack = new MyStack(5);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
	//	theStack.push(60);

		System.out.println("==> element of the top :" +theStack.peek() );
		System.out.println(theStack.pop());
		System.out.println("==> element of the top :");
		
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println("==> element of the top :");

		System.out.println(theStack.pop());
	//	System.out.println(theStack.pop());


		
	}
}

	class MyStackOverflowException extends RuntimeException{
		MyStackOverflowException(String str) {
		 super(str);}
}
	class MyStackEmptyException extends RuntimeException{
		MyStackEmptyException(String str){
			super(str);
		}
	}
	
	class MyStack{
		int index = -1;
		int top ;
		int size;
		int array [];
		
		
		MyStack(int size){
			System.out.println("MyStack created with ");
			this.size = size;
				array = 	new int[ size ];
		}
		
		void push(int item) {
			System.out.println("pushing " +item +" to Stack");
			if(index > size - 2) {
				throw new MyStackOverflowException ("Stack size is overflow");
				
			}
			array[++index] = item;
			top = index;
		}
		
		int pop(){
			System.out.println("Popping from the stack");
			if(index<0)
			{
				throw new MyStackEmptyException("Stack is Empty...");
			}
			
			return array [index--];
			
		}
		int peek() {
			return array [index];
		}
		
	}
	


