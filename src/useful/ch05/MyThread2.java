package useful.ch05;

public class MyThread2 implements Runnable {

	// Thread 클래스에서 start 메서드가 호출 되면
	// 동작하는 부분아라고 약속되어 있다.
	@Override
	public void run() {
		int i = 0;
		while(i < 10) {
			System.out.println(" i : " + i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
