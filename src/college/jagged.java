package college;

class Student
{
    int rollno;
    String name;
}

public class jagged {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        Student s[] = {s1,s2,s3,s4};

        int[] nums1 = {8,12,76,54};

        int[] nums = new int[4];

        nums[0] = 8;
        nums[1] = 12;
        nums[2] = 76;
        nums[3] = 54;

        for(int i=0; i<4; i++){
            System.out.println(nums[i]);
        }

        int[] a= {1,2,3,4};
        int[] b = {2,4,6,8};
        int[] c = {5,6,7,8};

        int[][] d = {
                {1,2,3,4},
                {2,4,6,8},
                {5,6,7,8}
        };

        for(int i =0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }


        int[][] f = {
                {1,2,3,7},
                {2,4,6},
                {5,6,7,8,9}
        };

        for(int i =0; i<f.length; i++){
            for(int j=0; j<f[i].length; j++){
                System.out.print(f[i][j]+" ");
            }
            System.out.println();
        }

    }
}
