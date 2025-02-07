import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrmEstadistica extends JFrame {

    public FrmEstadistica() {
        setSize(400, 300);
        setTitle("Calculos estadísticos");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDato = new JLabel("Dato");
        lblDato.setBounds(10, 10, 100, 25);
        getContentPane().add(lblDato);

        JTextField txtDato = new JTextField();
        txtDato.setBounds(80, 10, 100, 25);
        getContentPane().add(txtDato);

        JLabel lblMuestra = new JLabel("Muestra");
        lblMuestra.setBounds(210, 10, 100, 25);
        getContentPane().add(lblMuestra);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(80, 40, 100, 25);
        getContentPane().add(btnAgregar);

        JButton btnQuitar = new JButton("Quitar");
        btnQuitar.setBounds(80, 70, 100, 25);
        getContentPane().add(btnQuitar);

        JList lstMuestra = new JList();
        JScrollPane spMuestra = new JScrollPane(lstMuestra);
        spMuestra.setBounds(210, 40, 100, 150);
        getContentPane().add(spMuestra);

        JButton btnEstadistica = new JButton("Estadística");
        btnEstadistica.setBounds(10, 200, 100, 25);
        getContentPane().add(btnEstadistica);

        JComboBox cmbEstadistica = new JComboBox();
        cmbEstadistica.setBounds(110, 200, 100, 25);
        String[] opciones = new String[] { "Sumatoria", "Promedio", "Desviación", "Máximo", "Mínimo", "Moda" };
        DefaultComboBoxModel mdlOpciones = new DefaultComboBoxModel(opciones);
        cmbEstadistica.setModel(mdlOpciones);
        getContentPane().add(cmbEstadistica);

        JTextField txtEstadistica = new JTextField();
        txtEstadistica.setBounds(210, 200, 100, 25);
        getContentPane().add(txtEstadistica);
    }

}
