package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * This class represents an Employee entity that will be sorted by its "natural
 * order," defined to be by empID.
 *
 * @author jlombardo
 */
public class Employee implements Comparable {

    private int empID;
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee() {
    }

    public Employee(int empID, String lastName, String firstName, String ssn) {
        this.empID = empID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
        this.empID = empID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Employee other = (Employee) obj;
//        if (this.ssn != other.ssn) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 67 * hash + this.ssn;
//        return hash;
//    }
    /**
     * This method compares two Employee objects The type this method is
     * intended to accept is an Employee object
     *
     * @param other - Other is the employee object passed into the compareTo
     * function
     * @return
     */
    public int compareTo(Object other) throws IllegalArgumentException {

        //Checks to make sure the object being compared is of type Employee
        if (!(other instanceof Employee)) {
            throw new IllegalArgumentException();
        }

        Employee o = (Employee) other;

        return new CompareToBuilder()
                //.append(this.empID, o.empID)
                // Compare to changed to compare the employee ssn
                // change made to accomodate requirements of the Maps lab
                .append(this.ssn, o.ssn)
                .toComparison();
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) throws IllegalArgumentException {
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("value cannot be null or zero length");
        }
        firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmpID(int id) {
        this.empID = id;
    }

    public int getEmpID() {
        return empID;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName;
    }

}
