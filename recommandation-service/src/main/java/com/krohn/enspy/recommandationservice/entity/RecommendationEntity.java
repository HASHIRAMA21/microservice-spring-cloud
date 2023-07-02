package com.krohn.enspy.recommandationservice.entity;

import jakarta.persistence.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RecommendationEntity {
    @Id
    private String id;
    @Version
    private int version;
    private int productId;
    private int recommendationId;
    private String author;
    private int rate;
    private String content;
}