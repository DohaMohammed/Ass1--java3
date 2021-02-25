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
public abstract class Student {
    protected int id;
    protected String name,major;
    protected double grade;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", major=" + major + ", grade=" + grade + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGrade() {
        return grade;
    }
}
