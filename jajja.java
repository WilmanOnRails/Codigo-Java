import java.lang.Math;
import java.util.Scanner;
import javax.swing.RowFilter;
public class jajja {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
 //ejerc1 
 System.out.println("-ingrese el codigo de barras del articulo:");
 int cod_barras = key.nextInt();
 System.out.println("-ingrese la cantidad a comprar:");
 int cantidad = key.nextInt();
 System.out.println("-ingrese el precio del articulo:");
 double precio = key.nextDouble();

 if (cantidad == 4) {
     precio *= 3;
 }else {
    precio *= cantidad; 
 }
 System.out.println("precio final: " + precio);
 if (precio > 300){
     System.out.println("por cada 100 pesos de compra se te obsequiarán 10 pesos en vales.");
}

//ejerc2
    System.out.println("-ingrese su dia de nacimiento:");
    int dia = key.nextInt();
    System.out.println("-ingrese su mes de nacimiento:");
    int mes = key.nextInt();
    System.out.println("-ingrese su año de nacimiento:");
    int año = key.nextInt();
    System.out.println("-ingrese su edad: ");
    int edad = key.nextInt();

    if ( edad > 18) {
        System.out.println("Podrás formar parte del equipo de futbol");
        System.out.println("-ingrese el grado que actualmente cursa");
        String grado = key.next();
        System.out.println("-ingrese su grupo");
        String grupo = key.next();
        System.out.println("-ingrese su promedio");
        int promedio = key.nextInt();
        if (promedio < 70) {            // && edad > 18
            System.out.println("lo sentimos pero no podra formar parte por su bajo promedio");
        } else {
        System.out.println("-ingrese el horario de entrenamiento que prefiere");
        String horario = key.next();
        }
    }
    
//ejecicio3
    double litros;
    System.out.println("-ingrese el numero del auto:");
    String matricula = key.next();
    System.out.println("-ingrese las millas recorridas:");
    int millas = key.nextInt();
    if (millas > 80) {
        System.out.println("Esta arriba del límite de velocidad");
    }
    System.out.println("-ingrese los kilometros del auto");
    int kilometros = key.nextInt();
    if (kilometros >= 200 && kilometros <= 350) {
        System.out.println("Hace falta mantenimiento al auto");
    }
    do {
    System.out.println("-ingrese los kilómetros que recorre su auto con un litro de gasolina. De 10 a 16.");
    litros = key.nextInt();}  while (litros > 16);
    
    if (litros >=14 && litros <= 16) {
        System.out.println("Consume algo gasolina");
        litros = 100/litros;
        System.out.println("consume " + litros + " de gasolina cada 100km");
    }else if (litros >=10 && litros <= 13) {
        System.out.println("Consume poca de gasolina");
        litros= 100/litros;
        System.out.println("consume " + litros + " de gasolina cada 100km");
    }
//ejercicio4
    double promedio;
    System.out.println("-ingrese el numero del jugador");
    int num = key.nextInt();
    System.out.println("-ingrese los tiros del jugador:");
    int tiros = key.nextInt(); 
    System.out.println("-ingrese los tiros fallados del jugador:");
    int fallos = key.nextInt(); 
    System.out.println("-ingrese los tiros anotados por el jugador:");
    int anotados = key.nextInt();

    if (anotados >= 1 && fallos >= 1) {
        tiros = fallos + anotados;
        System.out.println("el jugador tiro " + tiros + " veces");
    }
    
    if (anotados >=3 && anotados<=6 )  {
        System.out.println("Anotó pocos puntos");
    } else if (anotados >=7 && anotados<=15 )  {
        System.out.println("Anotó puntos aceptables");
        promedio = anotados*0.3; //si de cada 3 tiros anoto 1 de 3 pts, entonces calculo la cantidad de anotados y lo divido entre 3 
        System.out.println("la cantidad de tiros de 3 que pudo haber anotado son: " + Math.round(promedio));
    } else if (anotados >=16 && anotados<=22 )  {
        System.out.println("Felicidades por sus anotaciones");
        promedio = anotados*0.3; //si de cada 3 tiros anoto 1 de 3 pts, entonces calculo la cantidad de anotados y lo divido entre 3 
        System.out.println("la cantidad de tiros de 3 que pudo haber anotado son: " + Math.round(promedio));
    } 
//ejercicio5
    System.out.println("-ingrese el codigo del producto");
    int codigo = key.nextInt(); 
    System.out.println("-ingrese el año de elaboracion del producto");
    int elaboracion = key.nextInt();
    System.out.println("-ingrese el mes de caducidad del  producto (en numero)");
    int mesC = key.nextInt();
    System.out.println("-ingrese el año de caducidad del producto");
    int caducidad = key.nextInt();
    if (codigo >= 150 && codigo <= 80){
      if (elaboracion == 2016) {
          if(mes < 9) {
            if (caducidad == 2020) {
                System.out.println("el sistema le asignará un lugar en el almacén");    
                System.out.println("al producto le quedan " + (caducidad-elaboracion) + " años de vigencia");    
            }
          }
      } 
    } else {
        System.out.println("El sistema no puede asignar un lugar en el almacén debido a sus características dadas");    
    }
//ejercicio6
    System.out.println("-ingrese la clasificacion del producto:");
    char clasificacion = key.next().charAt(0);
    //String clas = String.valueOf(clasificacion); -------> para pasarlo a string y luego al comprobarlo hacer clas == frutas;
    if (Character.isLowerCase(clasificacion)) {
        clasificacion = Character.toUpperCase(clasificacion);
    }

    if (clasificacion == 'F') {
        System.out.println("el producto es: Frutas");
        System.out.println("Tendrá un 20 porciento de descuento todos los martes");
    }else if (clasificacion == 'V') {
        System.out.println("el producto es: Verduras");
        System.out.println("Tendrá un 20 porciento de descuento todos los martes");
    }else if (clasificacion == 'S') {
        System.out.println("el producto es: Salchichoneria");
        System.out.println("Tendrá un 15 porciento de descuento todos los fines de semana");
    }else if (clasificacion == 'L') {
        System.out.println("el producto es: Lacteos");
    }else if (clasificacion == 'B') {
        System.out.println("el producto es: Bebes");
    }else if (clasificacion == 'D') {
        System.out.println("el producto es: Damas");
    }else if (clasificacion == 'C') {
        System.out.println("el producto es: Caballeros");
    }else if (clasificacion == 'N') {
        System.out.println("el producto es: Niños");
    }else if (clasificacion == 'P') {
        System.out.println("el producto es: Perfumeria");
    }else if (clasificacion == 'M') {
        System.out.println("el producto es: Medicamento farmacéutico");
    }else if (clasificacion == 'E') {
        System.out.println("el producto es: Electronicos ");
    }else if (clasificacion == 'H') {
        System.out.println("el producto es: Hogar");
    }else if (clasificacion == 'J'){
        System.out.println("el producto es: Jugueteria");
    }else {
        System.out.println("Producto no encontrado");
    }

/*System.out.println();
int  = key.nextInt();
||
*/
    }
    private static int name(int a , int b ) {
        int x = a+b;
        return x;
    }
}
