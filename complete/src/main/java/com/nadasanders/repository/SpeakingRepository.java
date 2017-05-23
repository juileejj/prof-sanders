package com.nadasanders.repository;

import com.nadasanders.pojo.About;
import com.nadasanders.pojo.Speaking;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Juilee on 5/23/2017.
 */
public interface SpeakingRepository extends CrudRepository<Speaking, Long> {
}
