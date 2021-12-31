package com.acloudstack.problems;

import java.util.HashMap;
import java.util.Map;

public class CommonProblems {

	public static void main(String[] args) {
		System.out.println("Reverse of Hello World! is - " + reverseString("Hello World!"));
        System.out.println("Reverse of 123456 = " + reverseNum(123456));
        int[] result = twoSum(new int[] {2, 3, 9, 7, 4, 12}, 7);
        System.out.println("TwoSum result is: " + result[0] + ", " + result[1]);
        System.out.println("876 in roman is " + intToRoman(876));
        System.out.println("3000 in roman is " + intToRoman(3000));
        System.out.println("fizzBuzz for 15 is " + fizzBuzz(15));        
    }
    
	// 1.
    public static String fizzBuzz(int num){
    	String str = "";
        int remThree = num%3;
        int remFive = num%5;        
        if(remThree == 0 && remFive == 0){
            str = "FizzBuzz";
        } else if(remThree == 0){
            str = "Fizz";
        } else if(remFive == 0){
            str = "Buzz";
        } else{
            str = "" + num;
        }   
        return str;
    }
    
    // 2. 
    public static int reverseNum(int num){
        long reverse = 0;
        while(num != 0){
        	reverse = reverse * 10 + (num%10);
            num = num / 10;
        }
        return (int)reverse;
    }
    
    // 3.
    public static String reverseString(String str){
    	StringBuilder strBuilder = new StringBuilder();
    	for(int i = str.length()-1; i >= 0; i--) {
    		strBuilder.append(str.charAt(i));
    	}    	
    	return strBuilder.toString();
    }
    
    //4.
    public static int[] twoSum(int[] numbers, int sum){
    	Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    	for(int i = 0; i < numbers.length; i++) {
    		int delta = sum - numbers[i];
    		if(m.containsKey(delta)) {
    			return new int[] {numbers[m.get(delta)], numbers[i]};
    		}
    		m.put(numbers[i], i);
    	}
        return new int[] {-1, -1};
    }
    
    // 5. 
    public static String intToRoman(int num) {
    	String roman = "";
    	String[] units =     {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    	String[] tens =      {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "LC"};
    	String[] hundreds =  {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    	String[] thousands = {"", "M", "MM", "MMM"};
    	roman = thousands[(num%10000)/1000] +
    			hundreds[(num%1000)/100] +
    			tens[(num%100)/10] + 
    			units[num%10];
    	
    	return roman;
    }
    
    // 6. 
    public String romanToInt(String str) {
    	return str;
    }
    
    // 7. 
    public String isPalindrome(String str) {
    	return str;
    }
    
    // 8. 
    public String longestPalindrome(String str) {
    	return str;
    }
    
    // 9. 
    public String detectCapital(String str) {
    	return str;
    }
    
    // design stack, queue, hashset
    
    
}
