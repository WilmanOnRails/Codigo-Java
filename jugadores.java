import java.util.Scanner;
public class jugadores{
    int numero;
    //String Strnum = "50"; 
    Scanner x = new Scanner(System.in);
    public void adivinar(int j){
        System.out.println("Jugador " + j + " ingrese su numero");
        try {
         numero = x.nextInt();
         System.out.println("Ha elegido el numero " + numero);   
        } catch (Exception e) {
            System.out.println("Por estar de gracioso, pierdes tu turno");
            x.next();
        }
        System.out.println("");

        //Strnum.indexOf('x');
        //Integer num  =  Integer.parseInt(Strnum);
        //Integer x = new Integer("50");
    }

    public static Boolean isEmpty(CharSequence str) {
        if(str == null || str.length() == 0 ){
            return true;
        }else{
            return false;
        }
    }
/*
//si creo un objeto jugadores, el metodo isEmpty me dara mostrara un mensaje por ser estatico
//es por ello que acontinuacion lo elimino:
    public Boolean isEmpty(CharSequence str) {
        if(str == null || str.length() == 0 ){
            return true;
        }else{
            return false;
        }
    }
    */
}