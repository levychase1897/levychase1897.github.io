package edu.acc.java;

import java.util.Random;

/**
 * Demo Card class for Lab1 + lecture
 * 
 * 1) Create a class called Card with two attributes: 
       private int age;
       public String name;

   2) Write getter and setter methods for age e.g. 
       public int getAge() { code to return the age }
       public void setAge(int age) { code to set the age }

   3) In your main() method, create 10 instances of Card. 
      Set the age attribute for each Card with the setAge() method. Set the 
      name of each Card with the dot operator. Think about how you might keep
      those ten pointers. What if you had 1000 Cards?

   4) Now go through your cards and print name and age on the Card with 
      the youngest age. Use a relational operator to do this as follows:
         if (relational expression) 
           { block of code }
      What will you need to keep track of and change in the block?

    Stretch goal: use the java.util.Random class we saw in class to add a random number to the age in setAge()
 * 
 * @author pi
 *
 */

public class Card  {

	Random rand = new Random(); // for random ages
	/*
	 * instance variables
	 */
	private int age; // default is zero 
	public String name;  // default is null

	/*
	 * instance methods
	 */
	public int getAge() { 
		return age; 
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * tell the world how this class should be formatted
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Card [age=" + age + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		/*
		 * create 10 instances of Card in an array
		 */
		Card[] cards = new Card[10];
		
		for (int i=0; i < cards.length; i++) {
		    cards[i] = new Card();
		    cards[i].name = "Jane";  // a lot of Jane's
		    cards[i].setAge(cards[i].rand.nextInt(100)); // could have used local rand but
		                                                 // using rand instance on each Card
		}
		/*
		 * Look for youngest age and name
		 */
		int youngestAge = cards[0].getAge();
		String youngestName = cards[0].name;
		
		for (int i=0; i < cards.length; i++) {
			if (cards[i].getAge() < youngestAge) {
				youngestAge = cards[i].getAge();
				youngestName = cards[i].name;
			}
		}
		
		System.out.println("youngest age is " + youngestAge
				+ " for person named " + youngestName);

	}

}
