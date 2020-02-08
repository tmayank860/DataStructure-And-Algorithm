package InterviewCodingProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine(); //Input the number seperated by space
        int num=s.length()/2+1;
        int[] arr= new int[num];
        String[] s1 = s.split(" ");
        for(int i=0;i<num;i++)
        {
            arr[i]=Integer.parseInt(s1[i]);
        }

        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=temp){
                break;
            }
            temp++;
        }
        System.out.println(temp);
    }

}
