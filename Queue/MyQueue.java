package Queue;

public class MyQueue {

	// Linear Queue implementation
	private int[] data;
	private int start;
	private int p;

	public MyQueue() {
		data = new int[5];
		start = 0;
		p = 0;
	}

	public boolean enqueue(int x) {

		data[p] = data[x];
		return true;

	}

	public boolean Dequeue() {

		if (start == data.length) {
			return false;
		}
		start++;
		return true;
	}

	public int getFront() {
		return data[start];
	}

	public boolean isEmpty() {
		if (start >= data.length) {
			return true;
		}
		return false;
	}

	public class Main {
		public static void main(String[] args) {
			MyQueue q = new MyQueue();
			q.enqueue(5);
			q.enqueue(3);
			

		}
	}

}
