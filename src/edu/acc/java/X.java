package edu.acc.java;
// in-class demo source from 10/20 class

public class X {

	static Integer x = 9;
	Integer y = 11;

	public X() {
		System.out.println("in the constructor ");
	}

	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new X();
		x1.x = 10;
		x1.y = 12;
		System.out.println("\nx1.x=" + x1.x + "\nx1.y=" + x1.y + "\nx2.x=" + x2.x + "\nx2.y=" + x2.y);

		for (int i = 0; i < 10; i++) {
			System.out.println("i=" + i);
		}
		// falls thru to here
		String[] n1 = new String[] { "1", "2", "3" };
		boolean[] n2 = new boolean[52];
		int[][] n3 = new int[52][];
		int mark[] = new int[3];
		int mark2[] = { 1, 2, 3 };
		for (String s : n1) {
			// do something
			System.out.println("s=" + s);
			if (s.equals("2")) {
				break;
			} else if (true) {
				System.out.println("so it was true");
			}
			;
		}
		Days d = Days.Sat;

		switch (d) {
		case Mon:
			System.out.println("Monday");
		case Tue:
			System.out.println("Tuesday");
		case Wed:
			System.out.println("W");
		case Thu:
			System.out.println("Thu");
		case Fri:
			System.out.println("Fri");
		case Sat:
			System.out.println("Sat");
		case Sun:
			System.out.println("Sun");
		default:
			System.out.println("default");
		}

		do {
			stv("do while here");
		} while (false);

		boolean bobFM = false;
		while (bobFM) {
			stv("while here");
		}

		int look = 2;
		if (true) {
			stv("look = " + look);
			int look_again = 4;
			stv("look_again = " + look_again);
		}
		// stv("look_again = " + look_again); // not visible
		stv("" + (10 + 3)); 
		for (int i = 1; i < 100; i++) {
			System.out.print(i + " ");
			if (i % 10 == 0) {
				stv("");
			    continue;
			}
//			    stv("hey");
		}

	}

	static void stv(String msg) {
		System.out.println(msg);
	}

	{
		System.out.println("in the initializer 2");
	}

	{
		System.out.println("in the initializer 1");
	}

}
