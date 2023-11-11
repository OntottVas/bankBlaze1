package hu.bankblaze.bankblaze.service;

import hu.bankblaze.bankblaze.model.Corporate;
import hu.bankblaze.bankblaze.model.QueueNumberRange;
import hu.bankblaze.bankblaze.repo.CorporateRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Queue;

@Service
@AllArgsConstructor
public class CorporateService {

    private final QueueNumberRange corpAccRange;
    private final QueueNumberRange corpCrdRange;
    private final QueueNumberRange corpSavRange;
    private final QueueNumberRange corpElSrvRange;

    @Autowired
    private CorporateRepository corporateRepository;

    public List<Corporate> getAllCorporates() {
        return corporateRepository.findAll();
    }

    public Corporate getCorporateById(Long id) {
        return corporateRepository.findById(id).orElse(null);
    }
}
