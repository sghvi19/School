import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;

public class final1 extends ConsoleProgram {
	private HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	private ArrayList<String> list1;
	private ArrayList<String> list2;

	public void run() {
		String friend1;
		String friend2;
		String s = "a";

		try {
			BufferedReader file = new BufferedReader(new FileReader("tries.java"));
			String line = file.readLine();
			while (true) {
				if (line == null)
					break;

				StringTokenizer tok = new StringTokenizer(line);

				friend1 = tok.nextToken();
				friend2 = tok.nextToken();

				if (map.containsKey(friend1)) {
					map.get(friend1).add(friend2);
				} else {
					ArrayList<String> list = new ArrayList<String>();
					list.add(friend2);
					map.put(friend1, list);

				}

				if (map.containsKey(friend2)) {
					map.get(friend2).add(friend1);
				} else {
					ArrayList<String> list = new ArrayList<String>();
					list.add(friend1);
					map.put(friend2, list);

				}
				line = file.readLine();
			}
			file.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}

		findEnemy(s);
		findEnemyOfEnemy();
		if (list2.size() == map.get(s).size() && containsAll(s)) {
			println(true);
		} else {
			println(false);
		}
	}

	private boolean containsAll(String s) {
		for (String str : list2) {
			if (!map.get(s).contains(str))
				return false;
		}
		return true;
	}

	private void findEnemy(String s) {
		list1 = new ArrayList<String>();
		for (String str : map.keySet()) {
			if (!map.get(s).contains(str)) {
				list1.add(str);
			}
		}
	}

	private void findEnemyOfEnemy() {
		list2 = new ArrayList<String>();
		for (String s : list1) {
			for (String str : map.keySet()) {
				if (!map.get(s).contains(str)) {
					list2.add(str);
				}
			}
		}
	}

}
