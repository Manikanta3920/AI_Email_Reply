package com.email.email_generator.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = {"https://mail.google.com", "http://localhost:3000"})// ✅ Correct origin here
public class EmailGeneratorController {
  
    private final EmailGeneratorService emailGeneratorService;
    
    public EmailGeneratorController(EmailGeneratorService emailGeneratorService) {
        this.emailGeneratorService = emailGeneratorService;
    }
     
    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailrequest) {
        System.out.println("Received request: " + emailrequest.getEmailContent() + " | Tone: " + emailrequest.getTone());
        String response = emailGeneratorService.generateEmailReply(emailrequest);
        return ResponseEntity.ok(response);
    }
}
