public class p8t3 {

    
    public static void main(String[] args) {
        double[] credit = {3, 2, 1.5, 3, 3}; 

        // Grade points for 5 students in 5 subjects [students][subjects]
        double[][] gradePoints = {
            {4, 3.5, 3.25, 3.75, 3},
            {3,3.75,3.75,4,4},
            {2.75,3,4,4,3},
            {3.5,4,3.5,4,4},
            {2.5,2.5,3.75,4,4}
        };

        // Calculate CGPA for each student
        for (int i = 0; i < 5; i++) {
            double totalgradePoints = 0;
            int totalCredits = 0;

            for (int j = 0; j < 5; j++) {
                totalgradePoints += gradePoints[i][j] * credit[j];
                totalCredits += credit[j];
            }

            double cgpa = totalgradePoints / totalCredits;
            cgpa= Math.round(cgpa * 100.0) / 100.0;
            System.out.println("Student "+ (i+1)+": "+ cgpa);
        }
    

    }
}