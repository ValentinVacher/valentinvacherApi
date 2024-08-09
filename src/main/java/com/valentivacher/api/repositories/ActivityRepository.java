package com.valentivacher.api.repositories;

import com.valentivacher.api.models.Activity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity, Long> {
}
