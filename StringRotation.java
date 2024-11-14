public class StringRotation{

    public static void checkRotation(String str1,String str2){
        if(str1.length() != str2.length()){
            System.out.println("Not a Rotation");
            System.exit(0);
        }

        String str3=str1+str1;

        if(str3.indexOf(str2) != -1){
            System.out.println("Rotation...");
        }else{
            System.out.println("Rotation...");
        }
    }



    public static void main(String[] args){
        String str1="ABCD";
        String str2="CDBAA";
        checkRotation(str1,str2);

    }
}