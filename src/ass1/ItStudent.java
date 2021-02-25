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
public class ItStudent extends Student {
        public ItStudent(String name, int id,double mid, double project, double finalExam){
           this.grade = mid*0.30 + project*0.30 + finalExam*40;
           this.name = name;
           this.id = id;
        }
}
