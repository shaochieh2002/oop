import java.util.*;

public class A1103320_0421_1{
    public static void main (String [] argv){
        Scanner input = new Scanner(System.in);
        String x;
        System.out.print("請輸入小寫的電子郵件信箱:");
        x=input.nextLine();
        
        if(x.matches("[a-z0-9]*[@]{1}[m]{1}[a]{1}[i]{1}[l]{1}[.]{1}[c]{1}[o]{1}[m]{1}") == true){
            System.out.println("輸入格式正確");
        }else{
            System.out.println("輸入格式錯誤");
        }
    }
}