public class ReverseString{

    public static void main(String[] args){
        String str="yajA";

        StringBuilder sb=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }

        String res=sb.toString();
        System.out.println(res);

    }
}