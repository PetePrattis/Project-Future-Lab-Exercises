package gr.codehub.pf.labs.lab1.exercise3;

import java.util.*;

import static gr.codehub.pf.labs.lab1.exercise3.Title.*;

public class studentTeams{


     boolean isLocalCompetitor(List<undergraduateStudent> team){
        System.out.println(team);
        if(team.size() == 3){
            for(undergraduateStudent member : team){
                System.out.println(member);
                if(member.getTitle().toString().equals(PhD.toString())){
                    System.out.println(member.getTitle().toString());
                    return false;
                }
                if(member.getSpecializations() >= 2){
                    return false;
                }
            }
        }
        else {
            return false;
        }
        return true;
    }

    static boolean oneUG;
    static int sumPhd;
    static int sumSpec;

    boolean isNationalCompetitor(List<undergraduateStudent> team){
        oneUG = false;
        sumPhd = 0;
        sumSpec = 0;
        if(team.size() == 3) {
            for(undergraduateStudent member : team){
                if(member.getTitle().toString() == Undergraduate.toString()){
                    oneUG = true;
                }
                else{
                    if (member.getTitle().toString() == PhD.toString()){
                        sumPhd++;
                    }
                    sumSpec += member.getSpecializations();
                }
            }
        }
        else{
            return false;
        }

        if (oneUG && sumPhd == 1 && sumSpec <= 3){
            return true;
        }
        return false;
    }

    static boolean nonPhd;
    static boolean allSpecMin2;
    List<String> degrees;

    boolean isInternationalCompetitor(List<undergraduateStudent> team){
        nonPhd = false;
        allSpecMin2= true;
        degrees = new ArrayList<>();
        if(team.size() == 3) {
            for (undergraduateStudent member : team) {
                degrees.add(member.getDegree().toString());
                if(member.getTitle().toString() != PhD.toString()){
                    nonPhd = true;
                }
                if(member.getSpecializations() < 2){
                    allSpecMin2 = false;
                }
            }
        }
        else{
            return false;
        }
        if(nonPhd && allSpecMin2 && distinctDegree(degrees)){
            return true;
        }
        return false;
    }

    public static boolean distinctDegree( List<String> d){
        Set<String> s = new HashSet<>(d);
        return (s.size() == d.size());
    }

    //private List<undergraduateStudent> teamMembers;
    public void showInfo(List<undergraduateStudent> team){
        System.out.println(team);

        if(isLocalCompetitor(team)){
            System.out.println("can compete local");
        }
        else{
            System.out.println("can not compete local");
        }
        if(isNationalCompetitor(team)){
            System.out.println("can compete national");
        }
        else{
            System.out.println("can not compete national");
        }
        if(isInternationalCompetitor(team)){
            System.out.println("can compete international");
        }
        else{
            System.out.println("can not compete international");
        }

    }

}
