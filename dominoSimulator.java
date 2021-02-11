import java.util.ArrayList;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class dominoSimulator extends ConsoleProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private ArrayList<Integer> list1 = new ArrayList<Integer>();
	private ArrayList<Integer> list2 = new ArrayList<Integer>();

	public void run() {
		int n = 10000;
		int res = 0;
		for (int i = 0; i < n; i++) {
			simulate();
			list1.clear();
			list2.clear();
		}

		for (int i : list) {
			res += i;
		}
		res = res / n;
		println(res);
	}

	private void simulate() {
		int counter = 0;
		while (true) {

			for (int i = 0; i < 2; i++) {
				counter++;
				cards();
				if (check()) {
					list.add(counter);
					return;
				}
			}
			list1.clear();
			list2.clear();
		}
		
	}

	private void cards() {
		for (int i = 0; i < 14; i++) {
			if (i % 2 == 0) {
				while (true) {
					int x = rgen.nextInt(1, 28);
					if (!list1.contains(x) && !list2.contains(x)) {
						list1.add(x);
						break;
					}
				}
			}
			if (i % 2 != 0) {
				while (true) {
					int x = rgen.nextInt(1, 28);
					if (!list2.contains(x) && !list1.contains(x)) {
						list2.add(x);
						break;
					}
				}
			}
		}
	}

	private boolean check() {
		int result = 0;
		if (list1.contains(1)) {
			result++;
		}
		if (list1.contains(2)) {
			result++;
		}

		if (list1.contains(3)) {
			result++;
		}
		if (list1.contains(4)) {
			result++;
		}
		if (list1.contains(5)) {
			result++;
		}
		if (list1.contains(6)) {
			result++;
		}
		if (list1.contains(7)) {
			result++;
		}
		if (result >= 5)
			return true;
		return false;

	}
}
