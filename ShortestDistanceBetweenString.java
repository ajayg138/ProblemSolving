public class ShortestDistanceBetweenString{

    public static int ShortestDist(String[] s, String word1, String word2){
        int index1=-1, index2=-1;

        int min = Integer.MAX_VALUE;

        for(int i=0;i<s.length;i++){
            if(s[i].equals(word1)){
                index1=i;
            }

            if(s[i].equals(word2)){
                index2=i;
            }

            if(index1 != -1 && index2 != -1){
                min=Math.min(min,Math.abs(index1-index2));
            }
        }

        return min;
    }


    public static void main(String[] args){
        String[] S = { "the", "quick", "brown", "fox", "quick" };
 
        String word1 = "the", word2 = "fox";

        int res=ShortestDist(S,word1,word2);
        System.out.println(res);
    }
}