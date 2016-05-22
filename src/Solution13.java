/**
 * Created by caowei on 16/5/22.
 */
public class Solution13 {

    public static void main(String args[]){
        Solution13 solution13 = new Solution13();

        String string = "MCMLXXXIV";

        int romanToInt = solution13.romanToInt(string);
        System.out.print(romanToInt);
    }


    public int romanToInt(String s) {
        char [] romanCharArray = s.toCharArray();
        int sum=alphabet2int(romanCharArray[0]);
        for(int i=1;i<romanCharArray.length;i++){
            char first = romanCharArray[i-1];
            char second = romanCharArray[i];
            if(alphabet2int(first)<alphabet2int(second)){
                sum += alphabet2int(second) - 2*alphabet2int(first);
            }else if(alphabet2int(first) >= alphabet2int(second)){
                sum += alphabet2int(second);
            }
        }
        return sum;

    }


    public int alphabet2int(char alphabet){
        if(alphabet=='I'){
            return 1;
        }else if(alphabet=='V'){
            return 5;
        }else if(alphabet=='X'){
            return 10;
        }else if(alphabet=='L'){
            return 50;
        }else if(alphabet=='C'){
            return 100;
        }else if(alphabet=='D'){
            return 500;
        }else if(alphabet=='M'){
            return 1000;
        }

        return 0;
    }



}
