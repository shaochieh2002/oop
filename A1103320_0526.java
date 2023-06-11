/*丁丁退休之後打算開一間水餃店，店裡每天預計準備5000顆豬肉水餃，3000顆牛肉水餃以及1000顆蔬菜水餃，請您幫丁丁的水餃店設計一個銷售的模擬器。
(1) 請使用多執行緒來設計此模擬器，並考慮同步的問題。
(2) 使用者可以輸入同時光顧的顧客數目。
(3) 每位顧客每次可同時點10到50顆水餃，模擬點水餃數請以亂數產生。
(4) 請亂數選取顧客點餐的水餃種類(豬肉水餃, 牛肉水餃或蔬菜水餃)。
(5) 水餃售完為止。
(6) 當顧客點餐後，在下一位顧客開始點餐前必須有等待服務生的時間，此等待的暫停時間為3秒。
*/

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

class sellingDumplingClass implements Runnable {

    Thread t;
    static int beef = 3000,pork = 5000, veg = 1000;
    static int toSellBeef=0,toSellpork = 0,toSellVeg=0;    
    int soldBeef,soldPork,soldVeg;

    sellingDumplingClass(String name) {
        soldBeef = 0;
        soldPork = 0;
        soldVeg  = 0;
        t = new Thread(this, name);
        t.start();
    }
    public void run(){
        while(sellingDumplings()==true){
            soldPork+=toSellpork;
            soldBeef+=toSellBeef;
            soldVeg+=toSellVeg;
            
            System.out.println(t.getName()+"買了"+soldPork+"顆豬肉水餃");
            System.out.println(t.getName()+"買了"+soldBeef+"顆牛肉水餃");
            System.out.println(t.getName()+"買了"+soldVeg+"顆蔬菜水餃");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }

        }
        System.out.println(t.getName()+"總共買了"+soldPork+"顆豬肉水餃");
        System.out.println(t.getName()+"總共買了"+soldBeef+"顆牛肉水餃");
        System.out.println(t.getName()+"總共買了"+soldVeg+"顆蔬菜水餃");


    }
    public int getsoldBeef() {
        return soldBeef;
    }

    public int getsoldPork() {
        return soldPork;
    }

    public int getsoldVeg() {
        return soldVeg;
    }

    synchronized private static boolean sellingDumplings() {
        SecureRandom sr= new SecureRandom();        
        if(beef>0||pork>0||veg>0){
            do{
                toSellBeef = sr.nextInt(51);
                toSellVeg  = sr.nextInt(51);
                toSellpork = sr.nextInt(51);
            }while(toSellBeef+toSellpork+toSellVeg<50 && toSellBeef<beef && toSellVeg<veg &&toSellpork<pork && toSellBeef+toSellpork+toSellVeg>10);
            beef-=toSellBeef;
            pork-=toSellpork;
            veg-=toSellVeg;
            return true;
        }else{
            return false;
        }

    }
}

public class A1103311_Dumpling {
    public static void main(String[] args) {
        System.out.println("請輸入共幾位顧客同時光臨:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<String> quantity = new ArrayList<String>();
        for(int i =1 ;i <= a; i++){
            String name = "顧客"+ i;
            quantity.add(name);
        }
        ArrayList<sellingDumplingClass> tArrayList = new ArrayList<sellingDumplingClass>();
        for(int i = 0 ;i < a ; i++){
            tArrayList.add(new sellingDumplingClass(quantity.get(i)));
        }
        sc.close();
    }
}
