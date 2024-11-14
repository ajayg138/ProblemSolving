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


    // public static boolean isRotated(String str1,String str2){
    //     if(str1.length() != str2.length()){
    //         return false;
    //     }

    //     if(str1.length()<=2 || str2.length()<=2){
    //         return str1.equals(str2);
    //     }

    //     String rotClock="";
    //     String rotAntiClock="";
    //     int len=str2.length();

    //     rotClock=str2.substring(2) + str2.substring(0,2);

    //     rotAntiClock=str2.substring(len-2)+str2.substring(0,len-2);

    //     return str1.equals(rotAntiClock) || str2.equals(rotClock);


    // }


    //Direct comparison using modulu operator

    public static boolean isRotated(String str1, String str2){

        int n = str1.length();

        boolean clockwies=true;
        boolean antiClockwise=true;

        //clockwise
        for(int i=0;i<n;i++){
            if(str1.charAt(i) != str2.charAt(i+2)%n){
                clockwies=false;
                break;
            }
        }


        //anticlockwise
        for(int i=0;i<n;i++){
            if(str1.charAt(i+2)%n != str2.charAt(i)){
                antiClockwise=false;
                break;
            }
        }

        return clockwies || antiClockwise;
    }

    public static void main(String[] args){
        String str1="amazon";
        String str2="azonam";

        System.out.println(isRotated(str1,str2));


        str1 = "amazon";
        str2 = "onamaz";

        System.out.println(isRotated(str1,str2));





    }
}