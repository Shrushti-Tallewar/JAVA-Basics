package project;
interface Student {
    void getStudentDetails();
}

interface Marks {
    void getMarks();
}

class Result implements Student, Marks {
    String name = "Rahul";
    int rollNo = 101;
    int m1 = 85, m2 = 90, m3 = 88;

    public void getStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public void getMarks() {
        System.out.println("Marks in Subject 1: " + m1);
        System.out.println("Marks in Subject 2: " + m2);
        System.out.println("Marks in Subject 3: " + m3);
    }

    void displayResult() {
        int total = m1 + m2 + m3;
        double average = total / 3.0;
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}

public class interface1 {
    public static void main(String[] args) {
        Result r = new Result();
        r.getStudentDetails();
        r.getMarks();
        r.displayResult();
    }
}

