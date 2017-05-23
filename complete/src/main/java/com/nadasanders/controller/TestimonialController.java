package com.nadasanders.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nadasanders.entity.TestimonialEntity;
import com.nadasanders.pojo.Testimonial;
import com.nadasanders.service.TestimonialService;

@CrossOrigin
@RestController
@RequestMapping("/testimonial")
public class TestimonialController {

    @Autowired
    private TestimonialService testimonialService;

    @PostMapping
    public Testimonial addTestimonial(@RequestBody TestimonialEntity testimonialEntity, HttpServletResponse response) throws IOException {
    	Testimonial saved = testimonialService.addTestimonial(testimonialEntity);
        if (saved != null) {
            return saved;
        } else {
            response.sendError(500, "Can not create testimonial");
            return null;
        }
    }

    @GetMapping
    public Testimonial getTestimonial(@RequestParam Long testimonialId, HttpServletResponse response) throws IOException {
    	Testimonial testimonial = testimonialService.getTestimonial(testimonialId);
        if (testimonial != null) {
            return testimonial;
        } else {
            response.sendError(404, "Can not locate testimonial record in database");
            return null;
        }
    }

    @DeleteMapping
    public Boolean deleteTestimonial(@RequestParam Long testimonialId, HttpServletResponse response) throws IOException {
        Boolean result = testimonialService.deleteTestimonial(testimonialId);
        if (result) {
            return true;
        } else {
            response.sendError(404, "Can not locate testimonial record in database");
            return false;
        }
    }
    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Testimonial> getAllTestimonials() {
        return testimonialService.getAll();
    }
}
