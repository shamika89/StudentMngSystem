

package studentmanagementsystem;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SimpleStudentRepository implements StudentRepository {

	private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

	@Override
	public void saveStudent(Student stu) {
	 studentsDb.put(stu.getRegNumber(), stu);

	}

	@Override
	public void deleteStudent(Student stu) {
		studentsDb.remove(stu.getRegNumber());

	}

	@Override
	public Student findStudent(long regNumber) {
		return studentsDb.get(regNumber);
		
	}

	@Override
	public void updateStudent(Student stu) {
		saveStudent(stu);

	}

	@Override
	public List<Student> findAllStudents() {

            List<Student> students=new ArrayList<Student>();

            students.addAll(0, studentsDb.values());
           
            
           Iterator it=students.iterator();
           while(it.hasNext()){
               System.out.println(it.next());
           }
             
            return students;
		
	}

}
