package com.hemanth.backend_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

//@Service
public class ViralityService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void updateScore(Long postId, String type) {
        String key = "post:" + postId + ":virality_score";

        int points = switch (type) {
            case "LIKE" -> 20;
            case "COMMENT" -> 50;
            default -> 1;
        };

        redisTemplate.opsForValue().increment(key, points);
    }
}
