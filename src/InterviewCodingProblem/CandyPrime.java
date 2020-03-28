package InterviewCodingProblem;

import java.util.Scanner;

public class CandyPrime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(PrimeOT(n));
        }

    }

    public static  int PrimeOT(int n){
        int  status = 1, x = 3, count, j,cost=0;

        if(n==1){
            return 2;
        }
        for (count = 2; count <=n; )
        {
            for (j = 2; j <= Math.sqrt(x); j++)
            {
                if (x%j == 0)
                {
                    status = 0;
                    break;
                }
            }
            if (status != 0)
            {
                cost=x;
                count++;
            }
            status = 1;
            x++;
        }
        return cost;
    }
}

