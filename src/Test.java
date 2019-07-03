import model.Student;

public class Test {
    public static void main(String[] args){
        Student stu = new Student();
        stu.setName("Emilio");
        stu.setAge(18);
        stu.setSex("Man");
        stu.setStudentNumber("12345678");
        System.out.println("name；"+stu.getName()+";age:"+stu.getAge()+";sex:"+stu.getSex()+";id:"+stu.getStudentNumber());
    }

}