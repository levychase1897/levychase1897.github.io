package edu.acc.java;

/*
 * Write a class called Investment that prints a table of accumulated
  interest for given number of years at a given rate. Assume you start
  with $1000 at period 0. Table should have a header naming the columns,
  followed by the data:

| Period | Interest Rate | Balance |
|:------:|:-------------:| -------:|
|   0    |    6%         | $1000.  |
|   1    |    ...        |  ...    |

* Interest rate, compounding period, and years should be variables hardcoded
  in the program for now.
  Compute how many periods will be needed to cover the years
* Change the program to read the above variables from the arguments sent
  into String[] args (remember where they come from?)

*/

public class Investment {

	public static void main(String[] args) {
		double balance = Double.parseDouble(args[0]);  // converted from hardcoded to args[] based
		double interest_rate = Double.parseDouble(args[1]);  // converted from hardcoded to args[] based
		int years = Integer.parseInt(args[2]);  // converted from hardcoded to args[] based
		int annual_compounding_periods = Integer.parseInt(args[3]);  // converted from hardcoded to args[] based

		System.out.println("Using \ninitial balance: " + balance +
				           "\n rate: " + interest_rate +
				           "\n years: " + years +
				           "\n periods per year: " + annual_compounding_periods + 
				           "\n");
		System.out.println("Period  Rate   Balance\n");

		for (int i = 0; i < years*annual_compounding_periods; i++) {
			System.out.printf("%6d  %4.2f%%  $%,7.2f\n", i, interest_rate*100, balance);
			balance += balance * interest_rate;
			// balance *= (1 + interest_rate); // an alternate way but less
			// clear
		}

		System.out.println("\nFreaky, right?");
	}

}
