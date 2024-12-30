package thirtyTwo;

class Student {
    int rollNumber;
    String name;
    int marks;


}

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNumber = 1;
        s1.name = "John";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollNumber = 2;
        s2.name = "Kripa";
        s2.marks = 70;

        Student s3 = new Student();
        s3.rollNumber = 3;
        s3.name = "Banu";
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].marks);
        }


//        int nums[] = new int[6];
//
//        nums[0] = 10;
//        nums[1] = 20;
//        nums[2] = 30;
//        nums[3] = 40;
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }
}
