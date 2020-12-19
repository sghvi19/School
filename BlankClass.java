
/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

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
import acm.program.ConsoleProgram;

public class BlankClass extends Program {
	private JTextField field;
	private GCanvas canvas;
	public void run() {
		field = new JTextField(10);
		add(field, SOUTH);
		field.addActionListener(this);
		canvas=new GCanvas();
		add(canvas);
	}

	public void actionPerformed(ActionEvent e) {
		int x=5;
		int y=5;
		try {
		GImage image=new GImage(field.getText());
		canvas.add(image,x,y);
		}catch(ErrorException ex){
			println("wtf");
		}
	}

}

//mexute varianti 4 amocana 5
//	private final static int CIRCLE_D = 40;
//	private final static int CIRCLE_NUM = 50;
//	private final static int DELAY = 2000;
//	private GOval oval = null;
//	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private int click = 0;
//	private GObject obj;
//	private int counter;
//
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
//
//	public void mouseClicked(MouseEvent e) {
//		if (click==0) {
//			obj = (GOval) getElementAt(e.getX(), e.getY());
//		}
//		if (getElementAt(e.getX(), e.getY()) != null && getElementAt(e.getX(), e.getY()) == obj) {
//			click++;
//		}
//		if (getElementAt(e.getX(), e.getY()) == null || getElementAt(e.getX(), e.getY()) != obj) {
//			click = 0;
//		}
//		if (click == 3) {
//			counter--;
//			remove(getElementAt(e.getX(), e.getY()));
//			click = 0;
//		}
//
//		obj = (GOval) getElementAt(e.getX(), e.getY());
//	}
//
//}
//mexute varianti 4 amocana4 (almost done)
//	private String stri = "";
//
//	public void run() {
//		String str = readLine("Enter: ");
//		int n = readInt("Enter number: ");
//		while (nPlet(str, n)) {
//			int ind = str.indexOf(stri);
//			str = str.substring(0, ind) + str.substring(ind + n + 1);
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
//				if(result==n)break;
//			}
//		}
//		int result1 = 1;
//		if (result == n) {
//			st = st.substring(index - n + 2, index + 2);
//			if (st.length() == n) {
//				for (int i = 0; i < st.length() - 1; i++) {
//					if (st.charAt(i) == st.charAt(i + 1)) {
//						result1++;
//					}
//				}
//			}
//		}
//
//		if (result1 == n) {
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
//
//	private final static int CIRCLE_D = 40;
//	private final static int DELAY = 50;
//	private boolean t = false;
//	RandomGenerator rgen = RandomGenerator.getInstance();
//	private GOval oval=null;
//
//	public void run() {
//		addMouseListeners();
//		while (true) {
//			if (oval != null && oval.getFillColor() != Color.green) {
//				oval.setColor(getRandomColor());
//				pause(DELAY);
//			}
//		}
//	}
//
//	public void mouseClicked(MouseEvent e) {
//		double x=e.getX();
//		double y=e.getY();
//		GObject obj=getElementAt(x,y);
//		if (obj==null) {
//			GOval oval = new GOval(x- CIRCLE_D / 2, y - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
//			oval.setFilled(true);
//			oval.setColor(rgen.nextColor());
//			add(oval);
//		}else  {
//			oval = (GOval) obj;
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
//
//	}
//
//}
// meotxe varianti 3 amocana 4
//	public void run() {
//		String str = readLine("Enter text: ");
//		String result = "";
//		while (numbersInText(str)&& str!=null) {
//			for (int i = 0; i < str.length(); i++) {
//				if (!((char) str.charAt(i) >= 'A' && (char) str.charAt(i) <= 'z')) {
//					int n = (char) str.charAt(i) - '0';
//					for (int j = 0; j < n; j++) {
//						result += str.charAt(i + 1);
//						println(result);
//
//					}
//					str = str.substring(i + 2);
//
//					break;
//				}
//			}
//			while (true) {
//				if ((char) str.charAt(0) >= 'A' && (char) str.charAt(0) <= 'z') {
//					result += str.charAt(0);
//					if (str.length() != 1) {
//						str = str.substring(1);
//					}else {
//						str=null;
//						break;
//					}
//					//println(result);
//				} else {
//					break;
//				}
//			}
//		}
//
//		println(result);
//	}
//	private boolean numbersInText(String str) {
//		for (int i = 0; i < str.length(); i++) {
//			if (!((char) str.charAt(i) >= 'A' && (char) str.charAt(i) <= 'z')) {
//				return true;
//			}
//		}
//		return false;
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
//
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
//		} else if (result % 2 != 0) {
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
//	
// mesame varianti2 amocana 4
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
//	public void run() {
//		boolean t=true;
//		int n = readInt("Enter: ");
//		int result = 0;
//		while (n != -1) {
//			int temp=n;
//			n = readInt("Enter: ");
//			int x=temp-n;
//			if(t) {
//			result+=x;
//			t=false;
//			}
//			if(!t) {
//				result-=x;
//				t=true;
//			}
//		}
//		if(result==0) {
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

//	public void run() {
//		String str1 = readLine("Enter: ");
//		String str2 = readLine("Enter: ");
//
//		for (int i = 0; i < str1.length(); i++) {
//				if(str2.indexOf(str1.charAt(i))!=-1 && str2.indexOf(str1.charAt(i))!= str2.length() ){
//					str2= str2.substring(0,str2.indexOf(str1.charAt(i)))+str2.substring(str2.indexOf(str1.charAt(i))+1,str2.length());
//					println(str2);
//				}else{
//					println(false);
//					break;
//				}
//		}
//		println(true);
//	}
//}

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
//	private GRect rect;
//	private int number = 0;
//	private String num = "0";
//	private GLabel label;
//	private int mouseX;
//	private int counter=0;
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
//
//
//	public void mouseDragged(MouseEvent e) {
//	 if (getElementAt(e.getX(), e.getY()) != null) {
//		 counter++;
//		if(counter%2==0) {
//		 mouseX = e.getX();
//		}
//		if (number != 0) {
//			if (mouseX > e.getX()) {
//				num = "";
//				number--;
//				num += number;
//				remove(label);
//				label = new GLabel(num);
//				add(label, getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
//			}
//		} 
//		if (number != 9) {
//			if (mouseX < e.getX()) {
//				num = "";
//				number++;
//				num += number;
//				remove(label);
//	label = new GLabel(num);
//			add(label, getWidth() / 2 - label.getWidth() / 2, getHeight() / 2 - label.getHeight() / 2);
//				 }
//
//			}
//
//		}
//}
//
//}
// circle in center changing size;
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
//
//
//	private double getDistance(double x1, double y1, double x2, double y2) {
//		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//	}
//
//}