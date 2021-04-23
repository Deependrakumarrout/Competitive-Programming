package SolvedFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem5 {
    /*
     This is the problem i am facing while giving input like city name as well as SID number in one line. And this is
     Summit's question paper problem which was in solved in (AcceptTheNameOfTenCities.java). In this problem i want to
     use 2D array to insert string data item.
     */

        static String[] arr = new String[5];
        static int[] std = new int[5];
        static int n = 5;
        static Scanner num = new Scanner(System.in);
        static InputStreamReader input = new InputStreamReader(System.in);
        static BufferedReader br = new BufferedReader(input);

        public static void main(String[] args) throws IOException {
            Problem5 pro = new Problem5();
            System.out.println("Enter any ten cities name: ");
            pro.cityName();

            // Can you write the code in a single loop as like take input from and print in that loop only.
            /*if(i==4) {
                System.out.print("There are the Element that you have enter: ");
                System.out.print(arr[i]);
            }
             */


            System.out.print("Search for a city in the list: ");
            String search = br.readLine().toUpperCase();

            for(int j=0;j<n;j++){
                if (search.equals(arr[j].toUpperCase())) {
                    System.out.print("(Search successful) WE HAVE THIS CITY IN OUR LIST (" + arr[j] +", "+ std[j]+")");
                    break;
                }
                else if(j==n-1) {
                    System.out.print("(Search Unsuccessful), SORRY YOUR CITY DIDN'T THERE IN OUR LIST");
                }
            }

        /*
        int i=2;
        for(int j=0;i<=11;j++){
            i=i*j;
            ++i; //i=i+1
            System.out.print(i);
            }
         */

        }

        void cityName() throws IOException {
            for (int i = 0; i < n;i++) {
                System.out.print("Enter the city name : ");
                arr[i] = br.readLine();
                if(i==4)
                    break;
                stdNumber();
            }
        }

    void stdNumber() throws IOException {
        //System.out.println("Enter the SID number Here: ");
        for (int j = 0; j < n;j++) {
            System.out.println("Enter the STD (Subscribers Trunk Dialing) code of : " + arr[j]);
            std[j]= num.nextInt();
            if(j==4)
                break;
            cityName();

        }
    }
}



