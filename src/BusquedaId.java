import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusquedaId extends JFrame{
    private JPanel BusquedaID;
    private JTextField txtID;
    private JButton buscarButton;
    private JLabel LBLID;
    private JLabel LBLDoctores;
    private JButton cancelarButton;
    private JButton darDeBajaButton;
    private JTextArea textArea1;
    private JButton ButtonBuscar;


    public BusquedaId() {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void VisualizarBusquedaId () {
        BusquedaId p1 = new BusquedaId();
        p1.setContentPane(p1.BusquedaID);
        p1.setTitle("Buscar Paciente");
        p1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        p1.setSize(430,300);
        p1.setLocationRelativeTo(null);
        p1.setVisible(true);
    }

    public static void main(String[] args) {
        BusquedaId p1 = new BusquedaId();
        p1.setContentPane(p1.BusquedaID);
        p1.setTitle("Buscar Doctor");
        p1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        p1.setSize(430,300);
        p1.setLocationRelativeTo(null);
        p1.setVisible(true);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
