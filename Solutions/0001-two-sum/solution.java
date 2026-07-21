class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexArray = new int[2];
        int firstIndex=0;
	    int secondValue=0;
	    int secondIndex=0;
        for(int i=0;i<nums.length;i++){
	        secondValue=target-nums[firstIndex];
  	        int iterator=firstIndex+1;
            boolean flag=false;
	        while(iterator<nums.length){
                if(secondValue==nums[iterator]){
		            secondIndex=iterator;
                    flag=true;
		            break;
		        }
                iterator++;
	        }
            if(flag){
                break;
            }
            firstIndex++;
        }
	    indexArray[0]=firstIndex;
	    indexArray[1]=(secondIndex);
	    return indexArray;
    }
}