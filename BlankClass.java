
/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import acm.util.ErrorException;
import acm.util.RandomGenerator;
import acm.graphics.*;

//minMax maxMin
//	private JButton left;
//	private JButton right;
//	private JButton upp;
//	private JButton down;
//	private GOval ball;
//	private double currentX;
//	private double currentY;
//	private static final int size = 40;
//
//	public void run() {
//		int arr[][] = new int[3][3];
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				arr[i][j] = readInt("Enter: ");
//			}
//		}
//		println(miniMax(arr));
//	}
//
//	private int miniMax(int[][] arr) {
//		ArrayList<Integer> mins = new ArrayList<Integer>();
//		ArrayList<Integer> maxs = new ArrayList<Integer>();
//		for (int i = 0; i < arr.length; i++) {
//			int[] ar = arr[i];
//			mins.add(findMin(ar));
//			maxs.add(findMax(ar));
//		}
//			int minMax=mins.get(0);
//			int maxMin=maxs.get(0);
//		for (int i = 0; i < mins.size()-1; i++) {
//			minMax=Math.max(minMax, mins.get(i+1));
//		}
//		for (int i = 0; i < maxs.size()-1; i++) {
//			maxMin=Math.min(maxMin, maxs.get(i+1));
//		}
//		
//		if(minMax<maxMin) {
//			return -1;
//		}
//		if(minMax>maxMin) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
//
//	private int findMin(int[] ar) {
//		int result = ar[0];
//		for (int i = 0; i < ar.length - 1; i++) {
//			result = Math.min(result, ar[i + 1]);
//		}
//		return result;
//	}
//
//	private int findMax(int[] ar) {
//		int result = ar[0];
//		for (int i = 0; i < ar.length - 1; i++) {
//			result = Math.max(result, ar[i + 1]);
//		}
//		return result;
//	}
//
//}

//	private boolean isAnagram(String s1, String s2) {
//		int[] arr1 = new int[26];
//		int[] arr2 = new int[26];
//		for (int i = 0; i < s1.length(); i++) {
//			arr1[s1.charAt(i)-'a']++;
//		}
//		for (int i = 0; i < s2.length(); i++) {
//			arr2[s2.charAt(i)-'a']++;
//		}
//		for (int i = 0; i < s2.length(); i++) {
//			if(arr1[i]!=arr2[i])return false;
//		}
//		return true;
//
//	}

/*
 * ball moving left,right,up,down
 */

//run(){
//draw();
//left = new JButton("Left");
//right = new JButton("Right");
//upp = new JButton("Upp");
//down = new JButton("Down");
//
//add(left, SOUTH);
//add(right, SOUTH);
//add(upp, SOUTH);
//add(down, SOUTH);
//addActionListeners();
//
//}
//	private void draw() {
//		GLine line;
//		for (int i = 0; i < 9; i++) {
//			line = new GLine(i * size, 0, i * size, 8 * size);
//			add(line);
//			line = new GLine(0, i * size, 8 * size, i * size);
//			add(line);
//		}
//
//		ball = new GOval(4 * size, 4 * size, size, size);
//		ball.setFilled(true);
//		ball.setFillColor(Color.BLACK);
//		add(ball);
//
//	}
//
//	public void actionPerformed(ActionEvent e) {
//		currentX = ball.getX();
//		currentY = ball.getY();
//		if (e.getSource() == left) {
//			if (possible()) {
//				ball.setLocation(currentX - size, currentY);
//			} else {
//				println("imposible");
//			}
//		}
//		if (e.getSource() == right) {
//			if (possible()) {
//				ball.setLocation(currentX + size, currentY);
//			}
//		}
//		if (e.getSource() == upp) {
//			if (possible()) {
//				ball.setLocation(currentX, currentY - size);
//			}
//		}
//		if (e.getSource() == down) {
//			if (possible()) {
//				ball.setLocation(currentX, currentY + size);
//			}
//		}
//
//	}
//
//	private boolean possible() {
//		if (currentX - size < 0 || currentX + size > 7 * size || currentY - size < 0 || currentY + size > 7 * size)
//			return false;
//		return true;
//	}
//
//}
/*
 * school interactors
 */
