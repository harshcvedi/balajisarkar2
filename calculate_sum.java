          Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    int arr[]=new int[N];
    for(int i=0;i<N;i++){
        arr[i]=sc.nextInt();
    }
    int Q=sc.nextInt();

    while(Q-->0){
        int X=sc.nextInt();
        int array[]=new int[N];

        for(int i=0;i<N;i++){
            int j=i-X;
            if(j<0){
                j=j+N;
            }
            array[i]=arr[i]+arr[j];
        }

        arr=array;
    }int sum=0;
    for(int i=0;i<N;i++){
        sum=sum+arr[i];
    }System.out.println(sum);
    
   
  

 


}
}
