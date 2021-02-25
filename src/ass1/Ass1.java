/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ass1;
/**
 *
 * @author WAFA
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Ass1 {
    public static void main(String[] args)  {
       //assignment 1:
      //  Q2. Explain how can you save the number 4200200200 into variable of type int . 
        int num = Integer.parseUnsignedInt("4200200200");
        System.out.println(Integer.toUnsignedString(num));

     //Q4. Write an abstract class Student that includes the following hidden attributes: id(int), name(String), major(String) and grade(double), then create setter and getter for each of them. Write two classes that inherited from Student: ItStudent and ArtStudent. The grade for ItStudent is calculated as: grade = mid*0.30 + project*0.30 + final*40 and the grade for ArtStudent is calculated as: grade = mid*0.40 + report*0.10 + final*50. Crate main class that achieve the following: a. Create an array of some Student objects from both ItStudent and ArtStudent classes. b.  Sort the Student objects by grade in descending order using functions. c. Save the sorted objects into file.
   
        Student []students = {new ItStudent("Doha",11,30,30,40),
                              new ItStudent("Noor",222,25,29,39),
                              new ArtStudent("Saja",44,40,10,50),
                              new ArtStudent("Heba",555,35,9,40)
        };
        
        List<Student> studentList = Arrays.asList(students)
                .stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());
                
        System.out.println("Sorted Students");
        for(Student student: studentList)
            System.out.println(student);
        
        File file = new File("G:\\file.txt");
        PrintWriter writes = null;
        try{
            file.createNewFile();
            writes = new PrintWriter(file);
            for(Student student: students)
            writes.println(student);
            
        }catch (IOException ex){
            System.out.println("throws IO Exception");
        }
        writes.close();
       
}}
