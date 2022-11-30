package list;

import java.util.ArrayList;
import java.util.List;

class ArrayListLearn {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane", "Jone", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Marry", "Joe", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        // Print the whole list
        employeeList.forEach(employee -> System.out.println(employee));

        // Print an element given its index
        System.out.println(employeeList.get(1));

        // Check if the list is empty
        System.out.println(employeeList.isEmpty());

        // Change list's element
        employeeList.set(0, new Employee("JANE", "JONE", 999));
        employeeList.forEach(employee -> System.out.println(employee));

        // Print array's size
        System.out.println(employeeList.size());

        // Add an element in the middle
        // Time complexity: O(n) -> Pretty bad
        employeeList.add(3, new Employee("MIKE", "WILSON", 888));
        employeeList.forEach(employee -> System.out.println(employee));

        // Return the back array
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }

        // Check if the element is in the list
        System.out.println(employeeList.contains(new Employee("Jane", "Jone", 123)));

        // Check the index of a element
        System.out.println(employeeList.indexOf(new Employee("Jane", "Jone", 123)));

        // Remove an element by index
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
        
    }
}