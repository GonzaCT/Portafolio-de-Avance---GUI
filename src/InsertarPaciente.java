import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertarPaciente extends JFrame {
    private JPanel PanelIPaciente;
    private JLabel LBLNombre;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel LBLApellido;
    private JComboBox comboEspecialidad;
    private JTextArea txtComentario;
    private JLabel LBLCommentario;
    private JLabel LBLEspecialidad;
    private JButton buttonIngresar;
public InsertarPaciente() {
    buttonIngresar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}

    public void VisualizarInsertarPaciente() {
        InsertarPaciente IP1 = new InsertarPaciente();
        IP1.setContentPane(IP1.PanelIPaciente);
        IP1.setTitle("Insertar Paciente");
        IP1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        IP1.setSize(430,300);
        IP1.setLocationRelativeTo(null);
        IP1.setVisible(true);
    }

    public static void main(String[] args) {
        InsertarPaciente IP1 = new InsertarPaciente();
        IP1.setContentPane(IP1.PanelIPaciente);
        IP1.setTitle("Insertar Paciente");
        IP1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        IP1.setSize(430,300);
        IP1.setLocationRelativeTo(null);
        IP1.setVisible(true);
    }

}
