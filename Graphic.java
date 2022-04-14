import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import java.awt.event.ActionEvent;
import java.util.Iterator;


public class Graphic extends GraphicsProgram {
	// Constants
	private final int RESULT_X = 10;
	private final int LINE_H = 20;

	// School
	School school;

	// Labels
	JLabel teachLabel;
	JLabel subjLabel;
	JLabel pupilLabel;

	// TextFields
	JTextField teachTextField;
	JTextField subjTextField;
	JTextField pupilTextField;

	// Buttons
	JButton addTeachButton;
	JButton addSubjButton;
	JButton addPupilButton;
	JButton displayPupilsButton;
	JButton displayTeachersButton;

	@Override
	public void init() {
		school = new School();
//		school = new RefactoredÏSchool();

		// Increase size (by default some components will be trimmed and not visible)
		this.setSize(1200, 800);

		// Initialize Labels
		teachLabel = new JLabel("Teach:");
		subjLabel = new JLabel("Subj:");
		pupilLabel = new JLabel("Pupil:");

		// Initialize TextFields
		teachTextField = new JTextField(10);
		subjTextField = new JTextField(10);
		pupilTextField = new JTextField(10);

		// Initialize Buttons
		addTeachButton = new JButton("Add Teach");
		addSubjButton = new JButton("Add Subj");
		addPupilButton = new JButton("Add Pupil");
		displayPupilsButton = new JButton("Display Pupils");
		displayTeachersButton = new JButton("Display Teachers");

		// Add Labels with corresponding TextFields
		add(teachLabel, SOUTH);
		add(teachTextField, SOUTH);
		add(subjLabel, SOUTH);
		add(subjTextField, SOUTH);
		add(pupilLabel, SOUTH);
		add(pupilTextField, SOUTH);

		// Add Buttons
		add(addTeachButton, SOUTH);
		add(addSubjButton, SOUTH);
		add(addPupilButton, SOUTH);
		add(displayPupilsButton, SOUTH);
		add(displayTeachersButton, SOUTH);

		addActionListeners();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 1. Evaluate input
		if (e.getSource() == addTeachButton) {
			addTeacher();
		} else if (e.getSource() == addSubjButton) {
			addSubject();
		} else if (e.getSource() == addPupilButton) {
			addPupil();
		} else if (e.getSource() == displayPupilsButton) {
			displayPupils();
		} else if (e.getSource() == displayTeachersButton) {
			displayTeachers();
		}

		// 2. After All Operations Clear Inputs
		teachTextField.setText("");
		subjTextField.setText("");
		pupilTextField.setText("");
	}

	private void addTeacher() {
		String teacherName = teachTextField.getText();
		school.addTeacher(teacherName);
	}

	private void addSubject() {
		String teacherName = teachTextField.getText();
		String subjectName = subjTextField.getText();
		school.addSubject(teacherName, subjectName);
	}

	private void addPupil() {
		String pupilName = pupilTextField.getText();
		String subjectName = subjTextField.getText();
		school.addPupil(pupilName, subjectName);
	}

	private void displayPupils() {
		String teacherName = teachTextField.getText();
		Iterator<String> it = school.getPupils(teacherName);
		displayContent(it);
	}

	private void displayTeachers() {
		String pupilName = pupilTextField.getText();
		Iterator<String> it = school.getTeachers(pupilName);
		displayContent(it);
	}

	private void displayContent(Iterator<String> it) {
		// 1. Check for iterator
		if (it == null) {
			return;
		}

		// 2. Clear entire screen
		removeAll();

		// 3. Add 'Result' label
		add(new GLabel("Results:", RESULT_X, LINE_H));

		// 4. Iterate with iterator and display all
		int offset = 2;
		while (it.hasNext()) {
			String name = it.next();
			add(new GLabel(name, RESULT_X, LINE_H * offset));
			offset++;
		}
	}

}