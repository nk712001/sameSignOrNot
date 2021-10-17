import java.util.Scanner;

public class sameSignOrNot{

        public static void main(String[] args) {
        int  x=1;
        int  y=-1;
        if (oppositeSign(x,y)==true){
            System.out.println("entered two values are DIFFERENT sign");
            }else {
            System.out.println("entered two values are of SAME sign");
        }

    }

   public static boolean oppositeSign(int x, int y) {

       return (x < 0) ? (y >= 0) : (y < 0);
   }
}
