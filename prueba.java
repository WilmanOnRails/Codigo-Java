import java.util.Scanner;
public class prueba {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        /*
        boolean sala[][]= new boolean[6][20];
        System.out.println("ingrese");
        int num = key.nextInt();
        System.out.println("ingrese");
        int dim = key.nextInt();
         for (int i = 0;i<dim ; i++) {
             try {
                 sala[num][i] = true;
             } catch (ArrayIndexOutOfBoundsException e) {
                deleteArray(sala,true);
                System.out.println("Error: " + e.getMessage());
                System.out.println("ingrese una cantidad mayor o igual a 5");
                num = key.nextInt();
                System.out.println("cantidad de pc");
                dim = key.nextInt();
                deleteArray(sala,true);
                i=-1;
             }
         }

        for(int i =0;i<20;i++){
         if (sala[num][i]) {
             System.out.println("pc" + (i+1) +" ocupada");
         }else{
             System.out.println("pc" + (i+1) + " disponible");
         }
        }

      for (boolean i : sala[num]) {
          //System.out.println(i);
          if (i) {
            System.out.println("pc ocupada");
        }else{
            System.out.println("pc disponible");
        }
      }
*/
      System.out.println("ingrese la cantidad de primos a mostrar");
    int cantidad = key.nextInt();
    int num = 2; 
    int n = 0; 
    String r = "";
    while (n < cantidad) {
        boolean numP= true;
        for(int i = 2; i < num; i++) {
           if (num%i == 0){
               numP = false;
            } 
           }
              if(numP) {
           r += num + ", ";
           n++;
            }
        num++;
      } 
      System.out.println("los primeros " + cantidad + " primos son: " + r);

      
}
public static void deleteArray(boolean arr[][], boolean index ) {
    for (int i = 0; i < arr.length; i++) {
        for (int m = 0; m < arr.length-1; m++) {
         if(arr[i][m] == index){
            arr = new boolean[arr.length][arr.length - 1];
            
            for(int k = 0; k < i; k++){
                arr[i][k] = !arr[i][k];
            }
            
            for(int j = 0; j < arr.length - 1; j++){
                arr[i][j] = arr[i][j+1];
            }
            break;
        }   
        }
        
    }
}

}



