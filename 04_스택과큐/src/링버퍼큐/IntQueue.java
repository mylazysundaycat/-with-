package 링버퍼큐;

public class IntQueue {
	private int[] que;
	private int capacity; // 용량
	private int front;
	private int rear;
	private int num; // 현재 데이터 갯수
	
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}

	public IntQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		
		try {
			que = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueueException {
		if (num>=capacity) 
			throw new OverflowIntQueueException();
		que[rear++]=x;
		num++;
		if(rear==capacity)
			rear=0;
		return x;
	}
	
	public int deque() throws EmptyIntQueueException {
		if(num<=0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == capacity)
			front = 0;
		return x;
	}
	
	
	//피크 메소드, 프론트 데이터를 들여다봄
	public int peek() throws EmptyIntQueueException {
		if (num<0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	
	//큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	//큐에서 x를 검색하여 인덱스(찾지못하면 -1)를 반환
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i+front)%capacity;
			if(que[idx]==x)
				return idx;
		}
		return -1;
	}
}
