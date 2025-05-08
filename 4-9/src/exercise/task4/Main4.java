package exercise.task4;

public class Main4 {
    public static void main(String[] args) {

        StudentManager sm = new StudentManager();

        // 5人の学生を追加する
        sm.addStudent("アリス");
        sm.addStudent("ボブ");
        sm.addStudent("チャーリー");
        sm.addStudent(null);
        sm.addStudent("イヴ");

        // 6人目の学生を追加（例外が出る）
        try {
            sm.addStudent("イチゴ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // 学生を取得する
        int[] ids = {2,3,10};
        for (int id : ids) {
            try {
                System.out.println("学生ID " + id + ":" + sm.getStudent(id));
            } catch (IllegalArgumentException | NullPointerException e){
                System.out.println(e.getMessage());
                System.out.println("学生ID "+ id +":null");
            }
        } 
        // 学生を更新する
        try {
            sm.updateStudent(0, "フランク");
            sm.updateStudent(1, "ボビー");
            System.out.println("更新後の学生ID 1：" + sm.getStudent(1));
            sm.updateStudent(10, "クルーズ");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            // 例外があってもなくても必ず実行される後片付け
            System.out.println("配列の操作を終了します");
        }
    }

}
