import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import java.util.Iterator;
import javafx.event.ActionEvent;

public class Graphic extends GraphicsProgram{
	private static final int distance = 5;
	
	
	//let them be default :)
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
	
	School school;
		
		public  void init() {
            school  = new School();
            
            this.setSize(1500, 700);
			
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
				addTeacher();
			}else if(e.getSource() == addP) {
				addPupil();
			}else if(e.getSource() == addS) {
				addSubj();
			}else if(e.getSource() == disP) {
				displayPupils();
			}else if(e.getSource() == disT) {
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
			int size = 0;
			while(it.hasNext()) {
				String teacher = it.next();
				add(new GLabel(teacher, distance , distance*size));
				size++;
			}
		
			
		}

		private void displayPupils() {
			removeAll();
			Iterator<String> it = school.getPupils(teaField.getText());
			
			
		}

		private void addTeacher() {
			school.addTeacher(teaField.getText());
		
		}
	

		private void addSubj() {
			school.addSubject(teaField.getText(), subField.getText());
			
		}

		private void addPupil() {
			school.addPupil(pupField.getText(), subField.getText());
			
		}
		
		
	
		
		
}
