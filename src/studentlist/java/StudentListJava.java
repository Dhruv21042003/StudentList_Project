/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist.java;

/**
 *
 * @author dhruv
 */
public class StudentListJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Store and Print the Student List
        Student[] list = new Student[3];
        Student s1 = new Student();
        s1.setName("Dhruv Patel");
        s1.setAge(19);
        
        Student s2 = new Student();
        s2.setName("Mitali Rathod");
        s2.setAge(80);
        
        Student s3 = new Student();
        s3.setName("Aryan Gajjar");
        s3.setAge(5);
        
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }
    }
}
