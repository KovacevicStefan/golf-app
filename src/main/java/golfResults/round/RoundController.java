package golfResults.round;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RoundController {

    private final RoundService roundService;

    @GetMapping("/rounds")
    public ResponseEntity<List<RoundResponseDTO>> getAllRounds() {
        return new ResponseEntity<>(roundService.getAllRounds(), HttpStatus.OK);
    }

    @GetMapping("/rounds/{id}")
    public ResponseEntity<RoundResponseDTO> getRoundById(@PathVariable Long id) {
        return new ResponseEntity<>(roundService.getRoundById(id), HttpStatus.OK);
    }

}
