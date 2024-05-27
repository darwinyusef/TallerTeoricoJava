public class Main {
  public static void main(String[] args) {

    boolean llegastetarde = true; 
    if(llegastetarde == false) {
      System.out.println("Llegaste temprano");
    } else {
      System.out.println("Llegaste tarde");
    }
    int n1 = 5;
    int n2 = 15;
    int n3 = 25;  
    int n4 = 2;

    // OR
    if(n1 == n2 || n1 != n3) {
      System.out.println("n1 es igual a n2 o n1 es diferente a n3");
    } else {
      System.out.println("n1 no es igual a n2 o n1 no es diferente a n3");
    }

    // AND
    if(n1 == n2 && n1 != n3) {
      System.out.println("n1 es igual a n2 o n1 es diferente a n3");
    } else {
      System.out.println("n1 no es igual a n2 o n1 no es diferente a n3");
    }

  }
 
}