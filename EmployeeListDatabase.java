package ProblemsUsingStreams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDatabase {
	
	public static List<EmployeeList> getEmployees(){
		
		List<EmployeeList>list=new ArrayList<>();
		list.add(new EmployeeList(1,"rakshith",9083490,"bassw"));
		list.add(new EmployeeList(2,"pavan",8494001,"erui"));
		list.add(new EmployeeList(3,"bharath",6474748,"kwjdhku"));
		list.add(new EmployeeList(4,"sandeep",8884848,"kjdh"));
		list.add(new EmployeeList(5,"sachin",8476644,"djhsK"));
		return list;
		
		
	}
 
}
