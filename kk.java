import java.util.Scanner;
import javax.swing.JOptionPane;

public class kk {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int arreglo[] = new int[10];
        jugadores play1;
        play1 = null;
        
        String pass = "soy puto";
        String contra = "";
        boolean salir = false;
        int n;
        while(!salir){ 
        JOptionPane.showMessageDialog(null, "estas atrapado en un bucle ");
        JOptionPane.showMessageDialog(null, "podras salir si dices que eres puto");
        try {
         contra = JOptionPane.showInputDialog("(Di: soy puto)");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buen intento :)");
        }

        jugadores nose = new jugadores();
        try{ 
         if(!nose.isEmpty(contra)){
            for (int i = 0; i < contra.length(); i++) {
               if(Character.isUpperCase(contra.charAt(i)) ){
                 contra = contra.toLowerCase();
                 break;
                }   
            }   
         } 
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Buen intento :)");
        }
        
        if(contra != null && contra.compareTo(pass) == 0){
         salir = true;
        }
     }

     JOptionPane.showMessageDialog(null,"Ahora eres libre :)");

     for (int i = 0; i < arreglo.length; i++) {
         arreglo[i] = (int)(Math.random() * 20 ) +1;
         System.out.println(arreglo[i]);
     }
    System.out.println(" ");
       for (int i = 0; i < arreglo.length; i++) {
         int posicion = i;
         int aux = arreglo[i];
     while (posicion > 0 && arreglo[posicion-1] > aux ) {
         arreglo[posicion] = arreglo[posicion-1];
         posicion--;
     }    
     arreglo[posicion] = aux;
     }

     for (int i : arreglo) {
         System.out.println(i);
     }


    }
}
