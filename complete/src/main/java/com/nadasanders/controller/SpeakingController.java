package com.nadasanders.controller;

import com.nadasanders.entity.AboutEntity;
import com.nadasanders.entity.SpeakingEntity;
import com.nadasanders.pojo.About;
import com.nadasanders.pojo.Speaking;
import com.nadasanders.service.SpeakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Juilee on 5/23/2017.
 */
@CrossOrigin
@RestController
@RequestMapping("/speaking")
public class SpeakingController {

    @Autowired
    private SpeakingService speakingService;

    @PostMapping
    public Speaking addSpeaking(@RequestBody SpeakingEntity speakingEntity, HttpServletResponse response) throws IOException {
        Speaking saved = speakingService.addSpeaking(speakingEntity);
        if (saved != null) {
            return saved;
        } else {
            response.sendError(500, "Can not create about");
            return null;
        }
    }
    @GetMapping
    public Speaking getSpeaking(@RequestParam Long speakingId, HttpServletResponse response) throws IOException {
        Speaking speaking = speakingService.getSpeaking(speakingId);
        if (speaking != null) {
            return speaking;
        } else {
            response.sendError(404, "Can not locate record in database");
            return null;
        }
    }

    @DeleteMapping
    public Boolean deleteSpeaking(@RequestParam Long speakingId, HttpServletResponse response) throws IOException {
        Boolean result = speakingService.deleteSpeaking(speakingId);
        if (result) {
            return true;
        } else {
            response.sendError(404, "Can not locate record in database");
            return false;
        }
    }
    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Speaking> getAllSpeaking() {
        return speakingService.getAll();
    }
}
