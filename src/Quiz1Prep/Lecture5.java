package Quiz1Prep;

public class Lecture5 {
    public static void main(String[] args){
        int[] arr={1,2,3};

//        int[] arr1= arr;
        int[] arr1= arr.clone();
        for(int i: arr1){
            System.out.println(i);
        }

//        ----------------------------------------------------------------

        int[] s = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] d = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};

        int[] source_arr;
        int sourcePos;
        int[] dest_arr;
        int destPos;
        int len;
        source_arr = s;
        sourcePos = 3;
        dest_arr = d;
        destPos = 5;
        len = 4;

        System.out.print("source_array : ");
        for (int value : s) System.out.print(value + " ");
        System.out.println();

        System.out.println("sourcePos : " + sourcePos);

        System.out.print("dest_array : ");
        for (int k : d) System.out.print(k + " ");
        System.out.println();

        System.out.println("destPos : " + destPos);
        System.out.println("len : " + len);

        System.arraycopy(source_arr, sourcePos, dest_arr, destPos, len);

        System.out.print("final dest_array : ");
        for (int j : d) System.out.print(j + " ");

//        To Revise deep copying and shallow copying

    }
}