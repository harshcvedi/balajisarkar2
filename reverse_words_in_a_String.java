   public static void main(String args[]){
        
   String str="sarkar balaji";
   str.trim();
   String arr[]=str.split("\s+");
   String ans="";
   for(int i=arr.length-1;i>=0;i--){
      ans=ans+arr[i]+" ";
   }
   
   System.out.println(ans.trim());

    

        
  
}
