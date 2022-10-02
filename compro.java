import java.util.Scanner;

public class compro {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int posiciones[][] = new int[5][5];
        int naves = 0;
     do{
        //establecer posiciones
        int aux = (int)(Math.random()*2);
        int y =(int)(Math.random()*3);
        int x =(int)(Math.random()*3);
        int x1 = (int)(Math.random()*5);
        boolean seguro = false;

        if(aux==0){
        //posiciones horizontales
        for (int i = 0; i < 3; i++) {
            if(i==2 && seguro==false){
                break;
            }

            if(posiciones[y][x+i] == 0){
                posiciones[y][x+i] = x+i;
                naves++;
                seguro = true;
            }
        }
        }else{
           //posiciones verticales  
            for (int i = 0; i < 3; i++) {
            if(i==2 && seguro==false){
                break;
            }
            
            if(posiciones[y+i][x1] == 0){
                posiciones[y+i][x1] = x1;
                seguro = true;
                naves++;
            } 
        }
        }
        
    }while(naves<9);

    System.out.println();



 }
}
