package com.proarecife.teiacultural.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "followers", schema = "TEIACULTURAL")
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "followers_id")
    private long followersId;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}