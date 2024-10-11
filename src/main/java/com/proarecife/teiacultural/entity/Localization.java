package com.proarecife.teiacultural.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "localization", schema = "TEIACULTURAL")
public class Localization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    @OneToOne
    @JoinColumn(name = "users_id")
    private User user;
}