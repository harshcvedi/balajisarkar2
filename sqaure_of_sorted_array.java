 public int[] sortedSquares(int[] nums) {
      int start=0;
      int end=nums.length-1;
      int arr[]=new int[nums.length];
      int idx=end;
      while(start<=end){
          int x=nums[start]*nums[start];
          int y=nums[end]*nums[end];
          if(x>y){
              arr[idx]=x;
              start++;
              
          }else{
              arr[idx]=y;
              end--;
          }
          idx--;
      }return arr;   
