package com.chat.api.controller;

import com.chat.api.domain.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ChatController {

    @PostMapping(value = "/messages")
    public ResponseEntity<?> postMessage(@RequestBody Message message) {

        return ResponseEntity.ok().build();
    }

}
