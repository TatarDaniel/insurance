package com.insurance.app.insurance.hospital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
    private Long id;
    private String name;
    private String address;

}
