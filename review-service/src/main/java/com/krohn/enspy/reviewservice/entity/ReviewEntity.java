package com.krohn.enspy.reviewservice.entity;

import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@IdClass(ReviewEntityPK.class)
@Table(name = "review")
public class ReviewEntity {
    @Id
    private int productId;
    @Id
    private int reviewId;
    private String author;
    private String subject;
    private String content;
}
