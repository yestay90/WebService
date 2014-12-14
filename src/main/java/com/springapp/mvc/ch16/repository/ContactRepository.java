package com.springapp.mvc.ch16.repository;

import com.springapp.mvc.ch16.domain.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ymuratov on 12/10/14.
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {

    public List<Contact> findByFirstName(String firstName);

}
