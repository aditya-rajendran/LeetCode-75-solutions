class Index_Of_1st_Occurence {
    public int strStr(String haystack, String needle) {
        int nelen = needle.length();
        int haylen = haystack.length();

    //taking care of an edge case, when nelen is more than the length of the haylen.

        if ( nelen>haylen){
            return -1;
        }
        for(int i = 0 ; i <= haylen-nelen ; i ++){
            if( haystack.substring( i , i + nelen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}