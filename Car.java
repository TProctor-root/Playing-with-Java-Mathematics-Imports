public class Car {
	private double gas;
	private double efficiency;
	private double drive;
	
	public Car(double anEfficiency) {
		efficiency = anEfficiency;
		gas = 0;
		drive = 0;
	}

	public void addGas(double amount) {	
		gas += amount;
	}

	public void drive(double distance) {
		drive += distance;
		gas = gas - (distance / efficiency);
	}

	public double getGasInTank() {
		return gas; 
	}
}