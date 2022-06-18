package com.insurance.app.insurance.disease;

import com.insurance.app.insurance.specialization.Specialization;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "disease")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Disease {

    @Id
    @SequenceGenerator(
            name = "disease_sequence",
            sequenceName = "disease_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "disease_sequence"
    )
    private Long disease_id;

    private String name;
    private String category;

//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            })
//    @JoinTable(name = "disease_specialization",
//            joinColumns = {@JoinColumn(name = "disease_id")},
//            inverseJoinColumns = {@JoinColumn(name = "specialization_id")})
//    private List<Specialization> specialization;
}
