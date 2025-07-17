package OOP.Candidate;


import java.util.ArrayList;
import java.util.Arrays;

public class Candidates {

    public static void main(String[] args) {
        Candidate c1 = new Candidate("Saadat", 23, 190,false, Level.intermediate, true);
        Candidate c2 = new Candidate("Adilet", 25, 190,false, Level.advanced, false);
        Candidate c3 = new Candidate("Altynay", 27, 162,false, Level.beginner, true);
        Candidate c4 = new Candidate("Kuma", 28, 170,false, Level.intermediate, true);

        ArrayList<Candidate> arr = new ArrayList<>(Arrays.asList(c1,c2,c3,c4));

        result(arr);

    }

    public static void result(ArrayList<Candidate> arr) {
        for (Candidate c: arr) {
           if (physicalState(c.age, c.height,c.hasTattooOrScars) && educationState(c.levelOfEnglish, c.education)) {
               System.out.println(c.name + " " + "вы подходите");
           } else {
               System.out.println(c.name + " " + "к сожалению не можем вас принять");
           }
        }
    }

    public static boolean physicalState(int age, int height, boolean hasTattooOrScars) {
        return (age >= 21 && age < 35) && (height > 160 && height <= 190) && !hasTattooOrScars;
    }

    public static boolean educationState(Level english, boolean education) {
        return (!String.valueOf(english).equals("beginner") && education);
    }


}
