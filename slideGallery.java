import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class slideGallery extends GraphicsProgram {
	private ArrayList<GRect> list;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int SIZE = 200;
	private static final int DISTANCE = 30;
	private JButton right;
	private JButton left;

	public void run() {
		list = new ArrayList<GRect>();
		fillList();
		left = new JButton("Left");
		right = new JButton("Right");

		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				list.get(i).setSize(SIZE, SIZE);
				add(list.get(i), getWidth() / 2 - list.get(i).getWidth() / 2,
						getHeight() / 2 - list.get(i).getHeight() / 2);
			} else {
				list.get(i).setSize(SIZE / 3, SIZE / 3);
				add(list.get(i), list.get(i - 1).getX() + list.get(i - 1).getWidth() + DISTANCE,
						getHeight() / 2 - list.get(i).getHeight() / 2);
			}
		}

		add(left, SOUTH);
		add(right, SOUTH);
		addActionListeners();
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

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == right) {
			reNew(-1);
		} else {
			reNew(1);

		}
	}

	private void reNew(int n) {
		if (n == -1) {
			for (int i = 0; i < list.size() - 1; i++) {
				list.get(i).setSize(SIZE/3,SIZE/3);
				list.get(i).setLocation(list.get(i).getX() - DISTANCE - list.get(i).getWidth(),
						getHeight() / 2 - list.get(i).getHeight() / 2);
//				if (list.get(i).getWidth() == SIZE) {
//					list.get(i).setSize(SIZE / 3, SIZE / 3);
//					list.get(i + 1).setSize(SIZE, SIZE);
//
//				}

			}
		} else {
			for (int i = 0; i < list.size() - 1; i++) {

				list.get(i).setLocation(list.get(i).getX() + DISTANCE + list.get(i).getWidth(),
						getHeight() / 2 - list.get(i).getHeight() / 2);
			}
		}
	}

}
