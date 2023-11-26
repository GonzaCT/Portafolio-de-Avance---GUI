import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertarDoctor extends JFrame{

    private JPanel PanelIDoctor;
    private JTextField txtId;
    private JTextField txtNombre;
    private JLabel LBL_ID;
    private JLabel LBL_Nombre;
    private JLabel LBL_Apellidos;
    private JLabel LBL_Especialidad;
    private JComboBox cmbEspecialidad;
    private JTextField txtApellidos;
    private JButton ButtonInsertar;
    public InsertarDoctor() {
        ButtonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ButtonInsertar,"Accion Realizada");
            }
        });
    }
    public void VisualizarInsertarDoctor() {
        InsertarDoctor g1 = new InsertarDoctor();
        g1.setContentPane(g1.PanelIDoctor);
        g1.setTitle("Insertar Doctor");
        g1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        g1.setSize(430,300);
        g1.setLocationRelativeTo(null);
        g1.setVisible(true);
    }

    public static void main(String[] args) {
        InsertarDoctor g1 = new InsertarDoctor();
        g1.setContentPane(g1.PanelIDoctor);
        g1.setTitle("Insertar Doctor");
        g1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        g1.setSize(430,300);
        g1.setLocationRelativeTo(null);
        g1.setVisible(true);
    }

}
