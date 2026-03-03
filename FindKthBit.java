class FindKthBit {
    public char findKthBit(int n, int k) {
        if(n==1){
            return '0';
        }

        int len =(int)Math.pow(2, n) - 1;   // length = 2^n - 1
        int mid = (len / 2) + 1;
        String s="";

        if(k==mid){
            return '1';
        }

        if(k<mid){
            return findKthBit(n-1,k);
        }

        if (k > mid) {
            int mirroredK = len - k + 1;
            char result = findKthBit(n - 1, mirroredK);

            if (result == '0') {
                return '1';
            } else {
                return '0';
            }
        }

        return 'a';
    }

    /*public String invert(String a){
        String result="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1'){
                result+="0";
            }else{
                result+="1";
            }
        }
        return result;
    }

    public String reverse(String b){
        String reversed = "";
        for(int i=b.length()-1;i>=0;i--){
            reversed+=""+b.charAt(i);
        }
        return reversed;
    }

    public String binary(int n){
        if(n==1){
            return "0";
        }
        
        String prev = binary(n-1);
        return prev + "1" + reverse(invert(prev));
    }*/
}