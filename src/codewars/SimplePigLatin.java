package codewars;

import java.util.Arrays;
import java.util.Scanner;

public class SimplePigLatin {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        try {
//            int t=sc.nextInt();
            int t=1;
            while(t-->0) {
//                int n=sc.nextInt();
//                int m=sc.nextInt();
//                int[] arr1=new int[n];
//                int[] arr2=new int[m];
                int n=4,m=5;
                int arr1[]={1,3,5,7};
                int arr2[]={0,2,6,8,9};
//                for(int i=0;i<n;i++){
//                    arr1[i]=sc.nextInt();
//                }
//                for(int i=0;i<m;i++){
//                    arr2[i]=sc.nextInt();
//                }
                int arr[]=new int[n+m];
                int x=0,y=0,z=0;
                while(x<n&&y<m){
                    if(arr1[x]>arr2[y]){
                        arr[z++]=arr2[y++];
                    }else{
                        arr[z++]=arr1[x++];
                    }
                }
                while(x<n){
                    arr[z++]=arr1[x++];
                }while(y<m){
                    arr[z++]=arr2[y++];
                }
                for(int i=0;i<=z;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }

        } catch (Exception e) {

        }

//System.out.println(result("Hello world !"));
//    }
//    public static String result(String s){
//        int len=0;
//        int n=s.length();
//        String st="";
//        String result="";
//       while(len<n){
//           if(Character.isLetter(s.charAt(len))){
//               st=st+s.charAt(len);
//               len++;
//           }else{
//            result=result+st.substring(1)+st.charAt(0)+"ay";
//            result=result+st.charAt(len);
//            len++;
//            st="";
//
//           }
//       }
//       return result;
    }

}
