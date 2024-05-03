package structure;

public class MyArrayStack {

	int top; // 스택의 최상위 요소를 가리킴
	TencoIntArray arrayStack;

	public MyArrayStack() {
		top = 0; // 스택 포인터 초기화
		arrayStack = new TencoIntArray(); // 배열 칸 10개 생성
	}

	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new TencoIntArray(size);
	}

	// 스택의 크기(요소갯수)를 반환
	public int getSize() {
		return top;
	}

	// 스택이 비어있는지 확인
	public boolean isEmpty() {
		return top == 0;
	}

	// 스택의 요소가 가득 찼는지 확인 메서드를 만들어 보자.
	public boolean isFull() {
		return top == arrayStack.ARRAY_SIZE;
	}

	// 스택의 모든 요소를 출력
	public void printAll() {
		arrayStack.printAll();
	}

	// 스택에 데이터를 추가하는 기능
	public void push(int data) {
		// 방어적 코드 작성
		if (isFull()) {
			System.out.println("메모리가 가득 참");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}

	// 스택에서 데이터를 제거하고 반환하는 메서드
	public void pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		}
		System.out.println("Log 1 : " + (top - 1));
		arrayStack.removeElement(top - 1);
		top--;
	}

	// 스택의 최상위 요소 반환(제거 X)
	public int peek() {
		if (isEmpty()) {
			return TencoIntArray.ERROR_NUM;
		}

		return arrayStack.getElement(top - 1);
	}

	// 코드 테스트
	public static void main(String[] args) {

		MyArrayStack stack = new MyArrayStack();
		stack.push(100);
		stack.push(200);
		stack.push(300);

		// 전체 출력
		stack.pop();
		System.out.println("----------------------");
		// stack.printAll();
		System.out.println(stack.peek());
		System.out.println("----------------------");
		stack.printAll();
	}
}
