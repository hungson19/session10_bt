package ra.run;

import ra.config.InputMethods;
import ra.design.CRUD;
import ra.implement.EmployeeImplement;

public class EmployeeManagement {
    public static CRUD employeeImplement = new EmployeeImplement();

    public static void main(String[] args) {
        while (true) {
            System.out.println("*********************MENU********************** \n" +
                    "1.\tThêm mới 1 nhân viên \n" +
                    "2.\tHiển thị danh sách thông tin nhân viên \n" +
                    "3.\tXem thông tin nhân viên theo mã nhân viên\n" +
                    "4.\tCập nhật thông tin nhân viên\n" +
                    "5.\tXóa nhân viên\n" +
                    "6.\tTìm kiếm nhân viên theo tên\n" +
                    "7.\tSắp xếp và hiển thị danh sách nhân viên theo tên từ a - z\n" +
                    "8.\tThoát\n");

            System.out.println("Mời bạn nhập lựa chọn: ");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    employeeImplement.createEmployee();
                    break;
                case 2:
                    employeeImplement.displayEmployee();
                    break;
                case 3:
                    employeeImplement.displayEmployeeById();
                    break;
                case 4:
                    employeeImplement.updateEmployee();
                    break;
                case 5:
                    employeeImplement.deleteEmployee();
                    break;
                case 6:
                    employeeImplement.searchEmployee();
                    break;
                case 7:
                    employeeImplement.sortEmployeeByName();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, mời nhập lại");
                    break;
            }
        }
    }
}
