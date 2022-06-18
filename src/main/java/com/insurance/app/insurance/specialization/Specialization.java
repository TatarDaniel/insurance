package com.insurance.app.insurance.specialization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.insurance.app.insurance.hospital.Hospital;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="specialization")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Specialization {

    @Id
    @SequenceGenerator(
            name = "specialization_sequence",
            sequenceName = "specialization_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "specialization_sequence"
    )
    private Long specialization_id;
    private String name;
    private String category;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "specialization")
    @JsonIgnore
    private List<Hospital> hospital;

}
