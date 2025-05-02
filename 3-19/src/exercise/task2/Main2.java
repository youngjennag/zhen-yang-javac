package exercise.task2;

public class Main2 {
    public static void main(String[] args) {
        Student stu1 = new Student(20250101,"山田太郎" );
        Student stu2 = new Student(20250101,"伊藤一郎" );
        Student stu3 = new Student(20250102,"佐藤花子" );

        checkEquality(stu1,stu2);
        checkEquality(stu1,stu3);
    }

    public static void checkEquality(Student s1, Student s2) {
        if (s1.equals(s2)) {
            System.out.println("同一の学生です");
        } else {
            System.out.println("違う学生です");
        }
    }
    
}
