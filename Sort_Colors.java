class Sort_Colors {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        int [] result = new int[nums.length];
        
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
            if(nums[i]==1){
                count1++;
            }
            if(nums[i]==2){
                count2++;
            }
        }
        
        for(int i=1 ; i<=count2 ; i++){
            nums[nums.length-i] = 2;
        }
        for(int i=1;i<=count1 ; i++){
            nums[ (nums.length-count2) - i] = 1;
        }
        for(int i=1; i<=count0; i++){
            nums[ (nums.length - (count1+count2)) - i] = 0;
        }
        
        nums = result;
    }
}