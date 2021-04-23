package SolvedFiles;

import java.util.Scanner;

public class Problem4 {
    int[] arr = new int[8];
    int n=0;
    public static void main(String[] args){
        Problem4 p4Constructor = new Problem4();

        Scanner input =new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
         p4Constructor.n = input.nextInt();
        System.out.print("Enter the number of element you want to move left side: ");
        int n1 = input.nextInt();
        for (int i = 0; i < p4Constructor.n; i++) {
            p4Constructor.arr[i] = input.nextInt();
            //System.out.print(arr[i] + " ");
        }

        p4Constructor.rotateLeft(n1);
        p4Constructor.printSolution();
    }

    public void printSolution(){
        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }


    public int  rotateLeft(int num){
        for(int i=0;i<num;i++)
             rotate(arr,n);
        return 0;
    }

    public int  rotate (int[] arr, int size){
        int temp = arr[0];
        int j;
        for (j = 0; j<size-1; j++) {
            arr[j]=arr[j+1];

                // System.out.print(temp + " " + temp2);// I kept the value first and the second value on temp and temp2 variable and
                // this print the value after the 3 to the rear-1 of the index get inserted.
                // break;
            }
            // You can see the static array initialization in the rotateArray.java file.
            // System.out.print(arr[j] + " ");

            return arr[j]=temp; // NOTE: Here We have reach the last index of the array so we have used (for-loop) above. And Then we
                        // initialize the base element to the temp variable.

    }
}


        /* This is the output of this program the problem was thought by me. It's just for fun.
        4 6 8 5 7
        7 5 8 6 4
        int a=4,b=6,c=8,d=5,e=7,temp=0;
        System.out.println(a +" "+ b + " "+ c+ " " + d + " "+e);
        temp=a;
        a=e;
        e=temp;
        temp=d;
        d=b;
        b=temp;
        System.out.println(a +" "+ b + " "+ c+ " " + d +" "+e);
         */


        /*
        These below code is for practice purpose.
        int[] num = new int[4];
        for(int i=0;i<=0;i++) {
            // System.out.print(i+" ");
            for(int j=0;j<=6;j++){
            }
        }
            System.out.println();
        for(int j=5;j>=1;j--){
            System.out.print(j+" ");
        }
         */
