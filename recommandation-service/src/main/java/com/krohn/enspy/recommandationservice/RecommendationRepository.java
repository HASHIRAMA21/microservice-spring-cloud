package com.krohn.enspy.recommandationservice;

import com.krohn.enspy.recommandationservice.entity.RecommendationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecommendationRepository extends MongoRepository<RecommendationEntity,String> {
}
