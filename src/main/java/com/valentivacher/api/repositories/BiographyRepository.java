package com.valentivacher.api.repositories;

import com.valentivacher.api.models.Biography;
import org.springframework.data.repository.CrudRepository;

public interface BiographyRepository extends CrudRepository<Biography, Long> {
}
