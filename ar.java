//write a program to create 5 ellement perform to addition
import java.util.*;
class ar{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
            sum=sum+a[i];
    }
    System.out.print("sum of all ellement:"+sum);
}
}