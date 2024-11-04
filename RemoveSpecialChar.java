public class RemoveSpecialChar{


    public static void main(String[] args){

        String str="Diw%$a&****l@i";

        StringBuilder sb=new StringBuilder();

        int n=str.length();
       
        for(int i=0;i<n;i++){
             char ch=str.charAt(i);
            if((ch >= 'A' && ch<='Z') || (ch >= 'a' && ch<= 'z') || (ch>='0' && ch<='9')){
                sb.append(ch);
            }

            // if(Character.isLetterOrDigit(str.charAt(i))){
            //     sb.append(str.charAt(i));
            // }
        }

        String res=sb.toString();

        System.out.println(res);
    }
}