//private JTextField field1;
//private JTextField field2;
//private JTextField field3;
//private JButton addTeach;
//private JButton addSubj;
//private JButton addPupil;
//private JButton disPup;
//private JButton disTeach;
//private School school;
//		school = new School();
//		JLabel teach = new JLabel("Teach:");
//		field1 = new JTextField(5);
//		// field1.addActionListener(this);
//		JLabel subj = new JLabel("subj:");
//		field2 = new JTextField(5);
//		// field2.addActionListener(this);
//		JLabel pupil = new JLabel("Pupil:");
//		field3 = new JTextField(5);
//		// field3.addActionListener(this);
//		addTeach = new JButton("Add Teach");
//		addSubj = new JButton("Add Subj");
//		addPupil = new JButton("Add Pupil");
//		disPup = new JButton("Display Pupils");
//		disTeach = new JButton("Display Teachers");
//
//		add(teach, SOUTH);
//		add(field1, SOUTH);
//		add(subj, SOUTH);
//		add(field2, SOUTH);
//		add(pupil, SOUTH);
//		add(field3, SOUTH);
//		add(addTeach, SOUTH);
//		add(addSubj, SOUTH);
//		add(addPupil, SOUTH);
//		add(disPup, SOUTH);
//		add(disTeach, SOUTH);
//		addActionListeners();
// }

//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == addTeach) {
//			school.addTeacher(field1.getText());
//			field1.setText("");
//		}
//		if (e.getSource() == addSubj) {
//			school.addSubject(field1.getText(), field2.getText());
//			field1.setText("");
//			field2.setText("");
//		}
//		if (e.getSource() == addPupil) {
//			school.addPupil(field3.getText(), field2.getText());
//			field2.setText("");
//			field3.setText("");
//		}
//		if (e.getSource() == disPup) {
//			removeAll();
//			Iterator<String> pupils =  school.getPupils(field1.getText());
//			while (pupils.hasNext()) {
//				println(pupils.next());
//			}
//
//		}
//		if (e.getSource() == disTeach) {
//			Iterator<String> teachers = school.getTeachers(field3.getText());
//			while (teachers.hasNext()) {
//				println(teachers.next());
//			}
//
//		}
//	}
//
//}

//mexute varianti 4 amocana 5
//public class BlankClass extends GraphicsProgram {
//	private final static int CIRCLE_D = 40;
//	private final static int CIRCLE_NUM = 50;
//	private final static int DELAY = 2000;
//	private GOval oval = null;
//	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private int click = 0;
//	private int counter;
//	private GOval ball1;
//	private GOval ball2;
//	public void run() {
//		addMouseListeners();
//		for (int i = 0; i < CIRCLE_NUM; i++) {
//			int x = rgen.nextInt(0, getWidth() - CIRCLE_D);
//			int y = rgen.nextInt(0, getHeight() - CIRCLE_D);
//			oval = new GOval(x, y, CIRCLE_D, CIRCLE_D);
//			oval.setFilled(true);
//			oval.setColor(rgen.nextColor());
//			add(oval);
//		}
//		counter = CIRCLE_NUM;
//		while (true) {
//			if (counter == 0)
//				break;
//			pause(DELAY);
//			counter++;
//			int x = rgen.nextInt(0, getWidth() - CIRCLE_D);
//			int y = rgen.nextInt(0, getHeight() - CIRCLE_D);
//			oval = new GOval(x, y, CIRCLE_D, CIRCLE_D);
//			oval.setFilled(true);
//			oval.setColor(rgen.nextColor());
//			add(oval);
//		}
//	}
//	public void mouseClicked(MouseEvent e) {
//		click++;
//		if(getElementAt(e.getX(), e.getY()) == null) {
//			click=0;
//		}
//		if (click % 3 == 0 && getElementAt(e.getX(), e.getY()) != null) {
//			if (getElementAt(e.getX(), e.getY()) == ball2) {
//				remove(ball2);
//			}else {
//			
//				click=1;
//			}
//		}
//		if (click % 3 == 2 && getElementAt(e.getX(), e.getY()) != null) {
//			ball2 = (GOval) getElementAt(e.getX(), e.getY());
//			if(ball1!=ball2) {
//				click=1;
//			}
//		}
//		if (click % 3 == 1&& getElementAt(e.getX(), e.getY()) != null) {
//			ball1 = (GOval) getElementAt(e.getX(), e.getY());		
//		}
//	}
//}

//}
//mexute varianti 4 amocana4 (almost done)

