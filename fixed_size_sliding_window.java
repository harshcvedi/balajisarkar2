 int[] arr = {1, 4, 5, 6, 7, 8, 2, 3, 9, 1, 2, 5};
		int k = 3;
      int sum=0;
      for(int i=0;i<k;i++){
         sum=sum+arr[i];
      }
      int ans=0;
      ans=sum;
      for(int i=k;i<arr.length;i++){
         sum=sum+arr[i];
         sum=sum-arr[i-k];
         ans=Math.max(sum, ans);
      }
      System.out.println(ans);
        
  
