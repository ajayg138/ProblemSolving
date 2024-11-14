public class RotateStringByTwo{


//Naive Approach...O(n)
    // public static boolean isRotated(String str1,String str2){
    //     if(str1.length() != str2.length()){
    //         return false;
    //     }

    //     if(str1.length()<=2 || str2.length()<=2){
    //         return str1.equals(str2);
    //     }

    //     String clockRot="";
    //     String anticlockRot="";
    //     int len=str2.length();


    //     anticlockRot = str2.substring(len-2)+str2.substring(0,len-2);

    //     clockRot = str2.substring(2) + str2.substring(0,2);

    //     return str1.equals(anticlockRot) || str1.equals(clockRot);        
    // }


    public static boolean isRotated(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        if(str1.length()<=2 || str2.length()<=2){
            return str1.equals(str2);
        }

        String rotClock="";
        String rotAntiClock="";
        int len=str2.length();

        rotClock=str2.substring(2) + str2.substring(0,2);

        rotAntiClock=str2.substring(len-2)+str2.substring(0,len-2);

        return str1.equals(rotAntiClock) || str2.equals(rotClock);


    }

    public static void main(String[] args){
        String str1="amazon";
        String str2="azonam";

        System.out.println(isRotated(str1,str2));




    }
}