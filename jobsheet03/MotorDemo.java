package jobsheet03;

public class MotorDemo {
    public static void main(String[] args) {
        
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setIsMesinOn(true);
        motor1.setKecepatan(150);
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(-40);
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();
    }
}
