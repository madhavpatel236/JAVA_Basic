//371

import java.util.*;

import java.util.*;

class Test{
    public static void main(String[] args) {
        
        int num = 371;
        int sum = 0;
        int res;
        int a;

        while(num!=0){
            res = num % 10; //res=1      // res=7
            a = res*res*res; //a=1      // a =343
            sum = sum+a; // sum=1      // sum = 1 + 343
            num = num / 10; //num=37  // num = 3 
        }
        System.out.println(sum);
    }
}