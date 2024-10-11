package com.proarecife.teiacultural.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post_videos", schema = "TEIACULTURAL")
public class PostVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "video_name")
    private String videoName;

    private String url;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}