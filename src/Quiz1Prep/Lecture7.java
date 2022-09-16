package Quiz1Prep;

public class Lecture7 {
    public static void main(String[] args){
        int[][] arr= {{1,2,3,4},{1,2,3}, {1,2}, {1}};

        for(int[] a: arr){
            int sum =0;
            for(int i: a){
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}