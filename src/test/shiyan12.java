package test;

class Vehicle{
    double speed;
    int power;
//    public void Vehicle(double speed,int power){
//        this.power=power;
//        this.speed=speed;
//    }
    void speedUp(int s){
        this.speed += s;
    }
    void speedDown(int d){
        this.speed -= d;
    }
    void setPower(int p){
        this.power = p;
    }
    int getPower( ){
        return power;
    }
    double getSpeed() {
        return speed;
    }
}
public class shiyan12{
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle();
        car1.setPower(128);
        car2.setPower(76);
        System.out.println("car1的功率是:" + car1.getPower());
        System.out.println("car2的功率是:" + car2.getPower());
        car1.speedUp(80);
        car2.speedUp(100);
        System.out.println("car1目前的速度是：" + car1.getSpeed());
        System.out.println("car2目前的速度是：" + car2.getSpeed());
        car1.speedDown(10);
        car2.speedDown(20);
        System.out.println("car1目前的速度是：" + car1.getSpeed());
        System.out.println("car2目前的速度是：" + car2.getSpeed());
    }
}
