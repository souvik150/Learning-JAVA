package Quiz1Prep;
import java.util.*;

public class Lecture3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        ---------------Pattern Print-----------------

        int lines = 0;
        lines = input.nextInt();

        for(int i = lines; i > 0 ; i--) {
            for(int j =i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

//        ---------------Matrix 2D------------------

        boolean r= true;
        int[][] arr={{1,7,0},{0,1,0},{0,0,1}};

        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                if(i==j){
                    if(arr[i][j]!=1){
                        r=false;
                    }
                }
                else
                {
                    if(arr[i][j]!=0){
                        r=false;
                    }
                }
            }
        }
        System.out.println(r);

//        ---------------------------------------------------

        int[][] ar={{1,2,3},{4,5,6},{7,8,9}};
        int[][] trans = new int[3][3];

        for(int i=0; i<ar.length; i++){
            for(int j=0;j<ar.length; j++){
                trans[j][i] = ar[i][j];
            }
        }

        for (int[] tran : trans) {
            for (int i : tran) {
                System.out.print(i);
            }
            System.out.println();
        }

//      ----------------------------------------------------

        int [][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] a : arr1){
            int sum=0;
            for(int i: a){
                sum+=i;
            }
            System.out.println(sum);
        }



    }
}
