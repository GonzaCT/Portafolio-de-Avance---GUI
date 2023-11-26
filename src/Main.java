import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InsertarDoctor Ventana = new InsertarDoctor();
                Ventana.setVisible(true);
            }
        });

        PaginaPrincipal PP1 = new PaginaPrincipal();
        PP1.VisualizarPaginaPrincipal();

        BusquedaId p1 = new BusquedaId();
        p1.VisualizarBusquedaId();
    }


}