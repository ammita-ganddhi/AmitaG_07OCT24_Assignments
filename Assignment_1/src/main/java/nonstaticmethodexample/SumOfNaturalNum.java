/* Write a non-static method “getSum()” to calculate the sum of first 10 natural numbers. (first 10 natural numbers means numbers from 1 to 10) */

package nonstaticmethodexample;

public class SumOfNaturalNum {

    public int getSum() {      // Non-Static Method
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
    	SumOfNaturalNum calculator = new SumOfNaturalNum();
        int result = calculator.getSum();							// calling non-static method
        System.out.println("The sum of the first 10 natural numbers is: " + result);
    }
}



/*
 
The sum of the first 10 natural numbers is: 55
 
*/