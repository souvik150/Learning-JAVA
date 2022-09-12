import college.vitStudent;
import com.souvik.univStudent;

public class demoStudent {

    public static void main(String[] args){
        vitStudent v1 =new vitStudent();
        univStudent u1 = new univStudent();

        v1.setVname("Souvik");
        u1.setUname("VIT");

        System.out.println("Student name: "+v1.getVname());
        System.out.println("University name: "+u1.getUname());

    }

}
