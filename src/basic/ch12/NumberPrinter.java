package basic.ch12;

public class NumberPrinter {
	
	private int id;
	private static int waitNumber;
	
	public NumberPrinter(int id) {
		this.id = id;
		waitNumber = 1;
	}
	
	// 기능 -- 번호표를 출력한다
	public void printWaitNumber() {
		
		System.out.println(id + " 번에 기기의 대기 순번은 " + waitNumber);
		waitNumber++;
	}

}
