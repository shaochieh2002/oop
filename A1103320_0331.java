import java.util.*;

public class A1103320_0331{
    public static void main(String args[]) throws Exception{
        Scanner input = new Scanner(System.in);

        Animal.showInfo();

        Animal olaf = new Animal("雪寶",1.1,52,100);
        Animal donkey = new Animal("驢子",1.5,99,200);
        Snow kristoff = new Snow("阿克",1.9,80,150,"男","No");
        Snow hans = new Snow("漢斯", 1.8, 78, 130, "男","No");
        Snow anna = new Snow("安那", 1.7, 48, 120, "女","No");
        Snow elsa = new Snow("愛沙", 1.7, 50, 120, "女","Yes");

        olaf.show();
        donkey.show();
        kristoff.show();
        hans.show();
        anna.show();
        elsa.show();
    
        System.out.println("請輸入雪寶跑步時間(分鐘):");
        int olaftime = input.nextInt();
        System.out.println("請輸入加速度:");
        double olafaccelerate = input.nextDouble();
        if(olafaccelerate==0.0){
            System.out.println("其奔跑距離："+olaf.distance(olaftime));
        }else{
        System.out.println("其奔跑距離："+olaf.distance(olaftime, olafaccelerate));
        }

        System.out.println("請輸入驢子跑步時間(分鐘):");
        int donkeytime = input.nextInt();
        System.out.println("請輸入加速度:");
        double donkeyaccelerate = input.nextDouble();
        if(donkeyaccelerate==0.0){
            System.out.println("其奔跑距離："+donkey.distance(donkeytime));
        }else{
        System.out.println("其奔跑距離："+donkey.distance(donkeytime, donkeyaccelerate));
        }

        System.out.println("請輸入阿克跑步時間(分鐘):");
        int kristofftime = input.nextInt();
        System.out.println("請輸入加速度:");
        double kristoffaccelerate = input.nextDouble();
        if(kristoffaccelerate==0.0){
            System.out.println("其奔跑距離："+kristoff.distance(kristofftime));
        }else{
        System.out.println("其奔跑距離："+kristoff.distance(kristofftime, kristoffaccelerate));
        }

        System.out.println("請輸入漢斯跑步時間(分鐘):");
        int hanstime = input.nextInt();
        System.out.println("請輸入加速度:");
        double hansaccelerate = input.nextDouble();
        if(hansaccelerate==0.0){
            System.out.println("其奔跑距離："+hans.distance(hanstime));
        }else{
        System.out.println("其奔跑距離："+kristoff.distance(hanstime, hansaccelerate));
        }      
        
        System.out.println("請輸入安那跑步時間(分鐘):");
        int annatime = input.nextInt();
        System.out.println("請輸入加速度:");
        double annaaccelerate = input.nextDouble();
        if(annaaccelerate==0.0){
            System.out.println("其奔跑距離："+anna.distance(annatime));
        }else{
        System.out.println("其奔跑距離："+anna.distance(annatime, annaaccelerate));
        }

        System.out.println("請輸入愛沙跑步時間(分鐘):");
        int elsatime = input.nextInt();
        System.out.println("請輸入加速度:");
        double elsaaccelerate = input.nextDouble();
        if(elsaaccelerate==0.0){
            System.out.println("其奔跑距離："+elsa.distance(elsatime));
        }else{
        System.out.println("其奔跑距離："+elsa.distance(elsatime, elsaaccelerate));
        }
    }
} 

class Animal{
    public String name;
    public double height;
    public int weight;
    public int speed;

    public Animal(String name,double height,int weight,int speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }

    public void show(){
        //System.out.println("項目姓名/身高(公尺)/體重(公斤)/速度(公尺/分鐘)");
        System.out.println("項目名稱:"+this.name);
        System.out.println("身高(公尺):"+this.height);
        System.out.println("體重(公斤):"+this.weight);
        System.out.println("速度(公尺/分鐘):"+this.speed);
    }

    public double distance(int x,double y){
        return (double)x*y*speed;
    }
    public double distance(int x){
        return x*speed;
    }

    public static void showInfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class Human extends Animal{
    public String gender;

    public Human(String name,double height,int weight,int speed,String gender){
        super(name,height,weight,speed);
        this.gender=gender;
    }
    
    @Override
    public void show(){
        super.show();
        System.out.println("性別:"+gender);
    }
}

class Snow extends Human{
    public String frozenskill;

    public Snow(String name,double height,int weight,int speed,String gender,String frozenskill){
        super(name,height,weight,speed,gender);
        this.frozenskill=frozenskill;
    }

    /*public Snow(String name,double height,int weight,int speed,String gender){
        this(name, height, weight, speed, gender, x);
    }*/

    @Override
    public void show(){
        super.show();
        System.out.println("技能:"+frozenskill);
    }

    @Override
    public double distance(int x,double y){
        return super.distance(x, y)*2;
    }
    public double distance(int x){
        return super.distance(x)*2;
    }
}

