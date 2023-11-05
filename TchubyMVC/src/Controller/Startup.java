package Controller;

import java.awt.EventQueue;

import View.FormView;

public class Startup {
	
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormView frame = new FormView();
					frame.setVisible(true);
					frame.initialize();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
