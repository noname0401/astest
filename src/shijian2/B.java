package shijian2;

import java.util.Scanner;

class Transport{
    int speed;
    double run(int speed){
        double speed1=speed;
        return 5000/speed1;
    }
}
class plane extends Transport{
    double run(int speed){
        double speed1=speed;
       // return 5000/speed1;
        System.out.printf("%.2f\n",5000/speed1);
        return 5000/speed1;
    }
}
class ship extends Transport{
    double run(int speed){
        double speed1=speed;
        return 5000/speed1;
    }
}
class train extends Transport{
    double run(int speed){
        double speed1=speed;
        return 5000/speed1;
    }
}
class car extends Transport{
    double run(int speed){
        double speed1=speed;
        return 5000/speed1;
    }
}
public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){

            char tool=input.next().charAt(0);
            if(tool == 'P')
            {
                plane plane1 = new plane();

                int speed = input.nextInt();
                plane1.run(speed);
               // computime(plane1,speed);
            }
            if(tool == 'S')
            {
                ship ship1 = new ship();
                int speed = input.nextInt();
                computime(ship1,speed );
            }
            if(tool== 'C')
            {
                car car1 = new car();
                int speed = input.nextInt();
                computime(car1,speed);
            }
            if(tool == 'T')
            {
                train train1 = new train();
                int speed = input.nextInt();
                computime(train1,speed);
            }

        }
    }

    public  static void computime(Transport irun,int speed)
    {
        double time = irun.run(speed);
        System.out.printf("%.2f\n",time);
    }
}
