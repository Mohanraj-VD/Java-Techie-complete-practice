package com.practice.java.Stream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String doc1 = "range";
        String doc2 = "order";
        String doc3 = "limit";
        arr.add(doc1);
        arr.add(doc2);
        arr.add(doc3);
        Runn runn = new Runn("Mohanraj", "V", arr, 9182983874l, 3, "Art", 'D', "6A");
        Runn runn2 = new Runn("Manikandan", "V", arr, 388384893838l, 9, "Art", 'D', "6A");
        Runn runn3 = new Runn("Random", "V", arr, 93883747848l, 4, "Art", 'D', "6A");
        Runn runn4 = new Runn("Rajan", "V", arr, 38838388493l, 5, "Art", 'D', "6A");
        Runn runn5 = new Runn("Marian", "V", arr, 8383849934l, 8, "Art", 'D', "6A");

        ArrayList<Runn> newArr = new ArrayList<>();
        newArr.add(runn);
        newArr.add(runn2);
        newArr.add(runn3);
        newArr.add(runn4);
        newArr.add(runn5);
        String finalOp = newArr.stream()
                .filter(r -> r.getExperience() > 4)
                .map(r -> r.getfName() + " " + r.getlName())
                .collect(Collectors.joining(", "));


        List<String> finalOp2 = newArr.stream()
                .filter(r -> r.getExperience() > 4)
                .map(r -> r.getfName() + " " + r.getlName())
                .collect(Collectors.toList());
        System.out.println(finalOp+" "+finalOp2);
    }
}

class Runn {
    private String fName;
    private String lName;
    private List<String> docList;
    private long phNumber;
    private int experience;
    private String department;
    private char grade;
    private String jobLevel;

    public Runn(String fName, String lName, List<String> docList, long phNumber, int experience, String department, char grade, String jobLevel) {
        this.fName = fName;
        this.lName = lName;
        this.docList = docList;
        this.phNumber = phNumber;
        this.experience = experience;
        this.department = department;
        this.grade = grade;
        this.jobLevel = jobLevel;
    }

    @Override
    public String toString() {
        return "Runn{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", docList=" + docList +
                ", phNumber=" + phNumber +
                ", experience=" + experience +
                ", department='" + department + '\'' +
                ", grade=" + grade +
                ", jobLevel='" + jobLevel + '\'' +
                '}';
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List<String> getDocList() {
        return docList;
    }

    public void setDocList(List<String> docList) {
        this.docList = docList;
    }

    public long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }
}
