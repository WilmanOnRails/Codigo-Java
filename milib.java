import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class milib{
   
    public void ordenamientoInserccion(int a[]) {
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

    public int busqueda(int elemento, int array[]) {
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

    public void eliminarElementoArray(int a[],int b[],int elemento_e) {
        
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
    
    public void ordenSeleccion(int a[]) {
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

    public int randomNum(int min,int max){
        return (int)(Math.random() * (max-min) + min);
    }

    public String generarCadena(int length){
    String cadena = "";
    for (int i = 0; i < length; i++) {
        int x = (int)(Math.random() * 2);
        if(x==1){
            char min = (char) ((int) Math.floor(Math.random() * (123-97) +97));
            cadena += min;
        }else{
           char may = (char) ((int) Math.floor(Math.random() * (91-65) +65)); 
           cadena += may;
        }
    }
    return cadena;
    }

    public int generarNum(int length){
        int num =0;
        for (int i = 0; i < length; i++) {
            char min = (char) ((int) Math.floor(Math.random() * (58-48) +48));
            num += min;
        }
        return num;
    }

    public String generarContra(int length){
        String contra = "";
        for (int i = 0; i < length; i++) {
            int x = (int)(Math.random() * 3);
            if(x==1){
                char min = (char) ((int) Math.floor(Math.random() * (123-97) +97));
                contra += min;
            }else if(x==2){
               char may = (char) ((int) Math.floor(Math.random() * (91-65) +65)); 
               contra += may;
            }else{
                char mun = (char) ((int) Math.floor(Math.random() * (58-48) +48));
                contra += mun;
            }
        }
        return contra;
    }

    public void image(String path) throws IOException{
        File file = new File(path);
        BufferedImage bufferedImage = ImageIO.read(file);

        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout());
        
        jFrame.setSize(500, 500);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int[] ecCuadratica(int a,int b, int c){
        int soluciones[] = new int[2];
        soluciones[0] = (int)(-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/2*a;
        soluciones[1] = (int)(-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/2*a;
        return soluciones;
    }

    

}
