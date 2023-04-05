package 큐;

public class IntArrayQueue {
	private int[] que;
	private int capacity;
	private int num;
	
	//큐가 비어있을 때
	public class EmptyIntArrayQueueException extends RuntimeException {
		public EmptyIntArrayQueueException () {}
	}
	
	//큐가 가득 찼을 때
	public class OverflowIntArrayQueueException extends RuntimeException {
		public OverflowIntArrayQueueException () {}
	}
	
	//클래스 생성자
	public IntArrayQueue(int maxlen) {
		capacity = maxlen;
		num = 0;
		try {
			que = new int[maxlen];
		} catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	//인큐 메소드
	public int enQueue(int x) throws OverflowIntArrayQueueException {
		if(num>=capacity) 
			throw new OverflowIntArrayQueueException();
		return que[num++] = x; 
	}
	
	//디큐 메소드
	public int deQueue() throws EmptyIntArrayQueueException {
		if(num<=0)
			throw new EmptyIntArrayQueueException();
		int dequeue = que[0];
		for(int i=0; i<num-1; i++)
			que[i] = que[i+1];
		num--;
		return dequeue;
	}
	
	public int peek() throws EmptyIntArrayQueueException {
		if(num<=0)
			throw new EmptyIntArrayQueueException();
		return que[0];
	}
	
	public void clear() {
		num = 0;
	}

	public static void main(String[] args) {
		IntArrayQueue iq = new IntArrayQueue(10);
		iq.enQueue(10);
		iq.enQueue(20);
		iq.enQueue(30);
		
		System.out.println(iq.deQueue());
		System.out.println(iq.deQueue());
		System.out.println(iq.deQueue());
		System.out.println(iq.deQueue());
		System.out.println(iq.deQueue());
	}
}
