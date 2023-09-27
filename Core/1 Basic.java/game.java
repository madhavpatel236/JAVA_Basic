import java.util.Scanner;

import javax.lang.model.util.ElementScanner7;
import javax.xml.transform.SourceLocator;




class Gusser{
    int number;  // madhav je number guess karse te save karva mate no variable che aa.

    public int madhav(){
        Scanner scan = new Scanner(System.in);  // Guesser pase thi guess  karel value lakhva mate terminal ma lakhva mate parmition(space) api.
        number = scan.nextInt();    // have MADHAV(GAUSSER) e je value lakhi tene lay ne  save kari NUMBER variable ma.
        return number;  // have gusseing num save thay gayu che NUMBER ma pan tene method(main) ni bar java mate return to karvuj pade.)
                        // aa NUMBER ni value te madhav() methi ne return karse.
    }
    
}





class Player{

    int pgnumber1;
    int pgnumber2;
    int pgnumber3;

    public int parth(){
        Scanner scan = new Scanner(System.in);  // player1 pasethi value mangava mate space crate kari terminal ma parmition api ke PARTH terminal ma lakhi sakhse.
        System.out.println("Parth gussing number is : ");
        pgnumber1 = scan.nextInt();   //Aa no matalab thay che ke je value PARTH e guess kari te scan kari ne PGNUM! ma store karvi.  //  Returns: the int scanned from the input.
        return pgnumber1;
    }

    public int Ranjan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ranjan guess the number");
        pgnumber2 = scan.nextInt();
        return pgnumber2;  
    }

    public int Atul(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Atul guess the number is : ");
        pgnumber3 = scan.nextInt();
        return pgnumber3;
    }
}


class  Umpire{

    int collectFronGusser;
    int collectFromPlayer1;
    int collectFromPlayer2;
    int collectFromPlayer3;


    public void collectFromGusser(){      // aya apde 1 method create kari.
        Gusser  a= new Gusser();        // object.
        collectFronGusser= a.madhav();  // upar object ni madad thi GUSSER name ni class to access kari nakhi pan temathi kay value levani che te nathi naki kayru, te mate ahi apde pela a.madhav() laykhu teno matlab thay che ke je value madhav() method ma save che te pela A name na local variable ma save kari pachi COLLECTFROMGUSSER ma save karvi je instance variable che.
    }

    public void colllectfromplayer(){
        Player p1 = new Player();  // object.
        Player p2 = new Player();  // object.
        Player p3 = new Player();  // object.

        collectFromPlayer1=p1.parth();  // upar je object banavel che tema p1 name na local variable ma parth() name ni method ma je value save kari che te instance variable collectFromPlayer1 ma store kayru. 
        collectFromPlayer2=p1.Ranjan();
        collectFromPlayer3=p1.Atul();
    }

    public void compare(){
    
        if (collectFronGusser == collectFromPlayer1 )
        {
            if(collectFromPlayer1 == collectFromPlayer2 || collectFromPlayer1 == collectFromPlayer3)
            {
                System.out.println("You all are winner!!");
            }
            else if(collectFromPlayer1 == collectFromPlayer2)
            {
                System.out.println("Parth and Ranjan are winners!!");
            }
            else if(collectFromPlayer1 == collectFromPlayer3)
            {
                System.out.println("Parth and Atul are winners!!");
            }
            else
            {
                System.out.println("Parth is winner!!");
            }
        }    

        else if (collectFronGusser == collectFromPlayer2)
        {
            if(collectFromPlayer2 == collectFromPlayer3 )
            {
                System.out.println("Ranjan and Atul are winners!!");
            }
            else
            {
                System.out.println("Ranjan is winner!!");
            }
        }

        else if(collectFronGusser == collectFromPlayer3)
        {
            System.out.println("Atul is winner!!");
        }

        else
        {
            System.out.println("no one is winner,sorry!!");
        }
    }

}


public class game{
    public static void main(String[] args) {
        System.out.println("Enter a numbmer : ");
        
        Umpire result = new Umpire();  // ahi apde umpire class mate object banavyo. karan ke badhi value and result temaj che je print karava nu che.
        result.collectFromGusser();  // Aa no matlab thay che ke apde collectFromGusser name ni method ni madad thi madhav pase thi input(gusse karayvu) lithu and tene umpire ne dai dithi
                                        // jo apde aa line no lakhiye to GUSSER koi pan vastu GUSSE j na kare in short GUSSER ni koi pan activity thatj nahi.
        result.colllectfromplayer();  // Aa no matlab thay che ke apde collectFromGusser name ni method ni madad thi PLAYER(parth,ranjan,atul) pase thi input(gusse karayvu) lithu and tene umpire ne dai dithi
        result.compare();  // Aa no matlab thay che ke COMPARE class ni method ni madad thi GUSSER and PLAYER ni comparision kari ne UMPIRE e javab aypo.

    }

}

