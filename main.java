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
		int m=simulateStrategy(100);
	
	}

	private int simulateStrategy(int n) {
		RandomGenerator rgen=RandomGenerator.getInstance();
		ArrayList<Integer> list=new ArrayList<Integer>();
		double lost=0;
		int counter=0;
		double result=0;
		for(int i=0; i<1000; i++){
			counter=0;
		while(n!=0){
			if(lost==0){
				int number=readInt("Enter number: ");
				if(n>=1){
				
				if(number==rgen.nextInt(0,36)){
					n+=36;
					lost-=36;
					counter++;
				}else{
					n-=1;
					lost+=1;
					counter++;
				}
				}else{
					if(number==rgen.nextInt(0,36)){
						counter++;
						n+=36*n;
					}else{
						n=0;
						counter++;
					}
				}
				
			}else if(lost!=0){
				int number=readInt("Enter number: ");
				double fsoni= (lost+1)/36;
				if(fsoni>=n){
				if(number==rgen.nextInt(0,36)){
					n+=36*fsoni;
					lost-=36*fsoni;
					counter++;
				}else{
					n-=fsoni;
					lost+=fsoni;
					counter++;
				}
				}else{
					if(number==rgen.nextInt(0,36)){
						n+=36*n;
						lost-=36*n;
						counter++;
					}else{
						n=0;
						lost+=36*n;
						counter++;
					}
				}
				
				
			}
			
			
		}
		list.add(counter);
	}
			for(Integer m: list){
				result+=m;
			}
			result/=list.size();
	return (int)result;
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
