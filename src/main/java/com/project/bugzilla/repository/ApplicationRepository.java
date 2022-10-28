package com.project.bugzilla.repository;

import com.project.bugzilla.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {
}
