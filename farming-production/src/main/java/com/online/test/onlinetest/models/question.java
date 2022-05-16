package com.online.test.onlinetest.models;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
import lombok.Getter;
import lombok.Setter;
 
import javax.persistence.Column;
 
 
 
@Entity
@Table (name="TBL_QUESTIONS")
@Getter
@Setter
 
public class question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "NAME")
 
    private String name;    
    @Column (name = "DESCRIPTION")
 
    private String description;    
    @Column (name = "SCORE")
 
    private short score;
 
    @ManyToOne
    @JoinColumn(name = "EXAM_ID" , nullable = false)
    private exam exam;
}
 

