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
public class ArtStudent extends Student {
    public ArtStudent(String name, int id,double mid, double report, double finalExam){
    this.grade = mid*0.40 + report*0.10 + finalExam*50;
    this.name = name;
    this.id = id;
}

}
