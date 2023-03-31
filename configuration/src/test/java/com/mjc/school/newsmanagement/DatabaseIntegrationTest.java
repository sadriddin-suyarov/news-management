package com.mjc.school.newsmanagement;

import com.mjc.school.newsmanagement.repository.AuthorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@DataJpaTest
@ContextConfiguration(classes = NewsManagementApplication.class)
public class DatabaseIntegrationTest {

    @Autowired
    private AuthorRepository repository;

    @Test
    public void integrationTest() {
        Assertions.assertEquals(1, repository.findAll().size());
    }
}
