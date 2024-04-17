package basic.ch05;

public class OrderMainTest {

	public static void main(String[] args) {

		Order order1 = new Order();
		Order order2 = new Order();
		
		order1.menu = "김밥";
		order1.pastOrder = 3;
		order1.price = 3500;
		order1.count = 2;
		
		System.out.println(order1.menu);
		System.out.println(order1.pastOrder);
		System.out.println(order1.price);
		System.out.println(order1.count);
		
	}

}
