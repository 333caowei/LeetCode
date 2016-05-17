import java.util.HashMap;

/**
 * Created by caowei on 16/5/18.
 */
public class Solution242 {

    public static void main(String args[]){
        Solution242 solution242 = new Solution242();
        String string1 = "anagram";
        String string2 = "nagaram";

        boolean isAnagram = solution242.isAnagram(string1, string2);
        System.out.print(isAnagram);
    }


    /**
     *我是用hashmap保存第一个字符串里面每一个字符对应的出现次数,然后遍历第二个字符串的每一个字符,
     * 如果字符在hashmap中出现,则hashmap对应字符减一.
     */
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = true;
        char char_s[] = s.toCharArray();
        char char_t[] = t.toCharArray();
        if(char_s.length!=char_t.length){
            return  false;
        }



        HashMap<Character, Integer> hashMap_s = new HashMap<Character, Integer>();
        for(int i=0;i<char_s.length;i++){
            if(hashMap_s.get(char_s[i])!=null){
                int count = hashMap_s.get(char_s[i]);
                hashMap_s.put(char_s[i], ++count);
            }else{
                hashMap_s.put(char_s[i], 1);
            }

        }

        for(int i=0;i<char_t.length;i++){
            if(hashMap_s.get(char_t[i])!=null){
                int count = hashMap_s.get(char_t[i]);
                if(count>1){
                    hashMap_s.put(char_t[i], --count);
                }else{
                    hashMap_s.remove(char_t[i]);
                }

            }else{
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }
}
