import java.nio.FloatBuffer;
import java.util.Scanner;
public class adivinar {
    jugadores players[];
    Scanner x = new Scanner(System.in);

 public void startgame(){
    int cantidad;
    boolean ganador = false;
    int num = (int) (Math.random() * (20-1)) + 1;
    int n =0;

    System.out.println("Ingrese la cantidad de jugadores:");
    cantidad = x.nextInt(); 
    players = new jugadores[cantidad];

    for (int i = 0; i < players.length; i++) {
      players[i] = new jugadores();
    }

    System.out.println("Estoy pensando en un numero del 1 al 20");
    System.out.println("Podran adivinarlo?");
    System.out.println(" ");

    while(true){
        for (int i = 0; i < players.length; i++) {
            players[i].adivinar(i+1);
        }

        for (int i = 0; i < players.length; i++) {
            if(players[i].numero==num){
                ganador = true;
                n=i;
                break;
              }
        }

    if(ganador){
     System.out.println("Tenemos un GANADOR!!");
     System.out.println("El ganador es el jugador " + (n+1));
     System.out.println("El numero era " + num);
     System.out.println("GAME OVER");
     break;
    }else{
    System.out.println("Ningun jugador ha adivinado, tendran que intentarlo de nuevo");
    }
    }
}

}
