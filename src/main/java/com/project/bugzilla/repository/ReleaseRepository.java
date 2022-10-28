package com.project.bugzilla.repository;

import com.project.bugzilla.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Integer> {
}
