package com.nadasanders.service.impl;

import com.nadasanders.entity.AboutEntity;
import com.nadasanders.pojo.About;
import com.nadasanders.repository.AboutRepository;
import com.nadasanders.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Juilee on 5/20/17.
 */
@Service
public class AboutServiceImpl implements AboutService {
    @Autowired
    private AboutRepository aboutRepository;

    @Override
    public About addAbout(AboutEntity toSave) {
        About toPersist = new About(toSave.getTitle(), toSave.getContent());
        toPersist = aboutRepository.save(toPersist);
        return toPersist;
    }

    @Override
    public About getAbout(Long id) {
        About fromDb = aboutRepository.findOne(id);
        if (fromDb != null) {
            return fromDb;
        }
        return null;
    }

    @Override
    public Boolean deleteAbout(Long id) {
        About fromDb = aboutRepository.findOne(id);
        if (fromDb != null) {
            aboutRepository.delete(id);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
