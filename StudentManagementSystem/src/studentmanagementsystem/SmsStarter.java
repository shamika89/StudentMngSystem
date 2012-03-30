

package studentmanagementsystem;




import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class SmsStarter {
        
       
	public static void main(String[] args) {
             XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-context.xml"));        
            
            Student stu1=(Student) beanFactory.getBean("stu1");
            Student stu2=(Student) beanFactory.getBean("stu2");
            Student stu3=(Student) beanFactory.getBean("stu3");
           
            StudentManagementSystem sms = (StudentManagementSystem)beanFactory.getBean("sms");   
                sms.listAllStudents();
                sms.registerStudent(stu1);
                sms.registerStudent(stu2);
                sms.registerStudent(stu3);
                sms.listAllStudents();  
	}
}
