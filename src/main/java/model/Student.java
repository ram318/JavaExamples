package model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Student {

    private String name;
    private String section;
    private int rollNo;
    private int percentage;

    public Student(String name, String section, int rollNo, int percentage) {
        this.name = name;
        this.section = section;
        this.rollNo = rollNo;
        this.percentage = percentage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRollNo() {
        return rollNo;
    }
    public int getPercentage() {
        return percentage;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void getDivision(int percentage){
        String message = "";
        if (percentage>70)
            message =  "Distinction";
        else if(percentage>=60 && percentage <70)
            message =  "First Class";
        else if(percentage >=50 && percentage < 60)
            message =  "Second Class";
        else if(percentage >=35 && percentage<50)
            message =  "Third Class";
        else message = "Fail";
        System.out.println(message);

    }

}
