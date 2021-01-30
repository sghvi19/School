import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Site {
	private String url;
	private String contest;
	private ArrayList<String> list;
	private String keys;
	
	public Site(String line) {
		StringTokenizer tok = new StringTokenizer(line, " []");
		list=new ArrayList<String>();
		url=tok.nextToken();
		contest=tok.nextToken();
		keys=tok.nextToken();
		
		StringTokenizer tk=new StringTokenizer(keys,",");
		while(tk.hasMoreTokens()) {
			list.add(tk.nextToken());
		}
		

	}

	public String getURL() {
		return url;
	}

	public String getContent() {
		return contest;
	}

	public Iterator<String> getKeywords(){
		return list.iterator();
	}
}
