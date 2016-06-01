import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by caowei on 16/6/1.
 */
public class Solution345 {

    public static void main(String args[]) {
        Solution345 solution345 = new Solution345();
        String string = "leetcode";
        String result = solution345.reverseVowels(string);

        System.out.print(result);
    }

    public String reverseVowels(String s) {
        char array[] = s.toCharArray();
        Queue<Character> queue = new LinkedList<Character>();
        for(int i=0;i<array.length;i++){
            if( (array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u' || array[i]=='A' || array[i]=='E' || array[i]=='I' || array[i]=='O' || array[i]=='U')){
                queue.add(array[i]);
            }
        }

        for(int i=array.length-1;i>=0;i--){
            if( (array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u' || array[i]=='A' || array[i]=='E' || array[i]=='I' || array[i]=='O' || array[i]=='U')){
                array[i] = queue.poll();
            }
        }

        return String.copyValueOf(array);
    }
}
