package com.springapp.mvc.ch16.service.jpa;

import com.google.common.collect.Lists;
import com.springapp.mvc.ch16.domain.Contact;
import com.springapp.mvc.ch16.repository.ContactRepository;
import com.springapp.mvc.ch16.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ymuratov on 12/10/14.
 */


@Service("contactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {


    @Autowired
    private ContactRepository contactRepository;


    @Transactional(readOnly = true)
    public List<Contact> findAll() {
        return Lists.newArrayList(contactRepository.findAll());
    }


    @Transactional(readOnly=true)
    public List<Contact> findByFirstName(String firstName) {
        return contactRepository.findByFirstName(firstName);
    }

    @Override
    public List<Contact> findByLastName() {
        return null;
    }


    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public void deleteContact(Contact contact) {
            contactRepository.delete(contact);
    }

    @Override
    public Contact findById(Long id) {
        return contactRepository.findOne(id);
    }
}
