public class Balloon {
    private double air;
    
    public Balloon() {
        air = 0;
    }
    public void inflate(double amount){
        air = air + amount;
    }
    public double getVolume(){
        return (4.0 / 3) * Math.PI * Math.pow(air, 3);
    }
}