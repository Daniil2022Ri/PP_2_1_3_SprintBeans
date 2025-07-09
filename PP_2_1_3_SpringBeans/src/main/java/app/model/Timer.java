package app.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Timer {
    public LocalDateTime getCurrentTime(){
        return LocalDateTime.now();
    }
    private Long nanoTime = System.nanoTime();
    public Long getTime() {
        return System.currentTimeMillis();
    }
}

