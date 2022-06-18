package com.insurance.app.insurance.hospital;

import com.insurance.app.insurance.specialization.Specialization;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "hospital_specialization",
            joinColumns = { @JoinColumn(name = "hospital_id") },
            inverseJoinColumns = { @JoinColumn(name = "specialization_id") })
    private List<Specialization> specialization;
}
