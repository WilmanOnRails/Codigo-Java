import java.util.ArrayList;

public class naves {
  private ArrayList<Integer> posiciones; 
  private char matriz[][];
  public String verDisparo(int a) {
      
      String x = "fallo";
     for (Integer i : posiciones) {
        if(i==a){
            x = "golpe";
            posiciones.remove(a);
            break;
        }
     }
        if(posiciones.isEmpty()){
            x = "kill";
            System.out.println("has hundido la nave");
        }
        return x;
    }

    public void setPosiciones(ArrayList<Integer> a) {
      this.posiciones = a;
    }
    public void setMatriz(char a[][]){
        this.matriz = a;
    }
}
