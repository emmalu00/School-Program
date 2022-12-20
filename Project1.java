
/**
* Project1.java
* Emma Lucas
*
* <COMPLETE description of the project (at least 3 or 4 sentences) – i.e. What does the program do?
Must be detailed enough so outside reader of your code can determine the specifics of the program>
*/

import java.util.*;

public class Project1 {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        final int PROJECT = 30;
        final int EXAM = 100;
        final int TOTAL_PTS = 290;
        final int XL_SLICES = 20;
        final int SLICES = 2;

        double[] project_scores = new double[3]; 
        double project_sums = 0;
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Enter score for Project #" + i + " (0-30): " );
            project_scores[i] = Double.parseDouble(s.nextLine()); 
            project_sums += project_scores[i];
        }

        System.out.print("Enter score for the midterm exam (0-100): " );
        double midterm = Double.parseDouble(s.nextLine()); 
        System.out.print("Enter score for the final exam (0-100): " );
        double finalExam = Double.parseDouble(s.nextLine()); 

        double grade = ((project_sums + midterm + finalExam) / TOTAL_PTS) * 100;
        System.out.printf("Overall grade percentage is %.2f%%\n", grade);

        System.out.println();

        System.out.print("Enter number of people attending the pizza party: " );
        int people = Integer.parseInt(s.nextLine());
        int numSlices = people * SLICES;
        int pizzas = ((numSlices - 1) / XL_SLICES) + 1;
        int leftover = (pizzas * 20) - numSlices;

        System.out.println("For " + people + " people, that would be " + pizzas + " pizza(s) with everyone having 2 slices each.");
        System.out.println("There would be " + leftover + " slice(s) leftover.");




    }
}