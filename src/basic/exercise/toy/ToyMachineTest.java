package basic.exercise.toy;

public class ToyMachineTest {

	public static void main(String[] args) {

		Product airpot = new Airpot();
		Product lion = new Lion();
		Product bear = new Bear();

		ToyMachine toy1 = new ToyMachine("기계 1번");

		toy1.addProduct();

		toy1.moneyInput();

		toy1.pull();

		toy1.showProducts();

		toy1.inventory();
	}

}
