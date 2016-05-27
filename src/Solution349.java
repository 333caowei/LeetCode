import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by caowei on 16/5/27.
 */
public class Solution349 {

    public static void main(String[] args) {
        Solution349 solution349 = new Solution349();

        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        int array[] = solution349.intersection(nums1, nums2);
        System.out.print(Arrays.toString(array));


    }


    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            hashSet.add(nums1[i]);
        }

        ArrayList<Integer>arrayList = new ArrayList<Integer>();
        for(int i=0;i<nums2.length;i++){
            if(hashSet.contains(nums2[i]) && !arrayList.contains(nums2[i])){
                arrayList.add(nums2[i]);
            }

        }

        int array[] = new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            array[i] = arrayList.get(i);

        }
        return array;

    }
}
