/**
 * Stores information of a student, can be compared to another student
 * @author Simon Shao
 * @version 1.0.0
 */
public class Student{

    private String name;
    private int age;
    private String studentNumber;
    /**
     * initializes student information
     * @param name variable for name of student
     * @param age variable for student age
     * @param studentNumber variable for student number (ID)
     */
    public Student(String name, int age, String studentNumber){
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * to access name of student
     * @return returns the name of the student
     */
    public String getName(){
        return this.name;
    }
/**
     * to access age of student
     * @return returns the age of the student
     */
    public int getAge(){
        return this.age;
    }
/**
     * to access ID of student
     * @return returns the ID of the student
     */
    public String getStudentNumber(){
        return this.studentNumber;
    }

    /**
     * overrides the toString method to print out all information of student
     * @return returns a string of all informations of students
     */
    @Override
    public String toString(){
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }
/**
 * compares 2 students to see if they are the same person. 
 * @param obj Another student as an object that is to be compared with the current student
 * @return returns whether they are the same student or not
 */
    @Override
    public boolean equals(Object obj){
        try{
            Student student = (Student)obj;
            return student.getStudentNumber().equals(this.studentNumber);
        }
       catch(Exception e){
        return false;
       }
}
		}