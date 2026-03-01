class Solution {
    public int romanToInt(String s) {
     //variable to store the sum:
     int sum=0;

     for(int i=0; i<s.length(); i++){

        //check for the substraction instances
        if( (i<=s.length()-2) && ( s.substring(i,i+2).equals("IV") || s.substring(i,i+2).equals("IX") || s.substring(i,i+2).equals("XL") || s.substring(i,i+2).equals("XC") || s.substring(i,i+2).equals("CD") || s.substring(i,i+2).equals("CM"))){
            
            sum += value(s.substring(i,i+2));
            i++;
            continue;
        }

        sum+=value(s.substring(i,i+1));
     }   

     return sum;
    }

    private int value(String c) {
        if (c.equals("I")) return 1;
        if (c.equals("V")) return 5;
        if (c.equals("X")) return 10;
        if (c.equals("L")) return 50;
        if (c.equals("C")) return 100;
        if (c.equals("D")) return 500;
        if (c.equals("M")) return 1000;

        //subtraction instances:
        if (c.equals("IV")) return 4;
        if (c.equals("IX")) return 9;
        if (c.equals("XL")) return 40;
        if (c.equals("XC")) return 90;
        if (c.equals("CD")) return 400;
        if (c.equals("CM")) return 900;

        return 404;
    }
} 