//public class BlankClass extends ConsoleProgram {
//	private String stri = "";
//	public void run() {
//		String str = readLine("Enter: ");
//		int n = readInt("Enter number: ");
//		while (nPlet(str, n)) {
//			int ind = str.indexOf(stri);
//			str = str.substring(0, ind) + str.substring(ind + n );
//		}
//		println(str);
//	}
//
//	private boolean nPlet(String st, int n) {
//		int index = 0;
//		int result = 1;
//		for (int i = 0; i < st.length() - 1; i++) {
//			if (st.charAt(i) == st.charAt(i + 1)) {
//				result++;
//				index = i;
//				if (result == n)                                            
//					break;                                               
//			}
//		}
//		if (result == n) {
//			st = st.substring(index - n + 2, index + 2);
//			stri = st;
//			return true;
//		}
//		return false;
//	}
//}
//mexute varianti 4 amocana3
//	public void run() {
//		int n = readInt("Enter: ");
//		int temp = n;
//		int m=readInt("Enter: ");
//		int x=m/temp;
//		while (true) {
//			temp= m;
//			m = readInt("Enter: ");
//			if(m==-1)break;
//			if(x!=m/temp) {
//				println("not a progression");
//			}
//			 x=m/temp;
//		}
//		println("progression");
//	}
//
//}
//meotxe varianti 3 amocana5

//public class BlankClass extends GraphicsProgram {
//	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private GOval oval;
//	private boolean t = false;
//	private GOval ovals;
//	public void run() {
//		addMouseListeners();
//		while (true) {
//			if (t && ovals.getColor() != Color.green) {
//				Color color=getRandomColor();
//				ovals.setColor(color);
//			}
//
//		}
//	}
//
//	public void mouseClicked(MouseEvent e) {
//		if (getElementAt(e.getX(), e.getY()) == null) {
//			oval = new GOval(e.getX() - 20, e.getY() - 20, 40, 40);
//			oval.setFilled(true);
//			oval.setColor(rgen.nextColor());
//			add(oval);
//		} else {
//			 ovals = (GOval) getElementAt(e.getX(), e.getY());
//
//		}
//
//	}
//
//	private Color getRandomColor() {
//		int x = rgen.nextInt(0, 4);
//		if (x == 0) {
//			return Color.BLUE;
//		}
//		if (x == 1) {
//			return Color.RED;
//		}
//		if (x == 2) {
//			return Color.CYAN;
//		}
//		if (x == 3) {
//			return Color.GRAY;
//		} else {
//			return Color.green;
//		}
//	}
//
//}

// meotxe varianti 3 amocana 4
//public class BlankClass extends ConsoleProgram {
//
//	public void run() {
//		String str = readLine("Enter text: ");
//		String result = "";
//		for (int i = 0; i < str.length(); i++) {
//			if (Character.isDigit(str.charAt(i))) {
//				int x = str.charAt(i) - '0';
//				for (int j = 0; j < x; j++) {
//					result+=str.charAt(i+1);
//				}
//				i=i+1;
//			}else {
//				result+=str.charAt(i);
//			}
//		}
//		println(result);
//
//	}
//
//}

// meotxe varianti 3 amocana 3
//	public void run() {
//		int m=readInt("Enter number: ");
//		int n=readInt("Enter number: ");
//		if((n!=1 || m!=0) && (n!=0 || m!=1))println("false");
//		while (true) {
//			 int c = readInt("Enter number: ");
//			 if(c==-1)break;
//			 if(c!=m+n) {
//				 println("not fibonacci");
//				 break;
//			 }
//			 m=n;
//			 n=c;
//			 
//		}
//		println("fibonacci");
//	}
//}

