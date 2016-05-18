/**
 * Created by caowei on 16/5/18.
 */
public class Solution171 {

    public static void main(String args[]){
        Solution171 solution171 = new Solution171();

        String s = "AAA";
        int column = solution171.titleToNumber(s);
        System.out.print(column);
    }


    /**
     *
     * 找规律,+=26的字母bit位置次方,再乘以字母在26中的index
     */
    public int titleToNumber(String s) {
        char alphabet[] = s.toCharArray();
        int sum=0;
        for(int i=0;i<alphabet.length;i++){
            sum+=Math.pow(26,alphabet.length-i-1)*(alphabet[i]-'A'+1);
        }

        return sum;
    }
}
