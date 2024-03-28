import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankGUI {
    private JFrame frame;
    private JTable table;
    private JButton btnNovaConta;
        private JButton btnSalvarDados;

        public BankGUI() {
            createInterface();
        }

        private void createInterface() {
            frame = new JFrame("Banco");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            // Table setup
            String[] columns = new String[] {"Titular", "Número", "Agência", "Saldo", "Tipo"};
            Object[][] data = {};

            // Add opening curly brace here
            {

        }
        table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);

        // Buttons setup
        btnNovaConta = new JButton("Nova Conta");
        btnSalvarDados = new JButton("Salvar Dados");

        // Layout setup
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnNovaConta);
        buttonPanel.add(btnSalvarDados);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(panel);

        // Event handling
        btnNovaConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to create a new account
            }
        });

        btnSalvarDados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to save data
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BankGUI();
    }
}
           
