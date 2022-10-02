import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.w3c.dom.events.Event;

public class image extends JFrame { 

 public image(){
     initUI();
 }

private void initUI(){
    ImageIcon ii = LoadImage();
    JLabel label = new JLabel(ii);
    CreateLayout(label);
    setTitle("imagen");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}


private ImageIcon LoadImage(){
    ImageIcon ii = new ImageIcon("C:\\Users\\Wilman\\Downloads\\scan.jpg");
    return ii;
}
// 
private void CreateLayout(JComponent... arg ){
 Container pane = getContentPane();
 GroupLayout gl = new GroupLayout(pane);
 pane.setLayout(gl);

 gl.setAutoCreateContainerGaps(true);
 gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
 gl.setVerticalGroup(gl.createParallelGroup().addComponent(arg[0]));

 pack();
}

public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
        image x = new image();
        x.setVisible(true);
     });
}

}
