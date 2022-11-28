public static boolean ispossible(int arr[],int A ,int K){
    int count =0;
    for(int i=0;i<arr.length;i++){
        if(A%arr[i]==0){
            count++;
        }
    }if(count>=K){
        return true;
    }else{
        return false;
    }
}
}


         


      
 


  




   




    
    
    
    
