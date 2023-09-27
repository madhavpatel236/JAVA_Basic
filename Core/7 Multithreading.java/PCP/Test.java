import java.util.*;

class gausser extends Thread{
    umpire up;
    gausser(umpire ump){
        up = ump;
    }
    public void run(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = scan.nextInt();
        up.put(a);
    }
}

class umpire{
    public int m1;
    public int m2;
    
    synchronized public void put(int i){
        try{
        m1 = i;
        Thread.sleep(2000);
        }catch(Exception e){
            System.out.println("+++++++++");
        }
    }
    synchronized public void play(int j){
        
        try{        
        m2 =j;
        Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(" ------ ");
        }
        // finally{
        //     if(m1!=m2){
        //         System.out.println("looser");
        //     } else{
        //         System.out.println("Winner");
        //     } 
        // }
    }
}

class players extends Thread{
    
    umpire um;
    
    players(umpire ump){
        um = ump;
    }
    int player1;
    public void run(){
    Scanner scan = new Scanner(System.in);
    player1 = scan.nextInt();
    um.play(player1);
    }
}

public class Test{
    public static void main(String[] args) throws InterruptedException {
        
        umpire u = new umpire(); 
        
        gausser g = new gausser(u);
        players p = new players(u);
        g.start();
        p.start();
    }
}  