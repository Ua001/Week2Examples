/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentlist;

/**
 *
 * @author 14379
 */
public class PrintStudentList {

    /**
     * store and print student details
     */
    public static void main(String[] args) 
    {
        Student[] list = new Student[3]; //creating array of objects
        
        //create array for 3 students, store and print the values
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        //setting the value
        s1.setName("Peter");
        s1.setAge(23);
        
        s2.setName("John");
        s2.setAge(22);
        
        s3.setName("Marco");
        s3.setAge(25);
        
        //Storing objects in array
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i=0; i<list.length; i++ )
        {
           // System.out.println(list[i]); //prints the memory address
            System.out.println(list[i].getName()+ ", " + list[i].getAge());
        }
        
    }
    
}
