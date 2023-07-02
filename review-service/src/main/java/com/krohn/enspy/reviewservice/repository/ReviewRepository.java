package com.krohn.enspy.reviewservice.repository;

import com.krohn.enspy.reviewservice.entity.ReviewEntity;
import com.krohn.enspy.reviewservice.entity.ReviewEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ReviewRepository extends JpaRepository<ReviewEntity, ReviewEntityPK> {
    Collection<ReviewEntity> findByProductId(int productId);
}
