public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan Ivanovich", "Java Developer",
                "Ivan@pika.ru", "8111111111", 30000, 20);
        employeeArray[1] = new Employee("Smirnov Ivan Ivanovich", "Java Developer",
                "Ivan@pika.ru", "8111111111", 30000, 46);
        employeeArray[2] = new Employee("Petrov Ivan Ivanovich", "Java Developer",
                "Ivan@pika.ru", "8111111111", 30000, 20);
        employeeArray[3] = new Employee("Vasikiev Ivan Ivanovich", "Java Developer",
                "Ivan@pika.ru", "8111111111", 30000, 50);
        employeeArray[4] = new Employee("Dzenov Ivan Ivanovich", "Java Developer",
                "Ivan@pika.ru", "741651646", 30000, 20);

        for (Employee employee : employeeArray) {
            if (employee.getAge() > 45) {
                employee.info();
            }

        }


    }
}
