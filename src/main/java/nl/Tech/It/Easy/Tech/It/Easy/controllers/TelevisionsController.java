package nl.Tech.It.Easy.Tech.It.Easy.controllers;
import nl.Tech.It.Easy.Tech.It.Easy.exceptions.RecordNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/tvs")
public class TelevisionsController {

    private List<Televisions> tvs = new ArrayList<>();

    public TelevisionsController() {
        // Add some TV data to the list
        tvs.add(new Televisions(55.5, 32, "4K Ultra HD", true, true, false, true, 5));
        tvs.add(new Televisions(45.0, 40, "1080p Full HD", true, true, false, false, 2));
        tvs.add(new Televisions(60.0, 50, "8K Ultra HD", true, true, true, true, 3));
    }

    // Get all TVs
    @GetMapping("/tv")
    public ResponseEntity<List<Televisions>> getAllTvs() {
        return ResponseEntity.ok(tvs);
    }

    // Get a TV by ID
    @GetMapping("/tv/{id}")
    public ResponseEntity<Televisions> getTvById(@PathVariable int id) {
        Televisions tv = tvs.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RecordNotFoundException("TV with ID " + id + " not found"));
        return ResponseEntity.ok(tv);
    }

    // Add a new TV (POST)
    @PostMapping("/tvs")
    public ResponseEntity<Televisions> addTv(@RequestBody Televisions tv) {
        tvs.add(tv);
        return ResponseEntity.created(null).body(tv);
    }

    // Update a TV by ID (PUT)
    @PutMapping("/tvs/{id}")
    public ResponseEntity<Televisions> updateTv(@RequestBody Televisions newTv, @PathVariable int id) {
        Televisions tvToUpdate = tvs.stream()
                .filter(tv -> tv.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RecordNotFoundException("TV with ID " + id + " not found"));

        // Update the TV details
        tvToUpdate.setHeight(newTv.getHeight());
        tvToUpdate.setWidth(newTv.getWidth());
        tvToUpdate.setSchermKwaliteit(newTv.getSchermKwaliteit());
        tvToUpdate.setWifi(newTv.isWifi());
        tvToUpdate.setSmartTv(newTv.isSmartTv());
        tvToUpdate.setVoiceControl(newTv.isVoiceControl());
        tvToUpdate.setHdr(newTv.isHdr());

        return ResponseEntity.ok(tvToUpdate);
    }

    // Delete a TV by ID (DELETE)
    @DeleteMapping("/tvs/{id}")
    public ResponseEntity<Void> deleteTv(@PathVariable int id) {
        boolean removed = tvs.removeIf(tv -> tv.getId() == id);
        if (removed) {
            return ResponseEntity.noContent().build();
        } else {
            throw new RecordNotFoundException("TV with ID " + id + " not found");
        }
    }
}
