import java.awt.Rectangle;
import java.math.BigInteger;
import java.util.Random;

class Main {
    public static String problem1_makeOutWord(String out, String word) {
        int size = out.length() / 2;
        String a = out.substring(0, size);
        String b = out.substring(size, out.length());
        String fin = a + word + b;
        return fin;
    }

    public static String problem2_switchEO(String str) {
        char [] save = str.toCharArray();
        
        for(int i = 0; i < str.length(); i++) {
            if('e' == str.charAt(i)) {
                save[i] = 'o';
            }
            else if('o' == str.charAt(i)) {
                save[i] = 'e';
            }
            else if('E' == str.charAt(i)) {
                save[i] = 'O';
            }
            else if('O' == str.charAt(i)) {
                save[i] = 'E';
            }
        }
        return String.valueOf(save);
    }

    public static String problem3_drawNumbers() {
        Random six = new Random();
        String win = "The winning numbers are ";
        String space = " ";
        //String hold = win;
        for(int i = 0; i < 6; i++) {
            int carry = six.nextInt(98);
            carry += 1;
            win += String.valueOf(carry);
            if(i != 5) {
                win += space;
            }
        }
        return win; 
    }

    public static Rectangle problem4_growSquare(Rectangle r) {
        r.grow(5, 5);
        r.translate(5, 5);
        return r;
    }

    public static BigInteger problem5_bigPower(BigInteger bigInt) {
        int exp = 4;
        bigInt = bigInt.pow(exp);
        return bigInt; 
    }

    public static void main(String[] args) { 
    	System.out.println(problem1_makeOutWord("<<>>", "Yay")); 
    	// returns "<<Yay>>"
    	System.out.println(problem1_makeOutWord("--------", "WooHoo")); 
    	// returns "----WooHoo----"
    	System.out.println(problem1_makeOutWord("ab", "word")); 
    	// returns "awordb"
    	
    	System.out.println(problem2_switchEO("Hello, World!")); 
    	// returns "Holle, Werld!"
    	System.out.println(problem2_switchEO("OOOOOOHHH...")); 
    	// returns "EEEEEEHHH..."
    	System.out.println(problem2_switchEO("Java is fun!")); 
    	// "Java is fun!"
    	
    	System.out.println(problem3_drawNumbers()); 
    	// returns "The winning numbers are 6 99 78 13 46 28"
    	
    	System.out.println(problem4_growSquare(new Rectangle(100, 100, 50, 50))); 
    	// returns Rectangle with x=100, y=100, width=60, height=60
    	System.out.println(problem4_growSquare(new Rectangle(0, 0, 20, 20))); 
    	// returns Rectangle with x=0, y=0, widht=30, height=30
    	System.out.println(problem4_growSquare(new Rectangle(2, 8, 83, 83))); 
    	// returns Rectangle with x=2, y=8, width=93, height=93
    	
    	System.out.println(problem5_bigPower(new BigInteger("12345678987654321"))); 
    	// returns 23230572939574190285016132680582106822956386016021987551618623681 
    	System.out.println(problem5_bigPower(new BigInteger("999999998888888"))); 
    	// returns 999999995555552007407419253777018382857935068069867401383936
    	
    	Employee robert = new Employee("Robert Navarro", 100000);
    	robert.raiseSalary(10); 
    	// Robert gets a 10% raise
    	System.out.println(robert.getSalary());
    	// should print 110000.0
    	
    	Car myHybrid = new Car(50.0); 
    	// make car get 50 miles per gallon
    	myHybrid.addGas(20.0); 
    	// add 20 gallons of gas
    	myHybrid.drive(100.0); 
    	// drive 100 miles 
    	System.out.println(myHybrid.getGasInTank()); 
    	// should print 18.0
    	
    	Person individual = new Person("Robert");
    	individual.befriend(new Person("Fido"));
    	individual.befriend(new Person("Spot"));
    	individual.befriend(new Person("Fluffy"));
    	System.out.println("Friend List: " + individual.getFriendNames()); 
    	// Should print "Fido Spot Fluffy"
    	System.out.println("Num friends: " + individual.getFriendCount()); 
    	// Should print 3
    	individual.befriend(new Person("Sunny"));
    	individual.befriend(new Person("Max"));
    	individual.unfriend(new Person("Spot"));
    	System.out.println("Friend List: " + individual.getFriendNames()); 
    	// Should print "Fido Fluffy Sunny Max"
    	System.out.println("Num friends: " + individual.getFriendCount()); 
    	// Should print 4
    	
    	BankAccount momsSavings = new BankAccount(1000, 3); 
    	// creates a new account with balance of $1000 and 3 free transactions
    	momsSavings.setTransactionFee(1.00);
    	momsSavings.deposit(100);
    	momsSavings.withdraw(10);
    	momsSavings.withdraw(30);
    	momsSavings.withdraw(27.25);
    	momsSavings.deposit(30);
    	momsSavings.deposit(12);
    	momsSavings.deductMonthlyCharge();
    	System.out.println(momsSavings.getBalance()); 
    	// should print 1071.75
    	
    	Balloon balloon = new Balloon();
    	System.out.println(balloon.getVolume()); 
    	// should print 0.0
    	balloon.inflate(2.0);
    	System.out.println(balloon.getVolume()); 
    	// should print 33.510321638291124
    	balloon.inflate(4.0);
    	System.out.println(balloon.getVolume()); 
    	// should print 904.7786842338604
        
    }
    
}


