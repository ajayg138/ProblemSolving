public class VowelsInString{

    public static int totalVowels(String str){
        str=str.toLowerCase();

        int n=str.length();
        int count=0;

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        String str="Ajay Gole";
        int res=totalVowels(str);
        System.out.print(res);

    }
}