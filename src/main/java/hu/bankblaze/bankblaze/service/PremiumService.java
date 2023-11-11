package hu.bankblaze.bankblaze.service;

import hu.bankblaze.bankblaze.model.Premium;
import hu.bankblaze.bankblaze.model.QueueNumberRange;
import hu.bankblaze.bankblaze.repo.PremiumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class PremiumService {

    private PremiumRepository premiumRepository;
    private final QueueNumberRange premiumRange;
    private int queueNumber;

    public List<Premium> getAllPremium() {
        return premiumRepository.findAll();
    }

    public int generateQueueNumber() {
        if (hasReachedMax(queueNumber, premiumRange.getMax())) {
            queueNumber = premiumRange.getMin();
        }
        queueNumber++;
        return queueNumber;
    }

    private boolean hasReachedMax(int queueNumber, int max) {
        return queueNumber == max;
    }

}
