package com.campus.app;

import com.campus.model.Student;
import com.campus.service.StudentService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input from users
        System.out.println("enter the student id");
        int studentid=sc.nextInt();
        System.out.println("enter the student name");
        String studentname=sc.next();
        System.out.println("enter the student age");
        int age=sc.nextInt();
        System.out.println("enter the student department");
        String department=sc.next();
        System.out.println("number of subjects");
        int n=sc.nextInt();
        int[] marks=new int[n];
        for (int i=0;i<n;i++) {
            System.out.println("Enter the mark of subject" +(i+1));
            marks[i] = sc.nextInt();
            sc.nextLine(); // consume the newline character
        }
        Student student = new Student(studentid,studentname,age,department,marks);
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        sc.close();
    }
}
