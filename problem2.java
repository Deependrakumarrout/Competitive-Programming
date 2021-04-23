package SolvedFiles;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
            // In this program we have done addition of an array data item.

public class problem2 {
/*
    public static void main(String[] args) {
        int n=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number:");
        int input = scan.nextInt();
        for(int i=0;i<input;i++) {
            int[] arr = {11,2,3,4,5};
            //System.out.println(arr[2]);
           // n = arr[0];
            n+=arr[i];
        }
        System.out.println(n);
    }
}
*/

    static int simpleArraySum(int size, int[] ar) {
        int sum = 0;
        for(int i=0;i<size;i++){
            sum+=ar[i];
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH"))); // For this line of code we have to create a variable in environment variable's dialog box.
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arCount = Integer.parseInt(scanner.nextLine().trim());
        int[] ar = new int[arCount];
        String[] arItems = scanner.nextLine().split(" ");
        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        System.out.println(ar);
        int result = simpleArraySum(arCount, ar);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}

/*
      Input should be horizontally:
      4
      1 2 4 6
      result: 13
 */