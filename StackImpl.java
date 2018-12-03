
public class StackImpl implements Stack {

	private int Stacksize = 0;
	private node Head = null;
	@Override
	public void Push(Object x) {
		node temp = new node(x,Head);
		Head = temp;
		Stacksize++;
	}

	@Override
	public Object Pop() {
	
	if(Stacksize > 0 )
		{
		node pop = Head;
		Head = pop.getNext();
		return pop.getObject();
		}
	
		return null;
	}

	@Override
	public Object Top() {
		if(Stacksize > 0)
			{	
				return Head.getObject
						();
			}
		return null;
	}

	@Override
	public int Length() {
		return Stacksize;
	}
	
	
	private class node {
		
		private node next = null;
		private Object thisObject = null;
		public node(Object x, node next)
		{
			this.thisObject = x;
			this.next = next;
		}
		
		public node getNext()
		{
			return next;
		}
		
		public Object getObject()
		{
			return thisObject;
		}
		
		
		
	}

}
