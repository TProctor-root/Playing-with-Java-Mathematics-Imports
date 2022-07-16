import static org.junit.jupiter.api.Assertions.*;

import java.awt.Rectangle;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class Test {

	@Test
	void problem1() {
		String evenStr= Main.problem1_makeOutWord("<<>>", "Yay");
		assertEquals("<<Yay>>", evenStr);
	}
	@Test
	void problem2() {
		String res = Main.problem2_switchEO("Hello, World!");
		assertEquals("Holle, Werld!", res);
	}
	@Test
	void problem4() {
		Rectangle r1 = Main.problem4_growSquare(new Rectangle(100, 100, 50, 50));
		boolean correctDimensions = (r1.x == 100 && r1.width==60);
		assertEquals(true, correctDimensions);
	}
	@Test
	void problem5() {
		assertEquals(new BigInteger("23230572939574190285016132680582106822956386016021987551618623681"), Main.problem5_bigPower(new BigInteger("12345678987654321")));
	}
	@Test
	void problem6() {
		Employee robert = new Employee("Robert Navarro", 100000);
		robert.raiseSalary(10);
		assertEquals(110000.0, robert.getSalary());
	}
	@Test
	void problem7() {
		Car myHybrid = new Car(50.0);
		myHybrid.addGas(20.0);
		myHybrid.drive(100.0);
		assertEquals(18.0, myHybrid.getGasInTank());
	}
	@Test
	void problem8()  {
		Person individual = new Person("Robert");
		individual.befriend(new Person("Fido"));
		individual.befriend(new Person("Spot"));
		individual.befriend(new Person("Fluffy"));
		individual.unfriend(new Person("Fluffy"));
		String list = individual.getFriendNames().replace(" ","");
		assertEquals("FidoSpot", list);
		assertEquals(2, individual.getFriendCount());
	}
	@Test
	void problem9() {
		BankAccount momsSavings = new BankAccount(1000, 3);
		momsSavings.setTransactionFee(1.00);
		momsSavings.deposit(100);
		momsSavings.withdraw(10);
		momsSavings.withdraw(30);
		momsSavings.withdraw(27.25);
		momsSavings.deposit(30);
		momsSavings.deposit(12);
		momsSavings.deductMonthlyCharge();
		boolean validRes = (momsSavings.getBalance()>=1071.75 && momsSavings.getBalance()<=1072);
		assertEquals(true, validRes);
	}
	@Test
	void problem10() {
		Balloon balloon = new Balloon();
		balloon.inflate(2.0);
		boolean validRes =  (balloon.getVolume()>=33.5 && balloon.getVolume()<=34.0);
		assertEquals(true, validRes);
	}
}
