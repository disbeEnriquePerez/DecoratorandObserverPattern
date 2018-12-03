
public class StackObserver2 {
	
	StackImpl stack = null;
	
		public StackObserver2(StackImpl stack)
			{
				this.stack = stack;
			}
		
		public void add_Object()
			{
				stack.Push(new Object());
				System.out.println("Object was added to the stack");
			}
		
		public void pop()
			{
				Object x = stack.Pop();
				
				System.out.println(x + "Object was removed");
			}

}
