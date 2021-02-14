package SolvedFiles;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) throws IOException {

        /*
        // Start 1: problem
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            scanner.close();


         // last question of batch 1:

        int N = 4;
        if(N>20)
            System.out.println("Not Weird");
        else if(N%2==1)
            System.out.println("Weird");
        else if(N==2||N==4)
            System.out.println("Not Weird");
        else if(N==6||N==8||N==10||N==12||N==14||N==16||N==18||N==20)
            System.out.println("Weird");
        else
            System.out.println("Please enter a valid number.");


        // Star 1: last problem.
        // Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        // Write your code here.
        double d = Double.parseDouble(br.readLine());
        String s = br.readLine();
        br.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

         */


        // batch 2: of star 2 started.
/*
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            if (s1.length() <= 10 && (x >= 0 && x <= 999)) {
                if (x==0 || x>=1 && x < 10)
                    System.out.printf("%-15s00%s\n", s1,x);
                else if (x>=10 && x < 100)
                    System.out.printf("%-15s0%s\n", s1,x);
                else
                    System.out.printf("%-15s%s\n", s1,x);
            }
        }
        System.out.println("================================");
 */
        // This skill help me a lot to solve the above equation.
        // int a=4,b=45;
        // System.out.printf("%-15s 0%s\n",a,b);
        // System.out.printf("%-3s",a);


        // This is the next problem.

        /*
        Scanner inputNum = new Scanner(System.in);
        int num = inputNum.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(num+"x"+i+"="+i*num);
        }
         */


        //try {
        // This is the next problem to be get solve to achieve the 2nd start.

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int d=1,s=0;
                //int[] count = new int[n-1];
                for (int j = 0; j < n; j++) {
                    //j=a+1*b+j*2-1;
                    //System.out.println(count.length);
                    int v=0,x=0,two=0;
                    // v=j;
                    if(j==0) {
                        s = a + 1 * b;
                        System.out.print(s + " ");
                    }else {
                        d = d * 2;
                        // x = a + 1 * b + d * b;
                        s = s + d * b;
                        System.out.print(s + " ");
                    }


                    // These below code didn't work.
                    /*
                    if(v==0)
                        x = a + 1 * b;
                    else if(v==1)
                        x = a + 1 * b + 2 * b;
                    else if(v==2)
                        x = a + 1 * b + 2 * b + 4 * b;
                    else if(v==3)
                        x = a + 1 * b + 2 * b + 4 * b + 8 * b;
                    else if(v==4)
                        x = a + 1 * b + 2 * b + 4 * b + 8 * b + 16 * b;
                    else if(v==5)
                        x = a + 1 * b + 2 * b + 4 * b + 8 * b + 16 * b + 32 * b;
                    else if(v==6)
                        x = a + 1 * b + 2 * b + 4 * b + 8 * b + 16 * b + 32 * b + 64 * b;
                    else if(v==7)
                        x=  a + 1 * b + 2 * b + 4 * b + 8 * b + 16 * b + 32 * b + 64 * b + 128 * b;
                    else if(v==8)
                        x = a + 1 * b + 2 * b + 4 * b + 8 * b + 16 * b + 32 * b + 64 * b + 128 * b + 256 * b;
                    else if(v==9)
                        x = a + 1 * b + 2 * b + 4 * b + 8 * b + 16 * b + 32 * b + 64 * b + 128 * b + 256 * b + 512 * b;
                    else if(v==10)
                        x = a + 1 * b + 2 * b + 4 * b + 8 * b + 16 * b + 32 * b + 64 * b + 128 * b + 256 * b + 512 * b + 1024 * b;
                    else
                      System.out.print("Invalid input.");
                      */

                   // System.out.print(x + " ");
                    //if(count[j]>count.length)
                    //  break;
                }
            }

            //}catch (ArrayIndexOutOfBoundsException e){
        //}

         }
    }
//}
