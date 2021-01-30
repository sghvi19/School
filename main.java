import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class main extends ConsoleProgram {
	private JTextField text;

	public void run() {
		text = new JTextField(10);
		text.addActionListener(this);
		addActionListeners();

	}

	public void actionPerformed(ActionEvent e) {
		
	}

}
