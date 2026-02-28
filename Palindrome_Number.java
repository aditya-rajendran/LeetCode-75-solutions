class Solution {
    public boolean isPalindrome(int x) {
        int temp= 0;
        String str="";
        String str_num = String.valueOf(x);

        if(x<0){
            return false;
        }

        if(x==0){
            return true;
        }
        
        for(int i=str_num.length()-1; i>=0 ; i--){
	        str +="" + str_num.charAt(i);
        }

        return str.equals(str_num);
    }
}