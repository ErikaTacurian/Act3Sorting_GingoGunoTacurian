import java.util.Scanner;

class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name=name;
        this.grade=grade;
    }

    public String toString() {
        return name + "-" + grade;
    }
}

public class StudentSort {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.print("How many students?");
      int stud=sc.nextInt();
      sc.nextLine();

      Student[] students = new Student[stud];

      for(int i=0;i<stud;i++) {
        System.out.println("Enter details for student #"+(i+1));

        System.out.print("Name:");
        String name = sc.nextLine();

        System.out.print("Grade:");
        double grade = sc.nextDouble();
        sc.nextLine();

        students[i] = new Student(name,grade);
      }

      for(int i=0; i<students.length-1;i++) {
        int miniIndex=i;
        for(int j=i+1; j<students.length;j++) {
          if(students[j].grade<students[miniIndex].grade) {
            miniIndex = j;
          }
        }

        Student t = students[i];

        students[i]=students[miniIndex];
        students[miniIndex]=t;
      }
      System.out.println("Sorted students by grade(Ascending): ");
      for (Student s : students) {
        System.out.println(s);
      }
    }
}
