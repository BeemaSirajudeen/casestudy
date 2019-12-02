package welcome;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class booking {

	String ac;
	String cot;
	String cable;
	String wifi;
	String laundary;
	void Book(String ac,String cot,String cable,String wifi,String laundary);
	
	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundary;
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					booking window = new booking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
