import java.util.Arrays;
import java.util.Scanner;
public class ejercOr {
public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    //ejercicio 1
    int pts[] = new int[10];
    String equipos[] = new String[10];
    int x[] = new int[10];
    int y[] = new int[10];
    for (int i = 0; i < equipos.length; i++) {
        System.out.println("ingrese el nombre del equipo " + (i+1) + ": ");
        equipos[i] = k.next();
        System.out.println("ingrese los puntos del equipo " + equipos[i] + ": ");
        pts[i] = k.nextInt();
    }
    for (int i = 0; i < equipos.length-1; i++) {
        //boolean cambio = false;
        for (int j = 0; j < equipos.length-1; j++) {
            if(pts[j] < pts[j+1]) { 
            int aux = pts[j];
            pts[j] = pts[j+1];
            pts[j+1] = aux;
            
            String auxi = equipos[j];
            equipos[j] = equipos[j+1];
            equipos[j+1] = auxi;    
         } }
     }
   System.out.println("La clasificacion de liga primera (ascendente) es: ");
   for (int i = 0; i < equipos.length; i++) {
       System.out.println("Posicion " + (i+1)  + ": " + equipos[i] + " con " + pts[i] + " pts");
   }

   for (int i = 0; i < equipos.length-1; i++) {
    for (int j = 0; j < equipos.length-1; j++) {
        if(pts[j] > pts[j+1]) { 
        int aux = pts[j];
        pts[j] = pts[j+1];
        pts[j+1] = aux;
        
        String auxi = equipos[j];
        equipos[j] = equipos[j+1];
        equipos[j+1] = auxi;
     } }
}
   System.out.println("La clasificacion de liga primera (descendente) es: ");
   for (int i = 0; i < equipos.length; i++) {
       int n = 10;
       System.out.println("Posicion " + (n-i) + ": " + equipos[i] + " con " + pts[i] + " pts");
   }
   System.out.println("desea bucar equipo?");
   System.out.println("opcion 1: si");
   System.out.println("opcion 2: no");
   int opcion = k.nextInt();
   switch (opcion) {
       case 1:
           System.out.print("ingrese el nombre del equipo a buscar: ");
           String equipo = k.next();
           for (int i = 0; i < equipos.length; i++) {
               if(equipo.compareToIgnoreCase(equipos[i]) == 0){
                     System.out.println("los puntos de " + equipos[i] + " son: " + pts[i]);
                     break;
               }
           }
           break;
        case 2 :
            System.out.println("saliendo...");
            break;
       default:
       System.out.println("valor no valido");
           break;
   }
   //System.out.println("el arreglo ordenado es: " + Arrays.toString(pts)); 
//ejercicio 2
   llenar_array(x);
   System.out.println("ingrese un numero para buscar su posicion: ");
   int num = k.nextInt();
   if(busqueda(x, num) == -1){ 
   System.out.println("el numero no se encuentra en el arreglo");
   System.out.println("El arreglo era: " + Arrays.toString(x));
 }else{
     System.out.println("la posicion del numero"  + num +  " es: " + busqueda(x, num));
 }
//ejercicio 3
llenar_array(y);
System.out.println("el arreglo sin ordenar de menor a mayor es:");
for (int i : y) {
    System.out.println(i);
}
burbuja(y);
System.out.println("el arreglo ordenado de menor a mayor es:");
for (int i : y) {
    System.out.println(i);
}
}
 public static void burbuja(int a[]){
    for (int i = 0; i < a.length-1; i++) {
        for (int j = 0; j < a.length-1; j++) {
            if(a[j] > a[j+1]) { 
            int aux = a[j];
            a[j] = a[j+1];
            a[j+1] = aux;
         }
        } 
    }}
private static int busqueda(int a[], int elemento) {
    int posicion = -1;
    for (int i = 0; i < a.length; i++) {
        if(elemento== a[i]){
            posicion = i;
            break;
        }
    }
    return posicion;
}
private static void llenar_array(int a[]) {
    for (int i = 0; i < a.length; i++) {
        a[i] = (int) (Math.random() * 20) + 1; 
    }
}
}    