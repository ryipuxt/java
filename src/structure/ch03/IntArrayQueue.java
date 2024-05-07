package structure.ch03;

public class IntArrayQueue {

	private int[] array;
	private int front; // 큐의 시작 지점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수

	public IntArrayQueue(int capacity) {
		this.capacity = capacity;
		array = new int[this.capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// 편의 기능 만들어 보기
	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// TODO - 1 데이터 넣기 기능 구현
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("큐 메모리 공간이 가득 참.");
		} else {
			rear++;
			array[rear] = item;
			size++;
		}
	}

	// TODO - 2 데이터 꺼내기
	public int dequeue() {
		int item = 0;
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없음");
		} else {
			// 잠시 데이터 꺼내 보기
			item = array[front]; // 0번째 요소에 접근
			// 100, 200, 300
			// f - 0 (첫 꺼낼 시)
			for (int i = front; i < rear; i++) { // 0 < 2
				// array[0] = array[1];
				// 200, 200, 300 -- for : 1번 동작
				// 200, 300, 300 -- for : 2번 동작
				array[i] = array[i + 1];
			}
			// 200, 300, 0
			// 마지막 요소를 초기화 처리 한다.
			array[rear] = 0;
			rear--;
			size--;
		}
		return item;
	}

	// TODO - 3 데이터 찾기
	public int peek() {
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
			return -9999;
		} else {
			int item = array[front];
			return item; // 수정
		}

	}

	public static void main(String[] args) {
		IntArrayQueue queue = new IntArrayQueue(3);

		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);

		// 데이터 꺼내고 삭제 처리
		// queue.dequeue();

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		// System.out.println(queue.dequeue());
		
		System.out.println("---------------------");

		System.out.println(queue.peek());
	}
}
