package Functional_Program.Project;

import java.util.List;

public class Employee {

    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        // Sorting
        List<Employee> emp = List.of(
                new Employee("SaliRam",50000),
                new Employee("Sushil",40000),
                new Employee("Dinesh",30000),
                new Employee("Prabha",20000)
        );
        emp.stream()
                .sorted((emp1,emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
