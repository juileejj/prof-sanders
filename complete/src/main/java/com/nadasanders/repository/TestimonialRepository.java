package com.nadasanders.repository;

import org.springframework.data.repository.CrudRepository;

import com.nadasanders.pojo.About;
import com.nadasanders.pojo.Testimonial;

public interface TestimonialRepository extends CrudRepository<Testimonial, Long> {

}
