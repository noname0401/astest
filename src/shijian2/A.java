//package shijian2;
//
//import java.util.Scanner;
//interface IRun
//{
//    int speed = 0;
//    double run(int speed);
//}
//class Plane implements IRun{
//    int speed;
//    public double run(int speed) {
//        double Planed=speed;
//        return 5000/Planed;
//    }
//}
//class Ship implements IRun{
//    int speed;
//    public double run(int speed) {
//        double  Shipd=speed;
//        return 5000/Shipd;
//    }
//}
//class Car implements IRun{
//    int speed;
//    public double run(int speed) {
//        double Card =speed;
//        return 5000/Card;
//    }
//}
//class Train implements IRun{
//    int speed;
//    public double run(int speed) {
//        double Traind =speed;
//        return 5000/Traind;
//    }
//}
//public class A {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        while(input.hasNext()){
//
//            char tool=input.next().charAt(0);
//            if(tool == 'P')
//            {
//                IRun irunpt = new Plane();
//                int speed = input.nextInt();
//                computime(irunpt,speed);
//            }
//            if(tool == 'S')
//            {
//                IRun irunst = new Ship();
//                int speed = input.nextInt();
//                computime(irunst,speed );
//            }
//            if(tool== 'C')
//            {
//                IRun irunct = new Car();
//                int speed = input.nextInt();
//                computime(irunct,speed);
//            }
//            if(tool == 'T')
//            {
//                IRun irunt1t = new Train();
//                int speed = input.nextInt();
//                computime(irunt1t,speed);
//            }
//
//        }
//    }
//
//    public  static void computime(IRun irun,int speed)
//    {
//        double time = irun.run(speed);
//        System.out.printf("%.2f\n",time);
//    }
//}
//
//
//
