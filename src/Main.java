public class Main {

    private static final Employee[] emp = new Employee[10];


    public static void main(String[] args) {

        emp[0] = new Employee("Лосев Игорь Альбертович", 3, 18000);
        emp[1] = new Employee("Рогозина Светлана Романовна", 2, 25000);
        emp[2] = new Employee("Голубева Ирина Игоревна", 3, 20000);
        emp[3] = new Employee("Федеров Геннадий Александрович", 4, 13000);
        emp[4] = new Employee("Пупкина Александра Семеновна", 5, 27000);
        emp[5] = new Employee(" Теселкина Евгения Сергеевна ", 1, 45000);
        emp[6] = new Employee(" Рапапорт Инна Николаевна ", 1, 50000);
        emp[7] = new Employee(" Крюков Михаил Витальевич ", 3, 41000);
        emp[8] = new Employee(" Подгурская Валентина Владимировна ", 5, 35000);
        emp[9] = new Employee(" Казаков Кирилл Сергеевич ", 1, 23000);

        printAllEmployees();
        System.out.println(" Сумма затрат на зарплаты всех сотрудников в месяц составляет: " + calculateSumAllSalary());
        System.out.println(" Сотрудник с минимальной заработной платой: " + getEmployeeWithMinSalary());
        System.out.println(" Сотрудник с максимальной заработной платой: " + getEmployeeWithMaxSalary());
        System.out.println(" Средняя заработная плата одного сотрудника в месяц составляет: " + calculateAverageSalary());
        printFullNameAllEmployees();
    }

    public static void printAllEmployees() {
        for (Employee employee : emp) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int calculateSumAllSalary(){
        int sum = 0;
        for (Employee employee : emp) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : emp) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : emp) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static void printFullNameAllEmployees() {
        for (Employee employee : emp) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static int calculateAverageSalary(){
        int averageSalary = 0;
        int counter = 0;
        for (int i = 0;i< emp.length;i++) {
            counter++;
            averageSalary = calculateSumAllSalary()/counter;
            }
        return averageSalary;
    }
}





