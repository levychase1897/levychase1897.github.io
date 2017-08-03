package edu.acc.java;

/*
Description: Write a class called FC.java that converts a temperature from Farhenheit to Centigrade. 

Result: the answer is printed in the form: <F temp> = <C temp>.

Tips: use the template we saw in class to solve the plane cost program. You need a class called FC that encloses a single method called main to do the work. 
*/

/**
 * Simple Fahrenheit to Centigrade converter
 * @author pi
 *
 */
class FC {
    public static void main(String[] args) {
        float f_temp = 212.0f;
        double c_temp = (f_temp - 32) * 5./9. ;
        System.out.println(f_temp + "F is " + c_temp + "C");
    }
}
