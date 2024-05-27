import java.util.StringJoiner;

public class Main {
  public static void main(String[] args) {
    // Los operadores boleanos parten de el true (1) y el false (0)
    boolean info = true;    
    
    // NOT
    boolean uno = !false; 
    boolean dos = !(5==5); 

    // xor or corto
    boolean tres = true | false; 
    boolean cuatro = (5 == 5) | (5 < 4);

    // and corto xand
    boolean cinco = true ^ false;
    boolean seis = (5 == 5) ^ (5 < 4);
    
    // and corto xand
    boolean siete = true & false; 
    boolean ocho = (5 == 5) & (5 < 4);

    // or
    boolean nueve = true || false;
    boolean diez = (5 == 5) || (5 < 4);
    boolean trece = false || true;

    // and
    boolean once = false && true; 
    boolean doce = (5 == 5) && (5 < 4);


    System.out.println(uno + " - " + dos + " - " + tres + " - " + cuatro + " - " + cinco + " - " + seis + " - " + siete + " - " + ocho + " - " + nueve + " - " + diez + " - " + once + " - " + doce + " - " + trece);
    // equal - igual
    boolean eq = (5 == 5);
    // greater than - mayor que
    boolean gt = (5 > 4);
    // greater than equal - mayor igual que
    boolean gte = (5 >= 4);
    // less than - menor que
    boolean lt = (5 <= 4);
    // less than equal - menor igual que
    boolean lte = (5 <= 4);
    // not equal - no igual 
    boolean nq = (5 != 4);

    System.out.println(" eq - gt - gte - lt - lte - nq " + eq + " - " + gt + " - " + gte + " - " + lt + " - " + lte + " - " + nq );    
  }
 
}