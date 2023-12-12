package org.isetn;

import org.isetn.entities.Absence;
import org.isetn.repository.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AbsenceService {

    @Autowired
    private AbsenceRepository absenceRepository;

    public Absence saveAbsence(Absence absence) {
        return absenceRepository.save(absence);
    }

    public Optional<Absence> getAbsenceById(Long id) {
        return absenceRepository.findById(id);
    }

    public List<Absence> getAllAbsences() {
        return absenceRepository.findAll();
    }

    public void deleteAbsence(Long id) {
        absenceRepository.deleteById(id);
    }

    // Add other methods for business logic or additional CRUD operations

}
