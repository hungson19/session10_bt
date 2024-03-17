package ra.entity;

import ra.config.EmployeeMassage;
import ra.config.InputMethods;

import java.util.Date;

public class Employee {

    private static int nextId = 0;
    private int employeeId;
    private String employeeName;
    private String phone;
    private String address;
    private Date date;
    private double salary;
    private double coefficient;// hệ số lương


    public Employee() {
        this.employeeId = ++nextId;
    }

    public Employee(int employeeId, String employeeName, String phone, String address, Date dob, double salary, double coefficient) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.phone = phone;
        this.address = address;
        this.date = date;
        this.salary = salary;
        this.coefficient = coefficient;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date dob) {
        this.date = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public void inputData() {
        System.out.println(EmployeeMassage.INPUT_NAME_LABEL);
        this.employeeName = InputMethods.getString();
        System.out.println(EmployeeMassage.INPUT_DOB_LABEL);
        this.date = InputMethods.getDate();
        System.out.println(EmployeeMassage.INPUT_ADDRESS_LABEL);
        this.address = InputMethods.getString();
        System.out.println(EmployeeMassage.INPUT_PHONE_LABEL);
        this.phone = InputMethods.getString();
        System.out.println(EmployeeMassage.INPUT_SALARY_LABEL);
        this.salary = InputMethods.getDouble();
        System.out.println(EmployeeMassage.INPUT_COEFFICIENT_LABEL);
        this.coefficient = InputMethods.getDouble();

    }

    public void displayData() {
        System.out.println("Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                ", salary=" + salary +
                ", coefficient=" + coefficient +
                '}');


    }

}
