import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

public class temporal {
    public static void main(String[] args) {
      ArrayList<Factura> xd = new ArrayList<>();
      FacturaContado contado = new FacturaContado(true, false, 13, LocalDate.now());
      FacturaCredito credito = new FacturaCredito(LocalDate.now(), 5, LocalDate.now());
      xd.add(contado);
      xd.add(credito);


      Factura factura = credito;
 xd.add(factura);
      ((FacturaCredito) xd.get(0)).generarNum();

 FacturaCredito nose = (FacturaCredito) factura;
 
      System.out.println(((FacturaCredito) factura).generarNum());
      ((FacturaCredito) factura).generarNum();
 
      System.out.println(xd.size());

      ArrayList<Vector> ayuda = new ArrayList<>();

           

    }
}
