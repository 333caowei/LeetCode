import java.util.HashMap;

public class Solution_1 {

    public static void main(String[] args) {
        Solution_1 solution_1 = new Solution_1();

        int a[] = {2,7,11,15};
        solution_1.twoSum(a, 9);
    }




//    //自己方法
//    public int[] twoSum(int[] nums, int target) {
//        int []answer = new int[2];
//        for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i]+nums[j]==target){
//                    System.out.print((i+1)+","+(j+1));
//                    answer[0] = i+1;
//                    answer[1] = j+1;
//                }
//            }
//        }
//        return answer;
//    }





    //优秀方法
    /*第一想法，拿到输入后，暴力搜索，时间复杂度为O(n*n)，很简单，但是会出现超时错误。
    显然，时间复杂度需要再降低才行。看过别人的题解后，使用了Java中的Map，利用HashMap，存储数组中的值和Index，
    由于HashMap中查询键值对的开销是固定的，因此在性能上可以得到很大的提升。对输入先构建HashMap，对于HashMap需要考虑，
    用什么做key，什么做value。题目中要求求两者的和，显然，用数组值做index来检索index是合理恰当的设置。遍历数组，构建这样的HashMap。
    第二遍遍历数组，对每个值value_i，在HashMap中查找是否存在对应的target-value_i，若存在，根据这个key找到对应的value值，
    即得到要找的两个index。由于数组遍历的顺序是由小到大，因此得到的map中的index2必然大于index1。
    需要注意的一个小细节是，在HashMap中进行查找时，要避免出现index1和index2相等的情况。*/
    public int[] twoSum(int[] nums, int target) {
        int []answer = new int[2];

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            hashMap.put(nums[i], i);/////这里是重点
        }

        for(int i=0;i<nums.length;i++){
            if( hashMap.get(target-nums[i])!=null && hashMap.get(target-nums[i])!=i ){
                answer[0] = i+1;
                answer[1] = hashMap.get(target-nums[i])+1;
                System.out.print(answer[0]+","+answer[1]);
                break;

            }
        }

        return answer;
    }


}
