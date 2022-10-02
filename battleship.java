import java.util.ArrayList;
import java.util.Scanner;

public class battleship {
private ArrayList<naves> navesH = new ArrayList<naves>();
private ArrayList<naves> navesL = new ArrayList<naves>();
private int posiciones[][] = new int[5][5];
private int intentos = 0;
private Scanner key = new Scanner(System.in);

public void empezarJuego(){
int aux = (int)(Math.random()*2);
int y =(int)(Math.random()*3);
int x =(int)(Math.random()*3);
//establecer posiciones
if(aux==0){
//posiciones horizontales
for (int i = 0; i < 3; i++) {
    posiciones[y][x+i] = x+i;
}
}else{
   //posiciones verticales  
for (int i = 0; i < posiciones.length; i++) {
    posiciones[y+i][x] = y+i;
}
}


        
}

public void adivinar(){
    System.out.println("ingrese una posicion");
    char posicion = key.next().charAt(1);
    ver_intentoH(posicion);
    ver_intentoL(posicion);
}

private int ver_intentoH(char a) {
    int A = Integer.parseInt(Character.toString(a));
    intentos++;
    String x = "fallo";
    for (int i = 0; i < navesH.size(); i++) {
        x = navesH.get(i).verDisparo(A);
        
        if(x.equals("golpe")){
            break;
        }

        if(x.equals("kill")){
            navesH.remove(A);
            break;
        }
    }
    System.out.println(x);
    return 0;
}

private int ver_intentoL(char a) {
    int A = Integer.parseInt(Character.toString(a));
    intentos++;
    String x = "fallo";
    for (int i = 0; i < navesH.size(); i++) {
        x = navesH.get(i).verDisparo(A);
        
        if(x.equals("golpe")){
            return -1;
        }

        if(x.equals("kill")){
            navesH.remove(A);
            return -1;   
        }
    }
    System.out.println(x);
    return 0;
}


public static void main(String[] args) {
    battleship x = new battleship();
    x.empezarJuego();

   
    
}
}


