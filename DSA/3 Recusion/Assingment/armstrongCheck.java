package Assingment;

import java.util.*;
import java.math.*;

public class armstrongCheck {

    public static int Armstrong(int n,int count){
        int result=0;
        int a;
        if(n<=1){
            return n;
        }
        else{
            a = n%10;
            result = (int) Math.pow(a,count) + Armstrong(n/10, count);
        } return result;
    }
    public static void main(String[] args) {
        int count=0;
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for check Armstrong or not: ");
        int n = sc.nextInt();
        
        while(n>1){
            count++;
            a = n/10;
        } System.out.println(count);

        int res = Armstrong(n,count);
        System.out.println(res);
    }
}
