package com.nadasanders.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadasanders.entity.TestimonialEntity;
import com.nadasanders.pojo.Testimonial;
import com.nadasanders.repository.TestimonialRepository;
import com.nadasanders.service.TestimonialService;

@Service
public class TestimonialServiceImpl implements TestimonialService {

	 @Autowired
	    private TestimonialRepository testimonialRepository;

	    @Override
	    public Testimonial addTestimonial(TestimonialEntity toSave) {
	    	Testimonial toPersist = new Testimonial(toSave.getName(), toSave.getDesignation(), toSave.getContent(),toSave.getImageUrl());
	        toPersist = testimonialRepository.save(toPersist);
	        return toPersist;
	    }

	    @Override
	    public Testimonial getTestimonial(Long id) {
	    	Testimonial fromDb = testimonialRepository.findOne(id);
	        if (fromDb != null) {
	            return fromDb;
	        }
	        return null;
	    }

	    @Override
	    public Boolean deleteTestimonial(Long id) {
	    	Testimonial fromDb = testimonialRepository.findOne(id);
	        if (fromDb != null) {
	        	testimonialRepository.delete(id);
	            return Boolean.TRUE;
	        }
	        return Boolean.FALSE;
	    }

	@Override
	public Iterable<Testimonial> getAll() {
		return testimonialRepository.findAll();
	}
}
