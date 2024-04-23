package org.example.jenkins;

import java.util.Objects;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping
    public ResponseEntity<String> checkFine(@RequestParam(required = false) String word){
        if(Objects.isNull(word)){
            return ResponseEntity.ok("fine thank you and you?");
        }

        return ResponseEntity.ok("this is what you give me" + word);
    }

    @GetMapping("/updated")
    public ResponseEntity<String> checkFine2(@RequestParam(required = false) String word){
        if(Objects.isNull(word)){
            return ResponseEntity.ok("updated");
        }

        return ResponseEntity.ok("this is what you give me" + word);
    }

}
