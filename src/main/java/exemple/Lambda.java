package exemple;

public class Lambda {
    public static void main(String[] args) {
  Fonctional_interface addition =(x, y) -> x+y;
  Fonctional_interface mult =(x, y) -> x*y;
        System.out.println( "add :" +   addition.calculatrice(12,12)) ;
        System.out.println( "mul :" +   mult.calculatrice(2,12)) ;






    }

}
