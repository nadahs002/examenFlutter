package org.isetn.RestControllers;

import org.isetn.AbsenceService;
import org.isetn.entities.Absence;
import org.isetn.entities.Classe;
import org.isetn.repository.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/absences")
public class AbsenceController {

    @Autowired
    private AbsenceService absenceService;
    @Autowired
    private AbsenceRepository absenceRepository;



    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public Absence add(@RequestBody Absence absence) {

        return absenceRepository.save(absence);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Absence> getAbsenceById(@PathVariable Long id) {
        Optional<Absence> absence = absenceService.getAbsenceById(id);
        return absence.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/all")
    public List<Absence> getAllAbsences() {
        return absenceRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAbsence(@PathVariable Long id) {
        absenceService.deleteAbsence(id);
        return new ResponseEntity<>("Absence deleted successfully", HttpStatus.OK);
    }

    // Add other endpoints for CRUD operations
}
