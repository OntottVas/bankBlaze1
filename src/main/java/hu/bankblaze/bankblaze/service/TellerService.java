package hu.bankblaze.bankblaze.service;

import hu.bankblaze.bankblaze.model.QueueNumberRange;
import hu.bankblaze.bankblaze.model.Teller;
import hu.bankblaze.bankblaze.repo.TellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class TellerService {
    private final TellerRepository tellerRepository;
    private final QueueNumberRange telDepRange;
    private final QueueNumberRange telWithRange;
    private final QueueNumberRange telExcRange;

    public List<Teller> getAllTellers() {
        return tellerRepository.findAll();
    }

    public Teller getTellerById(Long id) {
        return tellerRepository.findById(id).orElse(null);
    }

}
