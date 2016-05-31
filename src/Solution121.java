/**
 * Created by caowei on 16/5/31.
 */
public class Solution121 {

    public static void main(String args[]){
        Solution121 solution121 = new Solution121();

        int price[] = {1,3,2,5,3,4,7,2,1};

        int profit = solution121.maxProfit(price);
        System.out.print(profit);
    }


    /**
     *w我的方法超时,用了双循环,这里是看了解答后的方法
     */
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }

        int maxProfit=0;
        int minPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
        }

        return maxProfit;
    }
}
