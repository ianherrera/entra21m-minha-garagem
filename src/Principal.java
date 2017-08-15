
import dao.CarroDAO;
import database.Utilitarios;
import java.awt.EventQueue;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Carro;
import view.JFrameInicial;


/**
 *
 * @author Diego schmitt - 08/14/2017
 */
public class Principal {
    
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrameInicial inicial = new JFrameInicial();
                
            }
        });
    }

    
    
    
}
