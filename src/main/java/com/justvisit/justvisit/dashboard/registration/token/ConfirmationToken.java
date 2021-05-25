package com.justvisit.justvisit.dashboard.registration.token;

import com.justvisit.justvisit.dashboard.partner.Partner;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ConfirmationToken {

    @SequenceGenerator(
            name = "confirmation_token_sequence",
            sequenceName = "confirmation_token_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "confirmation_token_sequence"
    )
    private Long id;

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime expiresAt;

    private LocalDateTime confirmedAt;


    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "partner_user_id"
    )
    private Partner partner;

    public ConfirmationToken(String token, LocalDateTime createdAt, LocalDateTime expiresAt, Partner partner) {
        this.token = token;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
        this.partner = partner;
    }
}
