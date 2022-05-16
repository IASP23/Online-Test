package com.online.test.onlinetest.models;
 
import java.util.List;
 
//import java.time.LocalDate;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
import lombok.Getter;
import lombok.Setter;
 
@Entity
@Table (name="TBL_EXAMS")
@Getter
@Setter
 
public class exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "TITLE" , nullable = false , length = 100)
    private String title;
    @Column (name = "DESCRIPTION")
    private String description;
    @Column (name = "TIME_LIMIT")
    private short timeLimit;    
    @Column (name = "MINIMUN_PASSING_SCORE")
    private double minimunPassingScore;  
    @Column (name = "NUMBER_OF_CUESTION")
    private short numberOfCuestion;    
    @Column (name = "INSTRUNCTIONS")
    private String instrunctions;
  //  @Column (name = "DATE")
  //  private LocalDate date;
 
 
  @OneToMany (mappedBy = "exam") //nombre del atributo en la clase B
  private List<question> questions ;
 
}
