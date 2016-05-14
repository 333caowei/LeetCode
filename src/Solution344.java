/**
 * Created by caowei on 16/5/13.
 */
public class Solution344 {


    public static void main(String[] args) {
        Solution344 solution344 = new Solution344();

        String string = "hello like";

        solution344.reverseString(string);
    }



    public String reverseString(String string) {
        char charArray[]=string.toCharArray();

        for(int i=0;i<charArray.length/2;i++){
            char temp = charArray[i];
            charArray[i]=charArray[charArray.length-i-1];
            charArray[charArray.length-i-1]=temp;
        }

        String couvertString = String.valueOf(charArray);
        System.out.print(couvertString);
        return couvertString;
    }
}
