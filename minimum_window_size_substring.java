
   public static void main(String args[]){  
  Scanner sc =new Scanner(System.in);
   String str2=sc.nextLine();
   String str3=sc.nextLine();
   int frqstr3[]=new int[123];
   for(int i=0;i<str3.length();i++){
      char ch=str3.charAt(i);
      frqstr3[ch]++;
   }

   int si=0;
   int ei=0;
   int len=Integer.MAX_VALUE;
   int count=0;
   int start=-1;
   int frqstr2[]=new int[123];
   while(ei<str2.length()){
      char ch=str2.charAt(ei);
      frqstr2[ch]++;
      if(frqstr2[ch]<=frqstr3[ch]){
         count++;
      }
      if(count==str3.length()){
         while(frqstr2[str2.charAt(si)]>frqstr3[str2.charAt(si)]){
            frqstr2[str2.charAt(si)]--;
            si++;
         }
         if(len>(ei-si+1)){
            len=ei-si+1;
start=si;
         }
      }
      ei++;
      

   }
   if(start==-1);{
      System.out.println(" ");
   }
  
      System.out.println(str2.substring(start,start+len));
   


}
