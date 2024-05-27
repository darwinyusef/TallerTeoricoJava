public class Main {
  // Función que retorna la suma de un entero y su parametro
  public static int data(int suma) {
    return 100 * suma;
  }
  
  // Función donde puedes duplicar un número mas la declaración global de la función data
  public static int duplicar() {
    return data(6) * 2;
  }

  // Función donde puedes enviar un regalo con un enano
  public static String regalito(String regalo){
    return "Un enano tiene un regalo: " + regalo + " que le costo la vida" ; 
  }

  // entrada (int p) proceso ((p * 2)) salida (return)
  public static int func1(int p) {
    return (p * 2);
  }
  
  // Mezcla de retornos de parametros
  public static int func2(int p) {
    return (p * 2);
  }
  
  public static void main(String[] args) {
    int a = data(6);
    System.out.println(a);
    System.out.println(duplicar());
    System.out.println( regalito("Chocolate") );
    // usamos func1 y la 2 func2
    System.out.println(func1(60) + func2(50)); 
  }
}