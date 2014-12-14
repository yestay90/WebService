package com.springapp.mvc.ch16.service;

import com.springapp.mvc.ch16.domain.Contact;

import java.util.List;

/**
 * Created by ymuratov on 12/10/14.
 */
public interface ContactService {

    public List<Contact> findAll();

    public List<Contact> findByLastName();

    public Contact saveContact(Contact contacts);

    public void deleteContact(Contact contact);

    public  Contact findById(Long id);

    public List<Contact> findByFirstName(String firstName);

}
