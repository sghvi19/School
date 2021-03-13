import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class main extends ConsoleProgram {
	public void run() {
	String s=readLine("enter: ");
	
	println(rearrange(s));
		
		
		
	}
	
	
	private String rearrange(String text) {
		ArrayList<String> list=new ArrayList<String>();
		StringTokenizer token=new StringTokenizer(text, " ");
		
		while(token.hasMoreTokens()){
			String s=token.nextToken();
			addToList(s,list);
			
			
		}
		
		String result="";
		
		for(int i=0; i<list.size(); i++){
			result+=list.get(i);
			result+=" ";
			
		}
		
		
		return result;
	}


	private void addToList(String s, ArrayList<String> list){
		for(int i=0; i<list.size();i++){
			if(list.size()==0){
				list.add(s);
				break;
			}
			if(list.get(i).length()>s.length()){
				list.add(i,s);
				break;
			}
			if(list.get(i).length()==s.length()&& i!=list.size()-1){
				list.add(i+1,s);
				break;
			}
			if(list.get(i).length()==s.length()&& i==list.size()-1) {
				list.add(s);
			}
		}
		if(!list.contains(s)) {
			list.add(s);
		}

		
		
	}
	
}


	
	
	
	
	
	
	
	
	
//public class main extends GraphicsProgram {
//	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private boolean t1 = true;
//	private boolean t2 = true;
//	private GOval currentOval;
//	private GOval previous = null;
//
//	public void run() {
//		GOval oval;
//		for (int i = 0; i < 25; i++) {
//			Color color = rgen.nextColor();
//			for (int j = 0; j < 2; j++) {
//				int x = rgen.nextInt(0, getWidth() - 40);
//				int y = rgen.nextInt(0, getHeight() - 40);
//				oval = new GOval(x, y, 40, 40);
//				oval.setFilled(true);
//				oval.setColor(color);
//				add(oval);
//			}
//		}
//		addMouseListeners();
//
//		while (true) {
//			pause(2000);
//			Color color = rgen.nextColor();
//			for (int i = 0; i < 2; i++) {
//				int x = rgen.nextInt(0, getWidth() - 40);
//				int y = rgen.nextInt(0, getHeight() - 40);
//				oval = new GOval(x, y, 40, 40);
//				oval.setFilled(true);
//				oval.setColor(color);
//				add(oval);
//			}
//		}
//	}
//
//	public void mouseClicked(MouseEvent e) {
//		if (t1) {
//			currentOval = (GOval) getElementAt(e.getX(), e.getY());
//			t1 = false;
//			if (currentOval != null && previous != null && currentOval != previous) {
//				if (previous != null && currentOval.getColor() == previous.getColor()) {
//					remove(currentOval);
//					remove(previous);
//					t1 = true;
//				}
//			}
//		} else {
//			previous = currentOval;
//			currentOval = (GOval) getElementAt(e.getX(), e.getY());
//			if (currentOval != null && previous != null && currentOval != previous) {
//				if (previous.getColor() == currentOval.getColor()) {
//					remove(previous);
//					remove(currentOval);
//					t1 = true;
//				}
//			} else {
//				previous = currentOval;
//			}
//
//		}
//
//	}
//
//}
