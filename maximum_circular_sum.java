public static int max_sum(int arr[]){
    int linear_array=kadans(arr);
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                arr[i]=arr[i]*-1;
            }
            int inverted=kadans(arr);
          int circular=inverted+sum;
          return Math.max(linear_array, circular);
   }
