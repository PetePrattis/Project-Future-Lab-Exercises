package gr.codehub.pf.labs.lab1.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Exercise3 {
    public static void main(String[] args){
        //students//

        //undergraduates
        undergraduateStudent u1 = new undergraduateStudent(Title.Undergraduate,"Adam Zane", Degree.Physics, 3);
        undergraduateStudent u2 = new undergraduateStudent(Title.Undergraduate,"Carol Cook", Degree.Computing, 1);
        undergraduateStudent u3 = new undergraduateStudent(Title.Undergraduate,"Mary Smith", Degree.Maths, 1);
        undergraduateStudent u4 = new undergraduateStudent(Title.Undergraduate,"Nick James", Degree.Computing, 2);
        undergraduateStudent u5 = new undergraduateStudent(Title.Undergraduate,"Rita Jones", Degree.Maths, 2);

        //masters
        mastersStudent m1 = new mastersStudent(Title.Masters,"Bob Ward", Degree.Chemistry, 1, "Effective cloth burning with acid");
        mastersStudent m2 = new mastersStudent(Title.Masters,"James Nick", Degree.Chemistry, 3, "Experimenting with explosive materials");
        mastersStudent m3 = new mastersStudent(Title.Masters,"Rick Stiles", Degree.Maths, 1, "Something about numbers");
        mastersStudent m4 = new mastersStudent(Title.Masters,"Tom Links", Degree.Physics, 1, "Building black holes in a lab environment");
        mastersStudent m5 = new mastersStudent(Title.Masters,"Trudy Best", Degree.Computing, 2, "Methods for emptying a garbage collector");

        //Phd
        phdStudent p1 = new phdStudent(Title.PhD,"Eve Fine", Degree.Chemistry, 3, "Minimizing the volume of elephant toothpaste", "Liz Lorens");
        phdStudent p2 = new phdStudent(Title.PhD,"Helen Brown", Degree.Physics, 2, "Do objects fall up or down?", "Jeremy Tryst");
        phdStudent p3 = new phdStudent(Title.PhD,"Jane Smart", Degree.Chemistry, 3, "Inorganic replacements for meat", "Linda Tyle");
        phdStudent p4 = new phdStudent(Title.PhD,"Shamra Kind", Degree.Computing, 2, "Functional versus dysfunctional programming", "Don Lake");
        phdStudent p5 = new phdStudent(Title.PhD,"Timoth Roth", Degree.Maths, 1, "Speed measurements on unplugged computers", "Jane Wise");

        List<undergraduateStudent> students = new ArrayList<>();
        students.add(u1);
        students.add(u2);
        students.add(u3);
        students.add(u4);
        students.add(u5);
        students.add(m1);
        students.add(m2);
        students.add(m3);
        students.add(m4);
        students.add(m5);
        students.add(p1);
        students.add(p2);
        students.add(p3);
        students.add(p4);
        students.add(p5);




        createRandomTeam(students);

    }

    static void createRandomTeam(List<undergraduateStudent> team){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter team Name: ");
        String teamName = myObj.nextLine();

        Random rand = new Random();
        //let's say min 2 max 4 members
        int teamSize = rand.nextInt(4 - 2 + 1) + 2;
        studentTeams st = new studentTeams();
        List<undergraduateStudent> teamAlpha = new ArrayList<>();

        for(int i=0; i<teamSize; i++){
            int memberIndex = rand.nextInt(team.size() + 1);
            teamAlpha.add(team.get(memberIndex));
        }
        
        System.out.println("Enter team Name: ");
        st.showInfo(teamAlpha);


    }


}
