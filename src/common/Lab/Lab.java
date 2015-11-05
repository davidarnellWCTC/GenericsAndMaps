package common.Lab;

// Import required packages and the Employee class
import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import common.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;

import java.util.*;

/**
 * 1. Using the Employee class from GenericsAndSets.common, create the necessary
 * equals(), hashCode(), toString()
 * 
* 2. Next, create and initialize four Employee objects, but this time make sure
 * at least two have the same social security number. Now add them to a HashMap.
 * What key will you use? How will you retrieve individual items? Use put(key,
 * value) to add items; use get(key) to retrieve items. Demonstrate a solution.
 * How will you loop through the keys or values? Demonstrate this too. * 
 * 
 * 3. * Store the same four Employee objects in a TreeMap. Demonstrate that sorting
 * works. First, make sure you override compareTo() from the Comparable
 * interface. Now try using a Comparator from the GenericsAndMaps project
 * (remember you’ll need a utility class). * 
 * 
 * 4. Store the same four Employee
 * objects in a TreeSet. Demonstrate that sorting works AND that duplicates are
 * removed by looping through the set using an iterator. Use both the natural
 * ordering and an alternative ordering.
 *
 * @author darnell
 */
public class Lab {

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
        employees.put("444-44-4444", e4);
        
        hashMapLoop(employees);
        
    }
    
    public static void hashMapLoop(Map<String,Object> object){
        Iterator it = object.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            String test = (String) object.get(it);
            System.out.println(test);
            it.remove();
        }
    }

}
