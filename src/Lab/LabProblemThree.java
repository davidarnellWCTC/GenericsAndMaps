package Lab;

import common.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import common.EmployeeBySsn;
import java.util.Collections;

/**
 * 3. * Store the same four Employee objects in a TreeMap. Demonstrate that
 * sorting works. First, make sure you override compareTo() from the Comparable
 * interface. Now try using a Comparator from the GenericsAndMaps project
 * (remember you’ll need a utility class).
 *
 *
 * @author David
 */
public class LabProblemThree {

    public static void main(String[] args) {
        // Creating four Employee Objects
        // Two have matching ssn
        // I assume "same four Employee objects" includes the ones with the same ssn
        Employee e1 = new Employee(1, "Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2, "Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(3, "Jones", "Bob", "444-44-4444");
        Employee e4 = new Employee(4, "Arnell", "David", "444-44-4444");

        Map<String, Object> employees = new TreeMap<>();
        // each employee is put in the TreeMap
        
//        employees.add(e1);
//        employees.add(e2);
//        employees.add(e3);
//        employees.add(e4);
        // TreeMap is two dimensional
        // Stores keys and values
        // no duplicate values
        employees.put(e1.getSsn(), e1);
        employees.put(e2.getSsn(), e2);
        employees.put(e3.getSsn(), e3);
        // Employee #4 has the same ssn key as Employee #3
        employees.put(e4.getSsn(), e4);

        // This runs through the TreeMap and prints all of the employee toString
        // The duplicate ssn for #4 is removed
        //Set keys = employees.keySet();
        Set<String> keys = employees.keySet();
        for (Object key : keys) {
            // This prints the employee key and then the employee toString function
            System.out.println(key.toString());
            System.out.println(employees.get(key.toString()).toString());
        }

        List<Employee> employeeList = new ArrayList<Employee>();
        
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        System.out.println();
        System.out.println("Employees in the order they were entered");
        //Collections.sort(employeeList);
        for(Employee e : employeeList) {
            System.out.println(e.toString());
        }
        System.out.println();
        System.out.println("Employees sorted by ssn");
        Collections.sort(employeeList);
        for(Employee e : employeeList) {
            System.out.println(e.toString());
        }
        
        
//        List<Employee> employeeList = new ArrayList<>();
//        
//        employeeList = (List<Employee>) employees;
        // This displays all of the Employee objects in the employeeList
        //System.out.println("Employee Object toString vaues. ");
//        for(Employee e: employeeList){
//            System.out.println(e.toString());
//        }

    }

}
