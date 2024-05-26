package home4;
import java.util.Scanner;
class line{
    private int x1,y1;
    private int x2,y2;

    line(int x1,int y1,int x2,int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

    public void linelength(){
        double s=(this.x1-this.x2)*(this.x1-this.x2);
        double q=(this.y1-this.y2)*(this.y1-this.y2);
        double len= Math.sqrt(s+q);
        System.out.printf("%.2f\n",len);
    }

    void move(int x,int y){
        x1+=x;
        x2+=x;
        y1+=y;
        y2+=y;
    }

    void dc_x(){
        y1=(-1)*y1;
        y2=(-1)*y2;
    }

    void dc_y(){
        x1=(-1)*x1;
        x2=(-1)*x2;
    }

    void dc_yuandian(){
        x1=(-1)*x1;
        x2=(-1)*x2;
        y1=(-1)*y1;
        y2=(-1)*y2;
    }

    void print(){
        System.out.print("("+this.x1+","+this.y1+")"+"("+this.x2+","+this.y2+")"+" ");
    }
}
public class a {
    //线段类
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        line l1=new line(a,b,c,d);

        while (input.hasNext()) {
            char s=input.next().charAt(0);
            //   String s=input.next();
            //   char target=s.charAt(0);
            if(s=='T'){
                int x,y;
                x=input.nextInt();
                y=input.nextInt();
                l1.move(x,y);
            }
            else if(s=='S') {
                int tt = input.nextInt();
                if (tt == 0) {
                    l1.dc_yuandian();
                } else if (tt == 1) {
                    l1.dc_x();
                } else if (tt == 2) {
                    l1.dc_y();
                }
            }
        }
        l1.print();
        l1.linelength();
    }
}


