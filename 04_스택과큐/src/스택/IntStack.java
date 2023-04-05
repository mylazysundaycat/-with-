package 스택;

public class IntStack {
	private int[] stk;
	private int capacity;
	private int ptr;
	
	//예외: 스택이 비어있는 경우
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//예외: 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	//생성자
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		} catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	//푸시
	public int push(int x) throws OverflowIntStackException {
		if(ptr>=capacity) //스택이 가득 찬경우
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	//팝(마지막에 들어온 데이터를 제거하고 해당 값 반환]
	public int pop() throws EmptyIntStackException {
		if (ptr<=0) //스택이 비어있는 경우
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	//피크(꼭대기를 들여다봄)
	public int peek() throws EmptyIntStackException {
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int indexOf(int x) {
		for (int i = ptr-1; i>=0; i--)
			if(stk[i]==x)
				return i;//검색성공
		return -1;//검색실패
	}
	
	public int getCapacity() {
		return capacity;
	}
}
