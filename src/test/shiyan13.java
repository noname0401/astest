package test;

class childd{
    private String Cname;
    private String Csex;
    private int Cage;
    private String Chobby;
    private int num;
    public childd(String Cname,String Csex,int Cage,String Chobby,int num){
        this.Cname = Cname;
        this.Csex = Csex;
        this.Cage = Cage;
        this.Chobby = Chobby;
        this.num = num;
    }

    public String show(){
        return "**第"+num+"位**\n"+Cname+"小朋友："+Csex+"，"+Cage+"岁\n"+Cname+"爱好："+Chobby+"\n";
    }


}
public class shiyan13 {
    public static void main(String[] args){
        childd c1 = new childd("lucky","女",6,"唱歌、朗诵",1);
        childd c2 = new childd("威廉","男",5,"钢琴、表演",2);
        childd c3 = new childd("安娜","女",4,"舞蹈、书法",3);
        System.out.println(c1.show());
        System.out.println(c2.show());
        System.out.println(c3.show());

    }
}
