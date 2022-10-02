import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class nose {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        LocalDateTime fecha = LocalDateTime.now();
        int arreglo[],maximo,minimo;
        int b[];
        int opcion,elemento;
       
        System.out.println("la hora actual es: " + LocalTime.now());
        System.out.println("ingrese la cantidad de elementos del arreglo");
        int cantidad = key.nextInt();
        arreglo = new int[cantidad];
        System.out.println("ingrese el valor minimo del arreglo");
        minimo = key.nextInt();
        System.out.println("ingrese el valor maximo del arreglo");
        maximo = key.nextInt();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * (maximo-minimo) + minimo);
        }
        System.out.println("el arreglo sin ordenar es:" + Arrays.toString(arreglo));
        ///ordenar_arreglo(arreglo);
        b =Arrays.copyOf(arreglo, arreglo.length);
        ordenamiento_inserccion(arreglo);
        System.out.println("el arreglo ordenado es: ");
        for (int i : arreglo) {
            System.out.println(i);
        }
        System.out.println("desea buscar la posicion de un elemento del arreglo?");
        System.out.println("1: Si / 2: No");
        opcion = key.nextInt();

        
       
        if(opcion == 1){
            System.out.println("ingrese el elemento a buscar");
            elemento = key.nextInt();
            busqueda(elemento, arreglo);
        }else if(opcion==2){
            System.out.println("saliendo...");
        }else{
            System.out.println("opcion no valida");
        }   
        int arreglo_b[] = new int[arreglo.length-1];
        System.out.println("ingrese un elemento de arreglo a eliminar");
        elemento = key.nextInt();
        System.out.println("el nuevo arreglo es:");
        nuevo_array(arreglo, elemento, arreglo_b);
        for (int i : arreglo_b) {
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(b));
        //orden_seleccion(b);
        for (int i = 0; i < b.length; i++) {
            for(i=0;i<b.length-1;i++){
            int posicion=i;
            int menor=b[i];
            for (int j=i+1; j<b.length; j++){
            if (b[j] < menor ){
                menor= b[j];
                posicion = j;
            }
            }
            b[posicion]= b[i];
            b[i]= menor;
            }
        }

        for (int i : b) {
            System.out.println(i);
        }

 


        /*
        //el arreglo b en el metodo main necesita ser nulo y en el caso de estar en un metodo aparte
        //debe ser inicializado con la cantidad de elementos del otro arreglo -1 y 
        //debe ser eliminada la linea <---
        for (int i = 0; i < a.length; i++) {
         if(a[i]==elemento_e){
           b = new int[a.length-1]; <---- Esta liinea sino, no funcionara
            for (int j = 0; j < i; j++) {
                b[j] = a[j];
            }
            for (int j = i; j < a.length-1; j++) {
                b[j] =a[j+1];
            }
            break;
        }
    }

        */

    }


public static void ordenar_arreglo(int a[]) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if(a[j]>a[j+1]){ 
                int aux = a[j];
                a[j] =a[j+1];
                a[j+1] = aux;
                
             }
            }
        }
    }
private static void ordenamiento_inserccion(int a[]) {
  for (int i = 0; i < a.length; i++) {
      int aux = a[i];
      int posicion =i;
      while(posicion>0 && a[posicion-1] > aux ){
        a[posicion] = a[posicion-1];
        posicion--;
      }
      a[posicion] = aux;
  }  
}
private static int busqueda(int elemento, int array[]) {
    int posicion = -1;
    for (int i = 0; i < array.length; i++) {
        if(elemento == array[i]){
            posicion =i;
            System.out.println("el elemento se encuentra en la posicion " + posicion);
            return posicion;
        }
    }
    System.out.println("el elemento no se encuentra en el arreglo");
    return -1;
}
private static void nuevo_array(int a[],int elemento_e,int b[]) {
    
    for (int i = 0; i < a.length; i++) {
        if(a[i]==elemento_e){
            for (int j = 0; j < i; j++) {
                b[j] = a[j];
            }
            for (int j = i; j < a.length-1; j++) {
                b[j] =a[j+1];
            }
            break;
        }
    }
}
public static void orden_seleccion(int a[]) {
    for (int i = 0; i < a.length; i++) {
        for(i=0;i<a.length-1;i++){
        int k=i;
        int t=a[i];
        for (int j=i+1; j<a.length; j++) {
        if (a[j] < t){
        t= a[j];
        k=j;
        }
        a[k]= a[i];
        a[i]= t;
        }
        }        
}




}

 }