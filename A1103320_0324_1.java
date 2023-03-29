import java.util.*;

public class A1103320_0324_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //System.out.println("項目姓名/身高(公尺)/體重(公斤)/速度(公尺/分鐘)");
        //Animal olaf = new Animal("雪寶",1.1,52,100);
        //Animal donkey = new Animal("驢子",1.5,99,200);
        //Animal anna = new Animal("安那",1.7,48,120);
        //Animal elsa = new Animal("愛沙",1.7,50,120);

        Animal olaf = new Animal();
        Animal donkey = new Animal();
        Animal anna = new Animal();
        Animal elsa = new Animal();
        Animal show = new Animal();

        show.show();

        olaf.name="雪寶";
        olaf.height=1.1;
        olaf.weight=52;
        olaf.speed=100.0;
        System.out.println(""+olaf.name+"     "+olaf.height+"        "+olaf.weight+"         "+olaf.speed);

        donkey.name="驢子";
        donkey.height=1.5;
        donkey.weight=99;
        donkey.speed=200.0;
        System.out.println(""+donkey.name+"     "+donkey.height+"        "+donkey.weight+"         "+donkey.speed);

        anna.name="安那";
        anna.height=1.7;
        anna.weight=48;
        anna.speed=120.0;
        System.out.println(""+anna.name+"     "+anna.height+"        "+anna.weight+"         "+anna.speed);

        elsa.name="愛沙";
        elsa.height=1.7;
        elsa.weight=50;
        elsa.speed=120.0;
        System.out.println(""+elsa.name+"     "+elsa.height+"        "+elsa.weight+"         "+elsa.speed);

        System.out.println("請輸入雪寶跑步時間(分鐘):");
        int olaftime = input.nextInt();
        System.out.println("請輸入加速度:");
        double olafaccelerate = input.nextDouble();
        System.out.println("其奔跑距離："+olaf.distance(olaftime, olafaccelerate));

        System.out.println("請輸入驢子跑步時間(分鐘):");
        int donkeytime = input.nextInt();
        System.out.println("請輸入加速度:");
        double donkeyaccelerate = input.nextDouble();
        System.out.println("其奔跑距離："+olaf.distance(donkeytime, donkeyaccelerate));

        System.out.println("請輸入安那跑步時間(分鐘):");
        int annatime = input.nextInt();
        System.out.println("請輸入加速度:");
        double annaaccelerate = input.nextDouble();
        System.out.println("其奔跑距離："+olaf.distance(annatime, annaaccelerate));


        System.out.println("請輸入愛沙跑步時間(分鐘):");
        int elsatime = input.nextInt();
        System.out.println("請輸入加速度:");
        double elsaaccelerate = input.nextDouble();
        System.out.println("其奔跑距離："+olaf.distance(elsatime, elsaaccelerate));
    } 
}



class Animal{
    String name;
    double height;
    int weight;
    double speed;

    void show(){
        System.out.println("項目姓名/身高(公尺)/體重(公斤)/速度(公尺/分鐘)");
        //System.out.println("項目名稱:"+name);
        //System.out.println("身高(公尺):"+height);
        //System.out.println("體重(公斤):"+weight);
        //System.out.println("速度(公尺/分鐘):"+speed);
    }

    double distance(int x,double y){
        return x*y*speed;
    }
    double distance(int x){
        return x*speed;
    }

}