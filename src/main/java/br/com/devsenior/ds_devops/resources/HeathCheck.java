package br.com.devsenior.ds_devops.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")
public class HeathCheck {
    
    @GetMapping
    public ResponseEntity<String> health() {
        String status = "Status Ok";
        return ResponseEntity.ok(status);
    }

}
