import java.util.Scanner;
import java.lang.Math;
public class ejercicios {
 public static void main(String[] args) {
      Scanner key = new Scanner(System.in);
//ejercio 1
    System.out.println("ingrese un numero");
    int num = key.nextInt();
    System.out.println("Has introducido el número " + num + ", gracias");
//ejercicio2 
    System.out.println("cuantos años tienes?");
    int edad = key.nextInt();
    System.out.println("Ahora sé que tienes " + edad + " años, gracias");
//ejercicio3 
    System.out.println("que hora es?");
    String hora = key.next();
    System.out.println("Hora introducida ok. Son las " + hora);
//ejercicio4
    System.out.println("ingrese sus iniciales:");
    String ini = key.next();
    System.out.println("ingrese la altura");
    Double al = key.nextDouble();
    System.out.println("Sus iniciales son: " + ini + " y su altura " + al);
//ejercicio5
    System.out.println("ingrese el precio del producto");
    Double precio = key.nextDouble();
    System.out.println("ingrese el descuento del producto");
    Double descuento = key.nextDouble();
    precio -= ((precio*descuento)/100);
    System.out.println("el precio final es: " + precio);
//ejercicio6
    System.out.println("ingrese la base");
    int base = key.nextInt();
    System.out.println("ingrese la altura");
    int altura = key.nextInt();
    System.out.println("el perimetro es: " + ((base+altura)*2) + " y el area es " + base*altura);
//ejercio7
    double euro = 1.33250;
    System.out.println("ingrese la cantidad de dolares a convertir");
    Double dolares = key.nextDouble();
    System.out.println("el cambio a euros es: " + euro*dolares);
//ejercicio8
    Double pi = 3.1416;
    System.out.println("ingrese el radio");
    Double radio = key.nextDouble();
    System.out.println("el perimetro es: " + (2*pi*radio));
    System.out.println("el area es: " + pi*(Math.pow(radio, 2)) );
    System.out.println("el volumen es: " + (4*pi*Math.pow(radio,3))/3 );
//ejercicio9
    System.out.println("ingrese a");
    int a = key.nextInt();
    System.out.println("ingrese b");
    int b = key.nextInt();
    System.out.println("ingrese c");
    int c = key.nextInt();

    double x = (-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
    double y = (-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        
    System.out.println("x1=" + x);
    System.out.println("x2=" + y);
}





 }



