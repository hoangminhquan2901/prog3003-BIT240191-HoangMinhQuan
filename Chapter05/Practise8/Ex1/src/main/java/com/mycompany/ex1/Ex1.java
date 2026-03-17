/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;
class Student{
    private String id;
    private String name;
    private double GPA;
    
    public Student(String id, String name, double GPA){
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }
    
    public String getId(){return id;}
    public String getName(){return name;}
    
    @Override
    public String toString(){
        return "MSSV: "+id+" | Ten: "+name+" | GPA: "+GPA;
    }
}
public class Ex1 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        System.out.println("Menu quan ly sinh vien");
        do{
            System.out.println("1.Them sinh vien");
            System.out.println("2.Hien thi danh sach");
            System.out.println("3.Tim kiem sinh vien");
            System.out.println("4.Xoa theo MSSV");
            System.out.println("0.Thoat");
            System.out.println("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1:
                    System.out.println("Nhap MSSV: ");
                    String id = sc.nextLine();
                    System.out.println("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap GPA: ");
                    double gpa = sc.nextDouble();
                    list.add(new Student(id, name, gpa));
                    System.out.println("Them thanh cong");
                    break;

                case 2:
                    System.out.println("Danh sach sinh vien:");
                    for (Student s : list) System.out.println(s);
                    break;

                case 3:
                    System.out.print("Nhap ten can tim: ");
                    String findName = sc.nextLine();
                    for (Student s : list) {
                        if (s.getName().equalsIgnoreCase(findName)) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhap MSSV can xoa: ");
                    String removeId = sc.nextLine();
                    list.removeIf(s -> s.getId().equals(removeId));
                    System.out.println("Da thuc hien xoa.");
                    break;
            }
        }while(choice != 0);
    }
}
