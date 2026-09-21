import java.util.Scanner;

class it26101501lab9q4 {

    // Calculates final weighted mark
    public static double calcfinalmark(double exam_mark, double assignment_mark) {
        double final_marks = (30 * assignment_mark + 70 * exam_mark) / 100.0;
        return final_marks;
    }

    // Determines grade character based on final mark
    public static char findgrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 65) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Displays details formatted in table form
    public static void printdetails(String[][] studentData) {
        System.out.println("Name\t\tFinal Mark\tGrade");
        for (int i = 0; i < studentData.length; i++) {
            System.out.println(studentData[i][0] + "\t\t" + studentData[i][1] + "\t\t" + studentData[i][2]);
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String[][] studentData = new String[5][3];

        for (int z = 0; z < 5; z++) {
            System.out.print("enter the name of student " + (z + 1) + ": ");
            String name = input.next();

            System.out.print("enter the mark of student for assignment: ");
            double mark1 = input.nextDouble();

            System.out.print("enter the mark of student for exam: ");
            double mark2 = input.nextDouble();

            // Calculate final mark and grade
            double finalMark = calcfinalmark(mark2, mark1);
            char grade = findgrades(finalMark);

            // Simple conversion using empty string concatenation ("")
            studentData[z][0] = name;
            studentData[z][1] = finalMark + "";
            studentData[z][2] = grade + "";
            System.out.println();
        }

        // Print final report table
        printdetails(studentData);

        input.close();
    }
}