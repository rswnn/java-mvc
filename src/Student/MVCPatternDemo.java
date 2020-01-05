/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author riswanardiansah
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        StudentModel model = FakeDB();
        
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        
        
        controller.setStudentName("Sopo");
        controller.setStudentRollNo("9");
        
        controller.updateView();
    }

    private static StudentModel FakeDB() {
        StudentModel student = new StudentModel();
        student.setName("Riswan");
        student.setRollNo("10");
        return student;
    }
}
