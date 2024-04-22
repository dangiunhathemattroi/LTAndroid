/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private String Department;
    private String code;
    private double salaryRate;
    
    public Employee(int id,String name,int age,String Department,String code,double salaryRate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.Department=Department;
        this.code=code;
        this.salaryRate=salaryRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }
    
    @Override
    public String toString(){
    return "Employee{"+"Id: "+id+"- Name:"+name+"- Age:"+age+"- Department"+Department+"- code:"+code+"-salaryRate:"+salaryRate+'}';
}
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        // Khởi tạo mảng chứa 100 nhân viên
        Employee[] employees = new Employee[100];

        // Nhập thông tin cho 10 nhân viên
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter information for employee" + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống
            System.out.print("Department: ");
            String Department = scanner.nextLine();
            System.out.print("code: ");
            String code = scanner.nextLine();
            System.out.print("salaryRate: ");
            double salaryRate = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng trống

            // Khởi tạo và thêm nhân viên vào mảng
            employees[i] = new Employee(id, name, age, Department, code, salaryRate);
        }

        // Hiển thị danh sách 10 nhân viên ra console
        System.out.println("List of 10 employees:");
        for (Employee employee : employees) {
           if (employee != null) {
                System.out.println(employee);
            }
        } 
        
        // Add a new employee
        System.out.println("Enter information for the new employee:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary Rate: ");
        double salaryRate = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        // Find an empty slot in the array to add the new employee
        int emptySlot = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                emptySlot = i;
                break;
            }
        }

        // Add the new employee to the array if there's an empty slot
        if (emptySlot != -1) {
            employees[emptySlot] = new Employee(id, name, age, department, code, salaryRate);
            System.out.println("New employee added successfully.");
        } else {
            System.out.println("Cannot add a new employee. The employee list is full.");
        }

        // Display the updated list of employees
       /* System.out.println("Updated list of employees:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        */

        // Remove an employee
        System.out.print("Enter the ID of the employee you want to remove: ");
        int idToRemove = scanner.nextInt();
        boolean removed = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == idToRemove) {
                employees[i] = null;
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Employee with ID " + idToRemove + " removed successfully.");
        } else {
            System.out.println("Employee with ID " + idToRemove + " not found.");
        }

        // Display the updated list of employees after removal
       /* System.out.println("Updated list of employees after removal:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
*/
        //scanner.close();
    }
        
    }