// mesame varianti 2 amocana 5
//public class BlankClass extends GraphicsProgram {
//	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private final static int CIRCLE_D = 40;
//	private final static int CIRCLE_NUM = 25;
//	private final static int DELAY = 2000;
//	private GOval oval = null;
//	private int result = 0;
//	private GOval oval1 = null;
//	private GOval oval2 = null;
//
//	public void run() {
//		addMouseListeners();
//		for (int i = 0; i < CIRCLE_NUM; i++) {
//			Color color = rgen.nextColor();
//			for (int j = 0; j < 2; j++) {
//				int x = rgen.nextInt(0, getWidth() - CIRCLE_D);
//				int y = rgen.nextInt(0, getHeight() - CIRCLE_D);
//				oval = new GOval(x, y, CIRCLE_D, CIRCLE_D);
//				oval.setFilled(true);
//				oval.setFillColor(color);
//				add(oval);
//			}
//		}
//
//		while (true) {
//			pause(DELAY);
//			Color color = rgen.nextColor();
//			for (int j = 0; j < 2; j++) {
//				int x = rgen.nextInt(0, getWidth() - CIRCLE_D);
//				int y = rgen.nextInt(0, getHeight() - CIRCLE_D);
//				oval = new GOval(x, y, CIRCLE_D, CIRCLE_D);
//				oval.setFilled(true);
//				oval.setFillColor(color);
//				add(oval);
//			}
//
//		}
//	}
//
//	public void mouseClicked(MouseEvent e) {
//
//		if (result % 2 == 0) {
//			oval1 = (GOval) getElementAt(e.getX(), e.getY());
//			result++;
//			if (oval1 != oval2 && oval1 != null && oval2 != null) {
//				if (oval1.getFillColor() == oval2.getFillColor()) {
//					remove(oval1);
//					remove(oval2);
//					oval1 = null;
//					oval2 = null;
//				}
//			}
//
//		} else  {
//			oval2 = (GOval) getElementAt(e.getX(), e.getY());
//			result++;
//			if (oval1 != oval2 && oval1 != null && oval2 != null) {
//				if (oval1.getFillColor() == oval2.getFillColor()) {
//					remove(oval1);
//					remove(oval2);
//					oval1 = null;
//					oval2 = null;
//				}
//			}
//		}
//
//	}
//}

// mesame varianti2 amocana 4
//public class BlankClass extends ConsoleProgram{
//	public void run() {
//	
//			String str = readLine("Enter: ");
//			while (doubledElements(str)) {
//				for (int i = 0; i < str.length() - 1; i++) {
//					if (str.charAt(i) == str.charAt(i + 1)) {
//						str = str.substring(0, i) + str.substring(i + 2);
//					}
//				}
//			}
//			println(str);
//	}
//
//	private boolean doubledElements(String str) {
//		for (int i = 0; i < str.length() - 1; i++) {
//			if (str.charAt(i) == str.charAt(i + 1)) {
//				return true;
//			}
//		}
//		return false;
//	}
//}

// mesame varianti 2 amocana 3
//public class BlankClass extends ConsoleProgram{
//	public void run() {
//		boolean t=true;
//		int x=readInt("enter ");
//		int y=readInt("enter ");
//		int d=y-x;
//		while(true) {
//			int next=readInt("enter ");
//			if(next==-1) {
//				break;
//			}
//			if(next-y!=d) {
//				t=false;
//			}
//			y=next;
//		}
//		if(t) {
//			println("progression");
//		}else {
//			println("not a progression");
//		}
//
//	}
//}

// meore varianti 1 amocana 4
//	public void run() {
//		int result = 0;
//		String newString = "";
//		String str = readLine("Enter: ");
//		int j = 0;
//		for (int i = 0; i < str.length(); i++) {
//
//			for (j = i; j < str.length(); j++) {
//				if (i != str.length() - 1) {
//					if (str.charAt(i) == (str.charAt(j))) {
//						result++;
//
//					} else {
//						i = j - 1;
//						break;
//					}
//				}
//			}
//
//			if (result != 1 && i!=str.length() - 1) {
//				newString += result + str.substring(i, j);
//				println(newString);
//			}
//			if (result == 1  && i!=str.length() - 1) {
//				newString += str.charAt(i);
//				println(newString);
//			}
//			result = 0;
//
//		}
//	
//		println(newString);
//
//	}
//}

//meore varianti 1 amocana 3
//
//	public void run() {
//			int n=readInt("Enter: ");
//			int m=readInt("Enter: ");
//			int result=0;
//			while(m/n!=0) {
//				m/=n;
//				result++;
//			}
//			println(result);
//			
//	}

//	// 1varianti amocana 3
//	RandomGenerator rgen = RandomGenerator.getInstance();
//	private int random;	
//	public void run() {
//		int results=0;
//		int n = readInt("Enter number: ");
//		int result = 0;
//		for (int i = 0; i < 100; i++) {
//			while (true) {
//				random=rgen.nextInt(1,2);
//				if(n==0)break;
//				if (random == 1) {
//					n=n/2;
//					result++;
//				}
//				if(random==2) {
//					n--;
//					result++;
//				}
//			}
//			results+=result;
//			result=0;
//		}
//		results/=100;
//	}
//}

