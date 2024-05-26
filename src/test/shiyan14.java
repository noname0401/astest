package test;

import java.util.Scanner;
 abstract class student{
    public  String Sname;
     public String Ssex;
     public int birthYear,birthMouth,birthDay;
     public String Ssub;
    static int cYear = 2023;

}
 class student1 extends student{
    public String getsName() {
        return Sname;
    }
    public student1(String Sname, String Ssex, int birthYear, int birthMouth, int birthDay, String Ssub) {
        //  super();
        this.Sname = Sname;
        this.Ssex = Ssex;
        this.birthYear = birthYear;
        this.birthMouth = birthMouth;
        this.birthDay = birthDay;
        this.Ssub = Ssub;
    }

    public String getsSex() {
        return Ssex;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMouth() {
        return birthMouth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getsSub() {
        return Ssub;
    }

    public int getAge() {
        return this.cYear - this.birthYear;
    }
    public void show(){
        System.out.println("subject:" + getsSub() + ",name:" + getsName() + ",Sex:" + getsSex() +
                ",birth:" + getBirthYear() + "/" + getBirthMouth() + "/" + getBirthDay() + ",age:"
                + getAge());

    }
}
//class  student extends student1{
//    private String Sname;
//    private String Ssex;
//    private int birthYear,birthMouth,birthDay;
//    private String Ssub;
//    static int cYear = 2023;
//
//    public String getsName() {
//        return Sname;
//    }
//    public student(String Sname, String Ssex, int birthYear, int birthMouth, int birthDay, String Ssub) {
//      //  super();
//        this.Sname = Sname;
//        this.Ssex = Ssex;
//        this.birthYear = birthYear;
//        this.birthMouth = birthMouth;
//        this.birthDay = birthDay;
//        this.Ssub = Ssub;
//    }
//
//    public String getsSex() {
//        return Ssex;
//    }
//
//    public int getBirthYear() {
//        return birthYear;
//    }
//
//    public int getBirthMouth() {
//        return birthMouth;
//    }
//
//    public int getBirthDay() {
//        return birthDay;
//    }
//
//    public String getsSub() {
//        return Ssub;
//    }
//
//    public int getAge() {
//        return this.cYear - this.birthYear;
//    }
//    public void show(){
//        System.out.println("subject:" + getsSub() + ",name:" + getsName() + ",Sex:" + getsSex() +
//                ",birth:" + getBirthYear() + "/" + getBirthMouth() + "/" + getBirthDay() + ",age:"
//                + getAge());
//
//    }
//
//}

public class shiyan14 {
    //String sName, String sSex, int birthYear, int birthMouth, int birthDay, String sSub
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        student1 stu1 = new student1("张三", "男", 2000, 1, 10, "计算机科学与技术");
        student1 stu2 = new student1("李四", "男", 2000, 7, 10, "计算机科学与技术");
        student1 stu3 = new student1("王五", "男", 2010, 12, 10, "计算机科学与技术");
//        System.out.println("subject:" + stu1.getsSub() + ",name:" + stu1.getsName() + ",Sex:" + stu1.getsSex() +
//                ",birth:" + stu1.getBirthYear() + "/" + stu1.getBirthMouth() + "/" + stu1.getBirthDay() + ",age:"
//                + stu1.getAge());
        stu1.show();
        System.out.println("subject:" + stu2.getsSub() + ",name:" + stu2.getsName() + ",Sex:" + stu2.getsSex() +
                ",birth:" + stu2.getBirthYear() + "/" + stu2.getBirthMouth() + "/" + stu2.getBirthDay() + ",age:"
                + stu2.getAge());
        System.out.println("subject:" + stu3.getsSub() + ",name:" + stu3.getsName() + ",Sex:" + stu3.getsSex() +
                ",birth:" + stu3.getBirthYear() + "/" + stu3.getBirthMouth() + "/" + stu3.getBirthDay() + ",age:"
                + stu3.getAge());

    }
}