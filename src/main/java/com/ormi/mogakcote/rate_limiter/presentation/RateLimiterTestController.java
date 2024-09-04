package com.ormi.mogakcote.rate_limiter.presentation;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Refill;
import java.time.Duration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimiterTestController {

    private final Bucket bucket;

    public RateLimiterTestController() {
        // 충전 간격을 10초로 지정하며, 한 번 충전할 때마다 2개의 토큰을 충전한다.
        Refill refill = Refill.intervally(2, Duration.ofSeconds(10));

        // Bucket의 총 크기는 3
        Bandwidth limit = Bandwidth.classic(3, refill);

        // 총 크기는 3이며 10초마다 2개의 토큰을 충전하는 Bucket
        this.bucket = Bucket.builder()
                .addLimit(limit)
                .build();

    }

    @GetMapping(value = "/api/v1/rate-limiter/test")
    public ResponseEntity<String> test() {
        if (bucket.tryConsume(1)) {
            return ResponseEntity.ok("success!");
        }
        return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).build();
    }

}