// 1 varianti1 amocana 3
public class BlankClass extends ConsoleProgram {
	public void run() {
		String str1 = readLine("Enter: ");
		String str2 = readLine("Enter: ");

		for (int i = 0; i < str1.length(); i++) {
			if (str2.indexOf(str1.charAt(i)) != -1 && str2.indexOf(str1.charAt(i)) != str2.length()) {
				str2 = str2.substring(0, str2.indexOf(str1.charAt(i)))
						+ str2.substring(str2.indexOf(str1.charAt(i)) + 1, str2.length());
				
			} else {
				println(false);
				break;
			}
		}
		println(true);
	}
}

// 1 varianti1 amocana 2

//	public void run() {
//		int result=0;
//		int n = readInt("Enter number: ");
//		for (int i = 1; i <= n; i++) {
//			if(n%i==0) {
//				if(isPrime(i) && result<i) {
//					result=i;
//				}
//			}
//		}
//		println(result);
//	}
//	
//	private boolean isPrime(int x) {
//		int prime=0;
//		for(int i=1; i<=x; i++) {
//			if(x%i==0) {
//				prime++;
//			}
//		}
//		if(prime==2) return true;
//		return false;
//	}
// 1 variant1 amocana 1

//public class BlankClass extends GraphicsProgram {
//	private GRect rect;
//	private int number = 0;
//	private String num = "0";
//	private GLabel label;
//	private int mouseX;
//	private int counter = 0;
//
//	public void run() {
//		addMouseListeners();
//		draw();
//	}
//
//	private void draw() {
//		rect = new GRect(getWidth() / 2 - 100, getHeight() / 2 - 100, 200, 200);
//		add(rect);
//		label = new GLabel(num);
//		add(label, getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
//	}
//
//	public void mouseDragged(MouseEvent e) {
//		if (getElementAt(e.getX(), e.getY()) != null) {
//			counter++;
//			if (counter % 2 == 0) {
//				mouseX = e.getX();
//			}
//			if (number != 0) {
//				if (mouseX > e.getX()) {
//					num = "";
//					number--;
//					num += number;
//					remove(label);
//					label = new GLabel(num);
//					add(label, getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
//				}
//			}
//			if (number != 9) {
//				if (mouseX < e.getX()) {
//					num = "";
//					number++;
//					num += number;
//					remove(label);
//					label = new GLabel(num);
//					add(label, getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
//				}
//
//			}
//
//		}
//	}
//
//}
// circle in center changing size;
//public class BlankClass extends GraphicsProgram {
//	private GOval oval;
//	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private static final int CIRCLE_RADIUS = 100;
//
//	private double mouseX;
//	private double mouseY;
//	private double radius;
//
//	private int counter;
//
//	public void init() {
//		oval = null;
//		addMouseListeners();
//		radius = CIRCLE_RADIUS;
//		counter = 0;
//	}
//
//	public void run() {
//		if (oval == null) {
//			oval = new GOval(getWidth() / 2.0 - CIRCLE_RADIUS, getHeight() / 2.0 - CIRCLE_RADIUS, 2 * CIRCLE_RADIUS,
//					2 * CIRCLE_RADIUS);
//			oval.setFilled(true);
//			oval.setFillColor(Color.RED);
//			add(oval);
//		}
//	}
//
//	public void mouseClicked(MouseEvent e) {
//		if (getElementAt(e.getX(), e.getY()) == oval) {
//			oval.setFillColor(getRandomColor());
//		}
//	}
//
//	public void mouseMoved(MouseEvent e) {
//		mouseX = e.getX();
//		mouseY = e.getY();
//	}
//
//	private Color getRandomColor() {
//		return rgen.nextColor();
//	}
//
//	public void mouseDragged(MouseEvent e) {
//		double xCentre = getWidth() / 2.0;
//		double yCentre = getHeight() / 2.0;
//		counter++;
//
//		if (counter % 2 == 0) {
//			mouseX = e.getX();
//			mouseY = e.getY();
//		}
//
//		double startDistance = getDistance(xCentre, yCentre, mouseX, mouseY);
//		double endDistance = getDistance(xCentre, yCentre, e.getX(), e.getY());
//
//		double diff = endDistance - startDistance;
//
//		double newRadius = radius + diff;
//		radius = newRadius;
//		oval.setBounds(xCentre - newRadius, yCentre - newRadius, 2 * newRadius, 2 * newRadius);
//	}
//
//	private double getDistance(double x1, double y1, double x2, double y2) {
//		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//	}
//}
