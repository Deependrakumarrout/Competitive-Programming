package SolvedFiles;
import java.io.*;
import java.util.*;
public class Problem3 {

    // Search in youTube HackerRank solution Video.
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
          List<Integer> list = new ArrayList<>();

//        if ((a.set(0, a.get(i)) > (b.set(0, b.get(i)))) || (a.set(0, a.get(i)) < (b.set(0, b.get(i)))) && (a.set(1, a.get(i)) > (b.set(1, b.get(i)))) || (a.set(1, a.get(i)) < (b.set(1, b.get(i)))) && (a.set(2, a.get(i)) > (b.set(2, b.get(i)))) || (a.set(2, a.get(i)) < (b.set(2, b.get(i))))) {
         //a.set(0,a.get(0));
            int point = 0, point1 = 0,point2 = 0;
          // System.out.println(a.get(2));
          // System.out.println(b.get(2));

        for (int i = 0; i < 3; i++) {
                if(a.get(i) >= 1 && a.get(i)<=100 && a.get(i) >(b.get(i))) {
                    //list.add(a.get(i));
                    //list.add(point+=1);17 28 30
                    //99 16 8
                    //list.remove(a.get(i));
                    // list.set(i,point+=1); // when i use set method i used to get error when my code execute the equal statement.
                    //      0     1
                    //      1     2
                    //      2     3
                    //6 4 7 | 8 4 3
                    //9 7 5 | 3 4 20
                    //System.out.println(list); 6 4 8, 4 8 4
                                            //  [6] [6] [6 ,8] 6 8



                    if(i==0&&point==0) {
                        point+=1;
                        list.add(1);
                        list.set(0, 1);
                    }


                    else if(i==1&&point==0){
                        point+=1;
                        list.add(1);
                        list.set(0,1);
                    }

                    else if(i==1&&point==1){
                        point+=1;
                        //list.add(2);
                        list.set(0,2);// This one.
                    }

                    else if(i==2&&point==1){
                        point+=1;
                        //list.add(2);
                        list.set(0,2);
                    }

                    else if(a.get(1).equals(b.get(1))&&i==2&&point==0){
                        list.add(1);
                        list.set(1, 1);
                    }

                    else if(i==2&&point==0) {
                        list.add(2);
                        list.set(1, 2);
                    }

                    else if(i==2&&point==2){
                        list.add(0);
                        list.set(0,3);
                        //list.set(0,0);

                    }
                }


                if(b.get(i) >= 1 && b.get(i)<=100 && a.get(i)<(b.get(i))) {

                    //list.add(b.get(i));
                    //list.add(point1+=1);
                    //list.remove(b.get(i));
                    //list.set(i,b.get(i));  8 5 3
                    //list.set(i,point1+=1); 5 8 8

                    /*
                    if(i==0&&point1==0) {
                        list.add(point1+=1);
                    }
                    if(i==1&&point1==1||i==1&&point1==0){
                        list.add(point1+=1);
                        list.set(1,point1);
                    }
                    if(i==2&&point1==2||i==2&&point1==1||i==2&&point1==0){
                        list.add(point1+=1);
                        list.set(0,point1);
                    }
                     */

                    if (i == 0 && point1 == 0) {
                        point1 += 1;
                        list.add(1);
                        list.set(0, 1);
                    }

//                    else if ((a.get(0).equals(b.get(0))) && (i == 1 && point1 == 0)) {
//                        list.set(0, 1);
//                    }

                    else if (i == 1 && point1 == 0) {
                        point1 += 1;
                        //list.add(1);
                        //list.set(1, 1);
                        list.add(1);
                        list.set(0, 1);
                    }

                    else if (i == 1 && point1 == 1) {
                        point1 += 1;
                        //list.add(2);   //34 65 78
                        list.set(0, 1);   //67 34 78
                    }

                    else if (i == 2 && point1 == 1) {
                        point1 += 1;
                        //list.add(2);
                        list.set(0, 2);

                    } else if (i == 2 && point1 == 0) {
                        list.add(1);
                        list.set(1, 1);
                    }

                    else if (i == 2 && point1 == 2) {
                        list.add(0);
                        list.set(0, 0);
                        list.set(1, 3);
                    }
                }


                if(a.get(i).equals(b.get(i))) {
                    //list.remove(0);
                    list.remove(a.get(i));
                    list.remove(b.get(i));
                    //list.set(0, 1);
                }

            if(a.get(0).equals(b.get(0))&&a.get(1).equals(b.get(1))&&a.get(2)<b.get(2)){
                list.add(1);
                list.set(0,0);
                if(i==1) {
                    list.set(1, 1);
                    break;
                }
                //list.set(1,1);

            }


            if(a.get(0).equals(b.get(0))&&a.get(1).equals(b.get(1))&&a.get(2).equals(b.get(2))) {
                list.add(0);
                if(i==2)
                    list.remove(2);
                }
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        // System.out.println(a.set(1, a.get(2)));
        // System.out.println(a.size());
        // System.out.println(b);
        List<Integer> result = compareTriplets(a, b);
        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }

}
