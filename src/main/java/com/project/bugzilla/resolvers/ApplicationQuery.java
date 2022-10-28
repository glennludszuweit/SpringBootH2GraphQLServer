package com.project.bugzilla.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.project.bugzilla.entity.Application;
import com.project.bugzilla.repository.ApplicationRepository;
import org.springframework.stereotype.Component;

@Component
public class ApplicationQuery implements GraphQLQueryResolver {
    private final ApplicationRepository applicationRepository;

    public ApplicationQuery(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Iterable<Application> findAllApplications() {
        return applicationRepository.findAll();
    }

    public Long countApplications() {
        return applicationRepository.count();
    }
}
