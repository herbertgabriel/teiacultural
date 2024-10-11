package com.proarecife.teiacultural.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "store", schema = "TEIACULTURAL")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String bio;
    private String instagram;
    private int score;
    private String storeImg;
    private String category;
    private String wallpaper;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}