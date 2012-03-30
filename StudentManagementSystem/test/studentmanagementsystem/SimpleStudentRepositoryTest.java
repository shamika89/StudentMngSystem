

package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SimpleStudentRepositoryTest {

    private static Student stu=new Student();
    public SimpleStudentRepositoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
       
        SimpleStudentRepository instance = new SimpleStudentRepository();
        instance.saveStudent(stu);

    }

    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
       
        SimpleStudentRepository instance = new SimpleStudentRepository();
        instance.deleteStudent(stu);
       
    }

    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        long regNumber = stu.getRegNumber();
        SimpleStudentRepository instance = new SimpleStudentRepository();
       
        Student result = instance.findStudent(regNumber);
        assertEquals(null, result);
       
    }

    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
       
        SimpleStudentRepository instance = new SimpleStudentRepository();
        instance.updateStudent(stu);
       
    }

    @Test
    public void testFindAllStudents() {
        System.out.println("findAllStudents");
        SimpleStudentRepository instance = new SimpleStudentRepository();
        List expResult = new ArrayList();
        List result = instance.findAllStudents();
        assertEquals(expResult, result);
        
    }

}