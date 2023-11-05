package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controller.TaskController;

public class FormView extends JFrame{
	
	final private Font mainFont = new Font("Arial", Font.BOLD, 18);
	JTextField tfFirstName, tfLastName;
	JLabel lbResponse;
	private TaskController controller = new TaskController();
	
	public void initialize() {
		
		/*** Form Panel ***/
		JLabel lbFirstName = new JLabel("First Name:");
		lbFirstName.setFont(mainFont);
		
		tfFirstName = new JTextField();
		tfFirstName.setFont(mainFont);
		
		JLabel lbLastName = new JLabel("Last Name:");
		lbLastName.setFont(mainFont);
		
		tfLastName = new JTextField();
		tfLastName.setFont(mainFont);
		
		JPanel formPanel = new JPanel();
		//GridLayout 4 linhas 1 coluna espaços entre os componentes
		//5 horizontal, 5 vertical
		formPanel.setLayout(new GridLayout(4, 1, 5, 5));
		//fundo do painel transparente
		formPanel.setOpaque(false);
		//Adicionar componentes ao panel
		formPanel.add(lbFirstName);
		formPanel.add(tfFirstName);
		formPanel.add(lbLastName);
		formPanel.add(tfLastName);
		
		/*** ResponseLabel ***/
		lbResponse = new JLabel();
		
		/*** Table ***/
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane);
		
		JTable tablePanel = createTable();
		
		scrollPane.setViewportView(tablePanel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Aqui chama-se a controller para realizar o evento
				//do botão
				String firstName = tfFirstName.getText();
				String lastName = tfLastName.getText();
				lbResponse.setText("Hello " + firstName + " " + lastName);
				controller.save();
			}
		});
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Aqui chama-se a controller para realizar o evento
				//do botão
				tfFirstName.setText("");
				tfLastName.setText("");
				lbResponse.setText("");
			}
		});
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
		buttonsPanel.setOpaque(false);
		buttonsPanel.add(btnOk);
		buttonsPanel.add(btnClear);
		
		JPanel mainPanel = new JPanel();
		//define o layout dos campos do paynel
		//BorderLayout separa em norte, leste, centro, oeste e sul
		mainPanel.setLayout(new BorderLayout());
		//define a cor de fundo do painel
		mainPanel.setBackground(new Color(222,222,222));
		//adiciona bordas ao painel principal
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		//Adicionar o formPanel ao mainPanel no campo norte
		mainPanel.add(formPanel, BorderLayout.NORTH);
		//Adicionar o lbWelcome ao mainPanel no campo centro
		mainPanel.add(lbResponse, BorderLayout.CENTER);
		//Adicionar tabela no mainPanel
		
		//Adicionar botões ao mainPanel
		mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
		
		//Configurando o JFrame que é a janela principal;
		add(mainPanel);
		setTitle("Task Form");
		setSize(500,600);
		setMinimumSize(new Dimension(300,400));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private JTable createTable() {
		JTable table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				int index = ((DefaultListSelectionModel) e.getSource()).getSelectedIndices()[0];
				controller.selectTask(index);
			}
		});
		
		return table;
	}
}
