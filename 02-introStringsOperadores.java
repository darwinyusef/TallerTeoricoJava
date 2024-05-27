import java.util.StringJoiner;

public class Main {
  public static void main(String[] args) {
    
    // Iniciamos con algunos string
    String hello = "Te dice Hola";
    String myname = "Yusef Hermoso";
    String concatenar = myname + " " + hello;

    System.out.println(concatenar);

    // Desarrolla este texto --> habia una vez un enano que se pego en la cabeza y se murio y llego la SIJIN. separalo en 5 partes, y concatenalas

    String a = "habia una vez "; 
    String b = "un enano ";
    String c = "que se pego "; 
    String d = "en la cabeza ";
    String e = "y se murio "; 
    String f = "y llego la SIJIN ";
    
    // Concatenación por StringJoiner
    StringJoiner mensaje = new StringJoiner("");
    mensaje.add(a).add(b).add(c).add(d).add(e).add(f);
    System.out.println(mensaje.toString()); 
    
    // Concatenación por sumatoria de string
    hello = a + b + c + d + e + f;
    System.out.println(hello);
    
    // Concatenación por sumatoria de string a través de format
    String mensaje2 = String.format("%s %s", a, b);
    System.out.println(mensaje2);

    // Concatenación por sumatoria de string a través de concat
    String mensaje4 = a.concat(b).concat(c).concat(d);
    System.out.println(mensaje4);    
  }
 
}