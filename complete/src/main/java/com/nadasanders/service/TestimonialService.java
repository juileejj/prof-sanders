package com.nadasanders.service;

import com.nadasanders.entity.TestimonialEntity;
import com.nadasanders.pojo.Testimonial;

public interface TestimonialService {

	/**
     * Adds Testimonial to the database
     *
     * @param toSave is TestimonialEntity
     * @return the about pojo saved in database
     */
	Testimonial addTestimonial(TestimonialEntity toSave);

    /**
     * Get Testimonial pojo from db
     *
     * @param id to locate in db
     * @return the about pojo saved in database
     */
	Testimonial getTestimonial(Long id);

    /**
     * Delete Testimonial from db
     *
     * @param id to locate in db
     * @return true if deleted
     */
    Boolean deleteTestimonial(Long id);
    Iterable<Testimonial> getAll();
	
}
