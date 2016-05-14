import java.util.HashMap;
/**
 * 没做出来
*/
public class Solution_3 {

    public static void main(String[] args) {
        Solution_3 solution_3 = new Solution_3();

        solution_3.lengthOfLongestSubstring("dvdf");
        solution_3.lengthOfLongestSubstring("abcabcbb");
        solution_3.lengthOfLongestSubstring("nfpdmpi");

    }




    /*用两个指针，一个指向当前子串的头，一个指向尾，尾指针不断往后扫描，point_1表示满足条件的字符串的起始位置，point_2表示结束位置。
    * point_2每次往前移动一次，遇到一个新的字符元素，判断当前的集合中是否已经存在这个字母，如果没有出现过，那么我们就把point_2往后移动一位
    * 如果出现过了，那么我们把point_1移动到之前那个字母出现的位置的后一位.
    * */
    public int lengthOfLongestSubstring(String s) {
        char str[] = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        int point_1 = 0;
        int point_2 = 0;

        int length  = 0;

        for(int i=0;i<str.length;i++){
            if(hashMap.get(str[i])==null){
                point_2 = i;
                hashMap.put(str[i],i);
                if(hashMap.size()>length){
                    length = hashMap.size();
                }
            }else{
                while(hashMap.get(str[i])!=null){
                    hashMap.remove(str[point_1]);
                    point_1++;
                }
                hashMap.put(str[i],i);
                if(hashMap.size()>length){
                    length = hashMap.size();
                }
            }
        }

        System.out.print(length);
        return  length;
    }


}
