import java.util.Scanner;
public class ayuda{
    public static void main(String[] args) {
        double sucursales[][] = new double [4][4];
        double ingresosT[] = new double[4];
        Scanner key = new Scanner(System.in);
        int opcion;

        System.out.println("las opciones disponibles son:");
        do{ 
        System.out.println("1: ingresar los ingresos de los productos");
        System.out.println("2: Obtener los ingresos totales por producto");
        System.out.println("3: Identificar el producto que genera mayores ingresos");
        System.out.println("4: Imprimir los ingresos totales por producto de forma ascendente");
        System.out.println("5: Permitir la búsqueda de producto por su nombre");
        System.out.println("6: salir" );
         opcion = key.nextInt();
        switch (opcion) {
        case 1:
        for (int i = 0; i < sucursales.length; i++) {
            for (int j = 0; j < sucursales[0].length; j++) {
                System.out.println("sucursal " + (i+1) + " producto " + (j+1));
                sucursales[i][j] = key.nextDouble();
            }
        }
        recorrer_matriz(sucursales);
        System.out.println(" ");
     break;
     case 2:
     System.out.println("los ingresos totales por producto son:");
     ingresos_Totales(sucursales, ingresosT);
     for (int i = 0; i < ingresosT.length; i++) {
         System.out.println("Producto " + (i+1) + ": " + ingresosT[i]);
     }
        System.out.println(" ");
     break;
     
     case 3:
     System.out.println("calcular el producto con mas ingresos");

        double mayor = ingresosT[0];
        int posicion = 0;
       for (int i = 0; i < ingresosT.length; i++) {
           if(ingresosT[i]>mayor){
            mayor = ingresosT[i];
            posicion =i;
           }
     }
     
       System.out.println("el producto con mayores ingresos es el producto  " +  posicion);
   
System.out.println("los ingresos son: " + mayor);
   System.out.println(" ");
        break;

        case 4:
        System.out.println("ingresos ordenados de forma ascendente:");
        ordenamiento(ingresosT);
        for (int i = 0; i < ingresosT.length; i++) {
          System.out.println("Producto " + (i+1) + ": " + ingresosT[i]);  
        }
        break;

        case 5:
        System.out.println("ingrese el nombre del producto a buscar:");
        String producto = key.next();
        
        if(producto.compareToIgnoreCase("procuto 1") ==0){
            System.out.println("los ingresos del producto 1 son " + ingresosT[0]);
        }else if(producto.compareToIgnoreCase("procuto 2") ==0){
           System.out.println("los ingresos del producto 1 son " + ingresosT[1]);
       }else if(producto.compareToIgnoreCase("procuto 3") ==0){
           System.out.println("los ingresos del producto 1 son " + ingresosT[2]);
       }else if(producto.compareToIgnoreCase("procuto 4") ==0){
           System.out.println("los ingresos del producto 1 son " + ingresosT[3]);
       }else{
           System.out.println("elemento no encontrado");
       }
       System.out.println(" ");
        break;

        case 6:
        System.out.println("saliendo...");
        break;

        default:
        System.out.println("opcion no valida");
        break;
   }

    }while(opcion!=6);


}

public static void recorrer_matriz(double a[][]) {
   for (int i = 0; i < a.length; i++) {
       for (int j = 0; j < a.length; j++) {
           System.out.println("sucursal " + (i+1) + " producto " + (j+1)+ ": " + a[i][j]);
       }
       System.out.println(" ");
   }
}
public static void ingresos_Totales(double a[][],double b[]) {
for (int i = 0; i < a.length; i++) {
   for (int j = 0; j < a[0].length; j++) {
       b[i] += a[j][i];
   }
}
}
private static int cal_mayor(double a[]) {
double mayor = a[0];
int posicion = -1;
for (int i = 0; i < a.length; i++) {
   if(a[i]>mayor){
       mayor = a[i];
       posicion =i;
   }
}
return posicion;

}
private static void ordenamiento(double a[]) {
for (int i = 0; i < a.length-1; i++) {
   for (int j = 0; j < a.length-1; j++) {
       if(a[j]<a[j+1]){
           double aux = a[j];
           a[j] = a[j+1];
           a[j+1] = aux;
       }
   }
}
}
private static void busqueda(double a[],String b ) {
if(b.compareToIgnoreCase("producto 1") ==0){
   System.out.println("los ingresos del producto 1 son " + a[0]);
}else if(b.compareToIgnoreCase("producto 2") ==0){
  System.out.println("los ingresos del producto 1 son " + a[1]);
}else if(b.compareToIgnoreCase("producto 3") ==0){
  System.out.println("los ingresos del producto 1 son " + a[2]);
}else if(b.compareToIgnoreCase("producto 4") ==0){
  System.out.println("los ingresos del producto 1 son " + a[3]);
}else{
  System.out.println("elemento no encontrado");
}
}
 }
    

