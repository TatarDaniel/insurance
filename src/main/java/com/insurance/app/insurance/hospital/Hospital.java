package com.insurance.app.insurance.hospital;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.insurance.app.insurance.policy.Policy;
import com.insurance.app.insurance.specialization.Specialization;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hospital")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {

    @Id
    @SequenceGenerator(
            name = "hospital_sequence",
            sequenceName = "hospital_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "hospital_sequence"
    )
    private Long hospital_id;
    private String name;
    private String address;
    private String addressName;


    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "hospital_specialization",
            joinColumns = {@JoinColumn(name = "hospital_id")},
            inverseJoinColumns = {@JoinColumn(name = "specialization_id")})
    private List<Specialization> specialization;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "hospital")
    @JsonIgnore
    private List<Policy> policies;


}
