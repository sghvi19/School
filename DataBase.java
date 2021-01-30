import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import acm.util.ErrorException;

public class DataBase {
	private Site site;
	private HashMap<HashMap<String, String>, ArrayList<String>> map;

	public DataBase(String filename) {
		map = new HashMap<HashMap<String, String>, ArrayList<String>>();

		try {
			BufferedReader file = new BufferedReader(new FileReader(filename));
			String line = file.readLine();
			while (true) {
				site = new Site(line);
				if (site == null) {
					break;
				}
				HashMap<String, String> mp = new HashMap<String, String>();
				mp.put(site.getURL(), site.getContent());
				map.put(mp, site.getKeywords());
			}
			file.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}
	}

	public Site getSiteByURL(String url) {
		for (HashMap m : map.keySet()) {
			if(m.containsKey(url)) {
				return URL.get(url);
			}
		}
		
	}

	public List<Site> getSiteByKeyword(String keyword) {

	}
}
