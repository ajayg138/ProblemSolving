public class RotateStringByTwo{

    public static boolean isRotated(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        if(str1.length()<=2 || str2.length()<=2){
            return str1.equals(str2);
        }

        String clockRot="";
        String anticlockRot="";
        int len=str2.length();


        anticlockRot = str2.substring(len-2)+str2.substring(0,len-2);

        clockRot = str2.substring(2) + str2.substring(0,2);

        return str1.equals(anticlockRot) || str1.equals(clockRot);        
    }

    public static void main(String[] args){
        String str1="amazon";
        String str2="azonam";

        System.out.println(isRotated(str1,str2));




    }
}