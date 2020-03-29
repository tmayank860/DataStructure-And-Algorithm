package InterviewCodingProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String pricesString=br.readLine();
            int num=pricesString.length()/2+1;
            int[] prices=new int[num];
            String[] s1 = pricesString.split(" ");
            for(int i=0;i<num;i++)
            {
                prices[i]=Integer.parseInt(s1[i]);
            }
//            int[] prices={7,1,5,6,3,4};
          System.out.println(maxProfit(prices));

        }catch (Exception e){

        }
    }
    public static int maxProfit(int[] prices) {
       int profit=0;
        for (int i=0;i<prices.length-1;i++){
            for (int j=i+1;j<prices.length;j++){
                if (prices[j]-prices[i]>profit){
                    profit=prices[j]-prices[i];
                }
            }
        }
return profit;


    }
}
