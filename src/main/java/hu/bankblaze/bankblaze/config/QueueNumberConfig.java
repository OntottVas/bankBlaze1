package hu.bankblaze.bankblaze.config;

import hu.bankblaze.bankblaze.model.QueueNumberRange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueNumberConfig {
    @Bean
    public QueueNumberRange retAccRange() {
        return new QueueNumberRange(1100, 1199);
    }

    @Bean
    public QueueNumberRange retCrdRange() {
        return new QueueNumberRange(1200, 1299);
    }

    @Bean
    public QueueNumberRange retSavRange() {
        return new QueueNumberRange(1300, 1399);
    }

    @Bean
    public QueueNumberRange retElSrvRange() {
        return new QueueNumberRange(1400, 1499);
    }

    @Bean
    public QueueNumberRange corpAccRange() {
        return new QueueNumberRange(2100, 2199);
    }

    @Bean
    public QueueNumberRange corpCrdRange() {
        return new QueueNumberRange(2200, 2299);
    }

    @Bean
    public QueueNumberRange corpSavRange() {
        return new QueueNumberRange(2300, 2399);
    }

    @Bean
    public QueueNumberRange corpElSrvRange() {
        return new QueueNumberRange(2400, 2499);
    }

    @Bean
    public QueueNumberRange telDepRange() {
        return new QueueNumberRange(3100, 3199);
    }

    @Bean
    public QueueNumberRange telWithRange() {
        return new QueueNumberRange(3200, 3299);
    }

    @Bean
    public QueueNumberRange telExcRange() {
        return new QueueNumberRange(3300, 3399);
    }

    @Bean
    public QueueNumberRange premiumRange() {
        return new QueueNumberRange(9000, 9999);
    }

    @Bean
    public int initializeQueueNumber () {
        return 0;
    }
}
