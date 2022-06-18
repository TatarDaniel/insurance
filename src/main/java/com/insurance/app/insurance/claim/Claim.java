package com.insurance.app.insurance.claim;

import com.insurance.app.insurance.specialization.Specialization;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "claim")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Claim {

    @Id
    @SequenceGenerator(
            name = "claim_sequence",
            sequenceName = "claim_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "claim_sequence"
    )
    private Long claim_id;

    private Long claimer_id;
    private LocalDateTime date; //  or store millis, convert to LocalDateTime
    private String description;
    private Double amount;
    private ClaimStatus claim_status = ClaimStatus.TO_BE_REVIEWED; //todo set default
    private String claimData;




}
