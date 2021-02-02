
package org.student;

import java.util.List;

public class Student {
    

    public String name;
    public int mark;
    public char grade;
    public List<Student> getStudents;
    
    public Student(){

    }


    public Student(String name,int mark, char grade){

        this.name = name;
        this.mark = mark;
        this.grade = grade;
        getStudents.add(this);
    }

    
      public String getName(){


        return name;
    }


    public void setName(String name){

        this.name = name;
      
    }

    public int getMark(){


        return mark;
    }

    public void setMark(int mark){
        this.mark = mark;
    }

    public char getGrade(){

        return grade;
    }

    public void setGrade(char grade){

       /*

        if(mark <= 30){

            grade = 'F';
        }
        else if(mark >= 30 || mark <= 50){
            grade = 'D';
        }
        else if (mark >= 50 || mark <= 60){
            grade = 'E';
        }
        else if (mark >= 60 || mark <= 70){
            grade = 'B';
        }
        else if (mark > 70){
            grade = 'A';
        }

        */
        this.grade = grade;
    }

    public String toString(){
        
        StringBuilder sbStudent = new StringBuilder();
        
        sbStudent.append("[");
        
        sbStudent.append(getName());
        sbStudent.append(" : ");
        sbStudent.append(getMark());
        sbStudent.append(" : ");
        sbStudent.append(getGrade());
        sbStudent.append(" : ");
        sbStudent.append("]");
        
        return sbStudent.toString();
    }





}
