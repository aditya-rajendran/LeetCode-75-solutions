class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result ="";
        int len1=word1.length();
        int len2=word2.length();

        if(len1<len2){
            for(int i=0;i<len1;i++){
                result+=""+word1.charAt(i)+word2.charAt(i);
            }
            result+=word2.substring(len2-len1);
            return result;
        }else{
            for(int i=0;i<len2;i++){
                result+=""+word1.charAt(i)+word2.charAt(i);
            }
            if(len1==len2){
                return result;
            }
            result+=word1.substring(len1-len2);
            return result;
        }
    }
}