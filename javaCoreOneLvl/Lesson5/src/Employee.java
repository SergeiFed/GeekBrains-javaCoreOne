public class Employee {


    private String surnameNameMiddleName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String surnameNameMiddleName, String position, String email, String phoneNumber, int salary, int age) {
        this.surnameNameMiddleName = surnameNameMiddleName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public void info() {
        System.out.printf("Фамилия имя отчество сотрудника - %s \n" +
                        "Должность сотрудника - %s \n" +
                        "Email - %s \n" +
                        "Номер телефона - %s \n" +
                        "Зарплата сотрудника - %d \n" +
                        "Возраст сотрудника - %d \n\n",
                surnameNameMiddleName, position, email, phoneNumber, salary, age);
    }

    public String getSurnameNameMiddleName() {
        return surnameNameMiddleName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSurnameNameMiddleName(String surnameNameMiddleName) {

        this.surnameNameMiddleName = surnameNameMiddleName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
