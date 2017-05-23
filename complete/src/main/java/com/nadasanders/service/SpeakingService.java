package com.nadasanders.service;

import com.nadasanders.entity.SpeakingEntity;
import com.nadasanders.pojo.Speaking;

/**
 * Created by Juilee on 5/23/2017.
 */
public interface SpeakingService {
    /**
     * Adds about to the database
     *
     * @param toSave is aboutEntity
     * @return the about pojo saved in database
     */
    Speaking addSpeaking(SpeakingEntity toSave);

    /**
     * Get About pojo from db
     *
     * @param id to locate in db
     * @return the about pojo saved in database
     */
    Speaking getSpeaking(Long id);

    /**
     * Delete about from db
     *
     * @param id to locate in db
     * @return true if deleted
     */
    Boolean deleteSpeaking(Long id);


    Iterable<Speaking> getAll();

}
