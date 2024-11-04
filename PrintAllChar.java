public class PrintAllChar{

    public static void main(String[] args){

        StringBuilder sb=new StringBuilder();

        for(char ch='A'; ch<='Z';ch++){
            // sb.append(ch+" ");
            System.out.print(ch+" ");
        }

        String res=sb.toString();
        System.out.println(res);
    }
}