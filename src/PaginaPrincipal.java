import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaPrincipal extends JFrame {
    private JLabel LBLNombreClinica;
    private JButton buttonRegistrarMedico;
    private JButton buttonRegistrarPaciente;
    private JButton buttonProgramar;
    private JPanel PaginaPrincipalLabel;

    public PaginaPrincipal() {
    buttonRegistrarMedico.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            InsertarDoctor g1 = new InsertarDoctor();
            g1.VisualizarInsertarDoctor();
        }
    });
    buttonRegistrarPaciente.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            InsertarPaciente IP1 = new InsertarPaciente();
            IP1.VisualizarInsertarPaciente();
        }
    });
    buttonProgramar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });

}
    public void VisualizarPaginaPrincipal () {
        PaginaPrincipal PP1 = new PaginaPrincipal();
        PP1.setContentPane(PP1.PaginaPrincipalLabel);
        PP1.setTitle("Pagina Principal");
        PP1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        PP1.setSize(430,300);
        PP1.setLocationRelativeTo(null);
        PP1.setVisible(true);
    }
    public static void main (String[] args) {
        PaginaPrincipal PP1 = new PaginaPrincipal();
        PP1.setContentPane(PP1.PaginaPrincipalLabel);
        PP1.setTitle("Insertar Paciente");
        PP1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        PP1.setSize(430,300);
        PP1.setLocationRelativeTo(null);
        PP1.setVisible(true);
    }

}
