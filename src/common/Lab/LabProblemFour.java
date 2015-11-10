
package common.Lab;

import common.Employee;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;

import common.EmployeeByLastName;

/**
 *4. Store the same four Employee
 * objects in a TreeSet. Demonstrate that sorting works AND that duplicates are
 * removed by looping through the set using an iterator. Use both the natural
 * ordering and an alternative ordering.
 * @author David
 */
public class LabProblemFour {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2, "Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(3, "Jones", "Bob", "444-44-4444");
        Employee e4 = new Employee(4, "Arnell", "David", "444-44-4444");

        Set<Employee> employees = new TreeSet<>();
        //Set<Object> employees = new TreeSet<>();
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        System.out.println("Listing the Employees in the TreeSet:");
        System.out.println("The duplicates have been removed and they are in the ssn order.");
        for (Employee e: employees){
            System.out.println(e.toString());
        }
        
        // create a new ArrayList from the TreeSet to reorder the employees
        List<Employee> employeeList = new ArrayList<>(employees);
        
        // The employeeList is reordered by the employees last name
        System.out.println();
        System.out.println("Employees reordered by Last Name");
        Collections.sort(employeeList, new EmployeeByLastName());
        for(Employee e : employeeList) {
            System.out.println(e.toString());
        }
        
//        for (Object e: employees){
//            
//        }
        
    }
}
