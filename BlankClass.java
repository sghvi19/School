
/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import acm.util.RandomGenerator;

import acm.graphics.*;
import acm.program.ConsoleProgram;

public class BlankClass extends ConsoleProgram {
	public void run() {
		String str = readLine("Enter: ");
		// str+=" ";
		// println(str.substring(3));
		while (true) {
			while (doubledElements(str)) {
				for (int i = 0; i < str.length() - 1; i++) {
					if (str.charAt(i) == str.charAt(i + 1)) {
						str = str.substring(0, i) + str.substring(i + 2);
					}
				}
			}
			println(str);
		}
	}

	private boolean doubledElements(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				return true;
			}
		}
		return false;
	}
}
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