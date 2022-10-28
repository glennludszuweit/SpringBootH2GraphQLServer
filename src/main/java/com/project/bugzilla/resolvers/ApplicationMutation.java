package com.project.bugzilla.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.project.bugzilla.entity.Application;
import com.project.bugzilla.exceptions.ApplicationNotFoundException;
import com.project.bugzilla.repository.ApplicationRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ApplicationMutation implements GraphQLMutationResolver {
    private final ApplicationRepository applicationRepository;

    public ApplicationMutation(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application createApplication (String name, String description, String owner) {
        Application application = new Application(name, description, owner);
        applicationRepository.save(application);
        return application;
    }

    public void deleteApplication (Integer id) {
        applicationRepository.deleteById(id);
    }

    public Application updateApplicationOwner(String newOwner, Integer id) {
        Optional<Application> optionalApplication = applicationRepository.findById(id);
        if (optionalApplication.isPresent()) {
            Application application = optionalApplication.get();
            application.setOwner(newOwner);
            applicationRepository.save(application);
            return application;
        } else {
            throw new ApplicationNotFoundException("Application not found.", id);
        }
    }
}
