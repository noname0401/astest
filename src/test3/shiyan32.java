package test3;

abstract class Employee {
    public abstract double earnings();
}
class YearWorker extends Employee {
    public double earnings() {
        return 120000;
    }
}
class MonthWorker extends Employee {
    public double earnings() {
        return 10000;
    }
}
class WeekWorker extends Employee {
       public double earnings() {
           return 2500;
    }
}

class Company {
    Employee[] employee;
    double salaries=0;
    Company(Employee[] employee) {
        this.employee=employee;
    }
    public double salariesPay() {
        for(int i=0;i<employee.length;i++){
            salaries=salaries+employee[i].earnings();
        }//用for循环，计算salaries
        return salaries;
    }
}
public class shiyan32 {
    public static void main(String args[]) {
        Employee[] employee=new Employee[29];
        //公司有29名雇员
       // System.out.println(employee.length);
        for(int i=0;i<employee.length;i++) {   //雇员简单地分成三类
            if(i%3==0)
                employee[i]=new WeekWorker();
            if(i%3==1)
                employee[i]=new MonthWorker();
            if(i%3==2)
                employee[i]=new YearWorker();

        }
        Company company=new Company(employee);//创建Company对象
        System.out.println("公司薪水总额:"+company.salariesPay()+"元");
    }
}

