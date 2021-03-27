package javacatbut;
import static kbuilder.common.Common.*;
import javax.swing.*;
/**
 *
 * @author mipt
 */
public class JavaCatBut
{
static JFrame mainForm = new MainForm();
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    // TODO code application logic here
   // show(mainForm);
      SwingUtilities.invokeLater(new Runnable() {
          public void run() {
              mainForm.setVisible(true);
          }
      });
  }
  
}
