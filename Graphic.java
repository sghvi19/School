import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import java.awt.event.ActionEvent;
import java.util.Iterator;


public class Graphic extends GraphicsProgram{
	private static final int distance = 5;
	
	
	
	private JTextField teaField;
	private JTextField subField;
	private JTextField pupField;
	
	private JButton addT;
	private JButton addP;
	private JButton addS;
	private JButton disP;
	private JButton disT;
	
	
	
	
	private School school;
		
		public  void init() {
            school  = new School();
            
            this.setSize(1300, 600);
			
			addT = new JButton("Add Teach");
			addP = new JButton("Add Pupil");
			addS = new JButton("Add Subj");
			disP = new JButton("Display Pupils");
			disT = new JButton("Display Teachers");
			
			JLabel tea = new JLabel("Teach");
			JLabel subj = new JLabel("Subj");
			JLabel pup = new JLabel("Pupil");
			
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
			addT.addActionListener(this);
			add(addS,SOUTH);
			addS.addActionListener(this);
			add(addP,SOUTH);
			addP.addActionListener(this);
			add(disP,SOUTH);
			disP.addActionListener(this);
			add(disT,SOUTH);
			disT.addActionListener(this);
			
			addActionListeners();
			

			
		}
	
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == addT) {
				
				school.addTeacher(teaField.getText());
				
			}
			if(e.getSource() == addP) {
				school.addPupil(pupField.getText(), subField.getText());
			}
			if(e.getSource() == addS) {
				school.addSubject(teaField.getText(), subField.getText());
			}
			if(e.getSource() == disP) {
				displayPupils();
			}
			if(e.getSource() == disT) {
				displayTeachers();
			}
			
			teaField.setText("");
			subField.setText("");
			pupField.setText("");
		}
		
		
		private void displayTeachers() {
			removeAll();
			Iterator<String> it = school.getTeachers(pupField.getText());
			
			if(it == null) return;
			add(new GLabel("Results:", 10, 5));
			int size = 1;
			while(it.hasNext()) {
				println("a");
				String teacher = it.next();
				
				add(new GLabel(teacher, distance , distance*size));
				size++;
			}
		
			
		}

		private void displayPupils() {
			removeAll();
			Iterator<String> it = school.getPupils(teaField.getText());
			
			
		}
	
		
		
}
