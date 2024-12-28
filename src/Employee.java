import java.util.Objects;

public class Employee {
    private static int idNumber = 1;

    private final int id;
    private final String fullName;
    private int department;
    private int salary;


    public Employee(int department, String fullName, int salary) {
        id = idNumber++;
        this.department = department;
        this.fullName = fullName;
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Ф.И.О сотрудника - " + fullName +
                ", отдел - " + department +
                ", зарплата - " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }



}







