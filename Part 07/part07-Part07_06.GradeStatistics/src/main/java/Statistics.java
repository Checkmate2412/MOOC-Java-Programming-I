
import java.util.ArrayList;


public class Statistics {
    private ArrayList<Integer> grades;
    private int pass;

    public Statistics() {
        this.grades = new ArrayList<>();
        this.pass = 0;
    }
    
    public void add(int num) {
        this.grades.add(num);
    }
    
    public double pointAverage() {
        int sum = 0;
      
        for (Integer grade : grades) {
            sum += grade;
        }  
        
        return (double) sum / this.grades.size();
    } 
     
    public String passingPointAverage() {
        int sum = 0;
        this.pass = 0;
        
        for (Integer grade : grades) {
            if (grade >= 50) {
                this.pass++;
                sum += grade;
            }
        }
        
        if (this.pass == 0)
            return "-";
        
        return String.valueOf((double) sum / this.pass);
    }
    
    public double percentage() {
        if (this.pass == 0)
            return 0.0;
        
        return ((double)this.pass / this.grades.size()) * 100.0;
    }
    
    public String gradeDistribution() {
        int num0 = 0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        
        for (Integer grade : grades) {
            System.out.println(grade);
            if (grade < 50)
                num0++;
            else if (grade >= 50 && grade < 60)
                num1++;
            else if (grade >= 60 && grade < 70)
                num2++;
            else if (grade >= 70 && grade < 80) 
                num3++;
            else if (grade >= 80 && grade < 90)
                num4++;
            else
                num5++;
        }
        
        System.out.println(num0);
        
        return "\n5: " + gradeAsterisk(num5) +
                "\n4: " + gradeAsterisk(num4) +
                "\n3: " + gradeAsterisk(num3) +
                "\n2: " + gradeAsterisk(num2) +
                "\n1: " + gradeAsterisk(num1) +
                "\n0: " + gradeAsterisk(num0);
    }
    
    private String gradeAsterisk(int asteriskInteger) {
        String ast = "";
        
        for (int i = 0; i < asteriskInteger; i++) {
            ast += "*";
        }
        return ast;
    }
}
