package ProblemsUsingStreams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeelistSorting {
	public static void main(String[]args) {
		
		List<EmployeeList>list=EmployeeListDatabase.getEmployees();
		list.stream().filter(t->t.getEmpSalary()>9000000).sorted((o1,o2)->(int) (o1.getEmpSalary()-o2.getEmpSalary())).forEach(System.out::println);
		
		
		System.out.println();
		list.stream().sorted((o1,o2)->(int)(o2.getEmpSalary()-o1.getEmpSalary())).forEach(System.out::println);
		
		
		System.out.println();
		List<EmployeeList>name=list.stream().filter(s->s.getEmpName().startsWith("s")).collect(Collectors.toList());
		
		System.out.println("**************");
		
	    list.stream().sorted(Comparator.comparing(EmployeeList::getEmpName)).forEach(System.out::println);
	    
		System.out.println("**************");
		
	    List<EmployeeList>name1=list.stream().filter(s->s.getEmpAddress().endsWith("h")).sorted().collect(Collectors.toList());
	    System.out.println(name1);
	    
	    System.out.println("****************");
	    
	    list.stream().sorted(Comparator.comparing(EmployeeList::getId).reversed()).forEach(System.out::println);
	    

	}

}
