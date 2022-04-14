import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;
import acmx.export.javax.swing.JFrame;

public class Graphic extends GraphicsProgram{
	JTextField teaField;
	JTextField subField;
	JTextField pupField;
	
	JButton addT;
	JButton addP;
	JButton addS;
	JButton disP;
	JButton disT;
	
	JLabel tea;
	JLabel subj;
	JLabel pup;
	
		
		public  void init() {
			addT = new JButton("Add Teach");
			addP = new JButton("Add Pupil");
			addS = new JButton("Add Subj");
			disP = new JButton("Display Pupils");
			disT = new JButton("Display Teachers");
			
			tea = new JLabel("Teach");
			subj = new JLabel("Subj");
			pup = new JLabel("Pupil");
			
			teaField = new JTextField(10);
			subField = new JTextField(10);
			pupField = new JTextField(10);
			
			add(tea,SOUTH);
			add(teaField,SOUTH);
			add(subj,SOUTH);
			add(subField,SOUTH);
			add(pup,SOUTH);
			add(pupField,SOUTH);
			add(addT,SOUTH);
			add(addS,SOUTH);
			add(addP,SOUTH);
			add(disP,SOUTH);
			add(disT,SOUTH);
			
			addActionListeners();
			

			
		}
		
		public void run() {
			
		}
		
		
}
