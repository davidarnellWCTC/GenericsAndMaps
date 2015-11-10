
package common.Lab;

import common.Employee;
import static common.Lab.Lab.hashMapLoop;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *2. Next, create and initialize four Employee objects, but this time make sure
 * at least two have the same social security number. Now add them to a HashMap.
 * What key will you use? How will you retrieve individual items? Use put(key,
 * value) to add items; use get(key) to retrieve items. Demonstrate a solution.
 * How will you loop through the keys or values? Demonstrate this too. * 
 * @author David
 */
public class LabProblemTwo {
    
    public static void main(String[] args) {
        
        
        // Creating four Employee Objects
        // Two have matching ssn
        Employee e1 = new Employee(1, "Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2, "Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(3, "Jones", "Bob", "444-44-4444");
        Employee e4 = new Employee(4, "Arnell", "David", "444-44-4444");

        // HashMap Key, Value
        Map<String, Object> employees = new HashMap<>();

        // put(key, value)
        // put(ssn, employee object)
        employees.put("333-33-3333", e1);
        employees.put("111-11-1111", e2);
        employees.put("444-44-4444", e3);
        // Employee #4 has the same ssn key as Employee #3
        employees.put("444-44-4444", e4);
        
        Set keys = employees.keySet();
        for(Object key : keys) {            
            // This prints the employee key and then the employee toString function
            System.out.println(key.toString());
            // There is probaby a better way to do this.
            System.out.println(employees.get(key.toString()).toString());
            
        }
        
        //hashMapLoop(employees);
        
        
//        List<Employee> employeeList = (List<Employee>) employees;
//        
//        for(Employee e: employeeList){
//            System.out.println(e.getSsn());
//        }
        
    }
    
}
