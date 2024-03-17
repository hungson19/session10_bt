package ra.implement;

import ra.config.EmployeeMassage;
import ra.config.InputMethods;
import ra.design.CRUD;
import ra.entity.Employee;

import java.util.Arrays;

public class EmployeeImplement implements CRUD {
    public static Employee[] employees = new Employee[100];
    private int countEmployee = 0;

    @Override
    public void createEmployee() {
        if (countEmployee == 100) {
            System.out.println(EmployeeMassage.FULLARRAY);
            return;
        }
        System.out.println("Mời bạn nhập số lượng nhân viên cần thêm");
        int newCount = InputMethods.getInteger();
        for (int i = 0; i < newCount; i++) {
            Employee newEmployee = new Employee();
            newEmployee.inputData();
            employees[countEmployee] = newEmployee;
            countEmployee++;
        }
    }

    @Override
    public void displayEmployee() {
        if (countEmployee == 0) {
            System.out.println(EmployeeMassage.EMPTYARRAY);
            return;
        }
        for (int i = 0; i < countEmployee; i++) {
            employees[i].displayData();
        }

    }

    @Override
    public void displayEmployeeById() {
        if (countEmployee == 0) {
            System.out.println(EmployeeMassage.EMPTYARRAY);
            return;
        }
        System.out.println("Mời bạn nhập id nv muốn xem thông tin");
        int idDisplayEmployee = InputMethods.getInteger();
        boolean check = false;
        for (int i = 0; i < countEmployee; i++) {
            if (idDisplayEmployee == employees[i].getEmployeeId()) {
                check = true;
                employees[i].displayData();
            }
        }
        if (!check) {
            System.out.println("Không có nhân viên có mã id" + idDisplayEmployee);
        }


    }

    @Override
    public void updateEmployee() {
        if (countEmployee == 0) {
            System.out.println(EmployeeMassage.EMPTYARRAY);
            return;
        }
        System.out.println("Mời bạn nhập id nv muốn update thông tin");
        int idUpdateEmployee = InputMethods.getInteger();
        boolean check = false;
        for (int i = 0; i < countEmployee; i++) {
            if (idUpdateEmployee == employees[i].getEmployeeId()) {
                check = true;
                for (int j = i; j < countEmployee; j++) {
                    //thông tin trước khi sửa
                    employees[j].displayData();
                    // mời bạn sửa thông tin
                    employees[i].inputData();
                    // thông tin sau update
                    employees[i].displayData();

                }
            }
        }
        if (!check) {
            System.out.println("Không có nhân viên có mã id" + idUpdateEmployee);
        }
    }

    @Override
    public void deleteEmployee() {
        if (countEmployee == 0) {
            System.out.println(EmployeeMassage.EMPTYARRAY);
            return;
        }
        System.out.println("Mời bạn nhập id nv muốn xóa thông tin");
        int idDeleteEmployee = InputMethods.getInteger();
        boolean check = false;
        for (int i = 0; i < countEmployee; i++) {
            if (idDeleteEmployee == employees[i].getEmployeeId()) {
                check = true;
                for (int j = i; j < countEmployee - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                countEmployee--;
                break;
            }
        }
        if (!check) {
            System.out.println("Không có nhân viên có mã id" + idDeleteEmployee);
        }


    }

    @Override
    public void searchEmployee() {
        System.out.println("Mời bạn nhập tên muốn tìm kiếm");
        String inputSearch = InputMethods.getString();
        boolean check = false;
        for (int i = 0; i < countEmployee; i++) {
            if (employees[i].getEmployeeName().toLowerCase().contains(inputSearch.toLowerCase())) {
                check = true;
                employees[i].displayData();
                break;
            }
        }
        if (!check) {
            System.out.println("Không có tên bạn muốn tìm kiếm");
        }


    }

    @Override
    public void sortEmployeeByName() {
        for (int i = 0; i < countEmployee; i++) {
            for (int j = i + 1; j < countEmployee; j++) {
                if (employees[i].getEmployeeName().compareTo(employees[j].getEmployeeName()) > 0) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }

            }
        }
    }

}
