package br.com.devsenior.ds_devops.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/health")
public class HeathCheck {
    
    @GetMapping
    public ResponseEntity<String> health() {
        log.info("Chamando Health");
        String status = "Status Ok";
        return ResponseEntity.ok(status);
    }

}
