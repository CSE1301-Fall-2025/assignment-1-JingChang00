import java.util.*;

public class Nim { 
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        int total;
        int hum = 1;
        int remain;
        System.out.println("How many sticks do you want in total? ");
        total = n1.nextInt();
        remain = total;
        int round = 0;
        boolean flag = true;

        while(remain > 0 && hum <= 2 && hum >0)
        {
            System.out.println("How many sticks do you want take? ");
            hum = n1.nextInt();
            remain = remain - hum;
            System.out.println("Round "+round+ ": "+ total+" at start human takes "+ hum + " so "+ remain + " remain.");
            round ++;
            flag = true;
            if (remain <= 0) {   
            break;}

            int rnd = (int)(Math.random()*2)+1;
            remain = remain - rnd; 
            System.out.println("Round "+round+ ": "+ total+" at start computer takes "+ rnd + " so "+ remain + " remain.");
            round ++;
            flag = false;
            if (remain <= 0) {   
            break;}

        }

        if(flag == true)
        {System.out.println("You win!");}
        else
        {System.out.println("The computer wins!");}
    }

}
