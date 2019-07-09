import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Rakesh", "Roshan", 927));
        employeeList.add(new Employee("Anurag", "Iyer", 123));
        employeeList.add(new Employee("Apoorv", "Bajpai", 132));
        employeeList.add(new Employee("Abhishek", "Kumar", 133));

        employeeList.forEach(employee -> System.out.println(employee));
        employeeList.set(1,new Employee("Shalu", "Koli", 77));

        System.out.println((employeeList.get(1)));
        System.out.println(employeeList.size());
        System.out.println(employeeList.isEmpty());

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee x : employeeArray)
            System.out.println(x);

        System.out.println(employeeList.contains(new Employee("Shalu", "Koli", 77)));
        System.out.println(employeeList.indexOf(new Employee("Abhishek", "Kumar", 133)));
        employeeList.remove(new Employee("Apoorv", "Bajpai", 132));
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
