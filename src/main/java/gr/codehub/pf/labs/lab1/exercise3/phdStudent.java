package gr.codehub.pf.labs.lab1.exercise3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class phdStudent extends mastersStudent{
    private Title title;
    private String name;
    private Degree degree;
    private int specializations;
    private String dissertation;
    private String supervisor;


}
