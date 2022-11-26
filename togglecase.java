    public static String togglecase(String S){
        StringBuilder sb =new StringBuilder(S);
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch>='a' && ch<='z'){
                char uch=(char)('A'+ch-'a');
                sb.setCharAt(i,uch);
            }else{
                 char lch=(char)('a'+ch-'A');
                 sb.setCharAt(i,lch);
            }
         }return sb.toString();
}
