package exercise.task2;

public class Main2 {
    public static void main(String[] args) {
        Student stu = new Student("田中太郎", 85);

        System.out.println(stu.getName() + "さんの点数: " + stu.getScore() + "点");
        stu.setScore(110);
        stu.setName("");
    }
}
