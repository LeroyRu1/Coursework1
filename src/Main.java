public class Main {
    private static Employee[] employees = new Employee[10];


    public static void main(String[] args) {

        employees[0] = new Employee(1, "Иванов Иван Иванович", 112000);
        employees[1] = new Employee(2, "Кириллов Кирилл Киллирович", 114000);
        employees[2] = new Employee(2, "Олегов Олег Олегович", 116000);
        employees[3] = new Employee(1, "Максимов Максим Максимович", 118000);
        employees[4] = new Employee(3, "Петров Петр Петрович", 126000);
        employees[5] = new Employee(3, "Владимиров Владими Владимирович", 135000);
        employees[6] = new Employee(4, "Владиславово Владисла Владиславович", 176000);
        employees[7] = new Employee(5, "Андреев Андрей Андреевич", 90000);
        employees[8] = new Employee(4, "Евгеньев Евгений Евгениевич", 75000);
        employees[9] = new Employee(5, "Валерьев Валерий Валерьевич", 89000);

        printAllEmployees();
        System.out.println("Сумма завтра за месяц ЗП " + calculateSalary());
        System.out.println("Среднее значение зарплат " + averageSalary());
        System.out.println("Минимальная зарплата у сотрудника: " + findEmployeeWithMinSalary());
        System.out.println("Максимальная зарплата у сотрудника: " + findEmployeeWithMaxSalary());
        printFullName();
    }

   private static void printAllEmployees () {
       for (int i = 0; i < employees.length; i++) {
           System.out.println(employees[i]);
       }
   }

    private static int calculateSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employeeNewOne = employees[i];
            if (employeeNewOne != null) {
                sum += employeeNewOne.getSalary();
            }
        }
        return sum;
    }

    private static double averageSalary() {
        return (double) calculateSalary() / employees.length;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;

            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;

            }
        }
        return employeeWithMaxSalary;
    }

    private static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }


}





