import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JLabel;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class slideGallery extends GraphicsProgram {
	private ArrayList<GRect> list;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int SIZE = 200;
	private static final int DISTANCE = 30;

	public void run() {
		list = new ArrayList<GRect>();
		fillList();
//		JLabel left = new JLabel("Left");
//		JLabel right = new JLabel("Right");
	

		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				list.get(i).setSize(SIZE, SIZE);
				add(list.get(i), getWidth() / 2 - list.get(i).getWidth() / 2,
						getHeight() / 2 - list.get(i).getHeight() / 2);
			} else {
				list.get(i).setSize(SIZE/3, SIZE/3);
				add(list.get(i), list.get(i - 1).getX() + SIZE + DISTANCE,
						getHeight() / 2 - list.get(i).getHeight() / 2);
			}
		}

//		add(left, SOUTH);
//		add(right, SOUTH);
//		addActionListeners();
	}

	private void fillList() {
		for (int i = 0; i < 1000; i++) {
			GRect rect = new GRect(0, 0);
			rect.setFilled(true);
			rect.setSize(20, 20);
			rect.setColor(rgen.nextColor());
			list.add(rect);
		}
	}
//
//	public void actionPerformed(ActionEvent e) {
//
//	}

}
