import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by caowei on 15/8/28.
 */
public class Solution_4 {
    public static void main(String[] args) {
        Solution_4 solution_4 = new Solution_4();

        int nums1[] = {1,3,4};
        int nums2[] = {0,5,11,12};

        solution_4.findMedianSortedArrays(nums1, nums2);

    }



    //自己算法
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        int array[] = new int[length];

        int index_nums1=0, index_nums2=0;
        for(int index_array=0; index_array<length; index_array++){
            if(index_nums1<nums1.length && index_nums2<nums2.length){
                if(nums1[index_nums1]<nums2[index_nums2]){
                    array[index_array]=nums1[index_nums1];
                    index_nums1++;
                }else{
                    array[index_array]=nums2[index_nums2];
                    index_nums2++;
                }
            }else if(index_nums1<nums1.length && index_nums2>=nums2.length){
                array[index_array]=nums1[index_nums1];
                index_nums1++;

            }else if(index_nums1>=nums1.length && index_nums2<nums2.length){
                array[index_array]=nums2[index_nums2];
                index_nums2++;
            }
        }

        System.out.println(Arrays.toString(array));

        double median;
        if(length%2!=0){
            median = array[length/2];
        }else{
            median = (array[(length/2)-1]+array[length/2])/2.0;
        }


        System.out.print(median);
        return median;
    }



}
