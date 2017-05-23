package com.nadasanders.service.impl;

import com.nadasanders.entity.SpeakingEntity;
import com.nadasanders.pojo.Speaking;
import com.nadasanders.repository.SpeakingRepository;
import com.nadasanders.service.SpeakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Juilee on 5/23/2017.
 */
@Service
public class SpeakingServiceImpl implements SpeakingService {

    @Autowired
    private SpeakingRepository speakingRepository;

    @Override
    public Speaking addSpeaking(SpeakingEntity toSave) {
        Speaking toPersist = new Speaking(toSave.getVideoUrl());
        toPersist = speakingRepository.save(toPersist);
        return toPersist;
    }

    @Override
    public Speaking getSpeaking(Long id) {
        Speaking fromDb = speakingRepository.findOne(id);
        if (fromDb != null) {
            return fromDb;
        }
        return null;
    }

    @Override
    public Boolean deleteSpeaking(Long id) {
        Speaking fromDb = speakingRepository.findOne(id);
        if (fromDb != null) {
            speakingRepository.delete(id);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public Iterable<Speaking> getAll() {
      Iterable<Speaking> speakingIterable= speakingRepository.findAll();
      return speakingIterable;
    }
}
