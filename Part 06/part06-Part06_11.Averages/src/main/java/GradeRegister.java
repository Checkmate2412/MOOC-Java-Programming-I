
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades, gradesAdded;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradesAdded = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.gradesAdded.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfPoints() {
        if (this.gradesAdded.isEmpty())
            return -1;
        
        return (double) this.sum(this.gradesAdded) / this.gradesAdded.size();
    }
    
    public double averageOfGrades() {
        if (this.grades.isEmpty())
            return -1;
        
        return (double) this.sum(this.grades) / this.grades.size();
    }
    
    public int sum(ArrayList<Integer> gradesList) {
        int sum = 0;
        
        for (Integer grade : gradesList) 
            sum += grade;
        
        return sum;
    }
    
    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
