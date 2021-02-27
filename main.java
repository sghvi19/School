import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class main extends GraphicsProgram {

	public void run() {
		for(int i=0; i<10; i++) {
		GLine line1 =new GLine(0,i*getHeight()/10,getWidth(),i*getHeight()/10);
		add(line1);
		GLine line2=new GLine(i*getWidth()/10,0, i*getWidth()/10, getHeight());
		add(line2);
		}
	}

}
