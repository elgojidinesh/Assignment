package assignment11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	
	public static void main(String[] args) {
		
	
	ApplicationContext ctxobj=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	List<Student> slist = new ArrayList<>();
	
	Student stud1= (Student) ctxobj.getBean("student1");
	Student stud2= (Student) ctxobj.getBean("student2");
	Student stud3= (Student) ctxobj.getBean("student3");
	Student stud4= (Student) ctxobj.getBean("student4");
	
	slist.add(stud1);
	slist.add(stud2);
	slist.add(stud3);
	slist.add(stud4);
	
	
	for(Student s:slist)
	{
		System.out.println(s.sname+":"+s.objresult.total_marks);
	}
	
	List<Student> sortedlist = slist.stream()
			.sorted((s1 , s2) -> Float.compare(s1.objresult.total_marks, s2.objresult.total_marks))
			.collect(Collectors.toList());
	
	System.out.println("sorted list of student as per total marks");
	
	for(Student s :sortedlist)
	{
		System.out.println(s.sname +""+s.objresult.total_marks);
	}
	
	}
}
