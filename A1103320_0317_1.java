import java.util.*;

public class A1103320_0317_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("請輸入整數 m： ");
        int m = input.nextInt();

        System.out.println("請輸入整數 n： ");
        int n = input.nextInt();

        int [][] array = new int[m][n];                      

        for(int i = 0 ; i < array.length ; i++){                          
            for(int j = 0 ; j < array[i].length ; j++){                     
                array[i][j]=(i+1)*(j+1);        
            }
        }

        System.out.println("用 foreach 讀出資料：");
        for(int [] a : array ){                     //for(type集合中元素的數據類型  element臨時變量  :  collection要遍歷的集合) { }
            for(int b : a){
                    System.out.print(b);
                    System.out.print("\t");
            }
            System.out.println();                                                    
        }
    }
}