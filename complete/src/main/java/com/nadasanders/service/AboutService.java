package com.nadasanders.service;

import com.nadasanders.entity.AboutEntity;
import com.nadasanders.pojo.About;

/**
 * Created by ajinkya on 5/20/17.
 */
public interface AboutService {
    /**
     * Adds about to the database
     *
     * @param toSave is aboutEntity
     * @return the about pojo saved in database
     */
    About addAbout(AboutEntity toSave);

    /**
     * Get About pojo from db
     *
     * @param id to locate in db
     * @return the about pojo saved in database
     */
    About getAbout(Long id);

    /**
     * Delete about from db
     *
     * @param id to locate in db
     * @return true if deleted
     */
    Boolean deleteAbout(Long id);
}
