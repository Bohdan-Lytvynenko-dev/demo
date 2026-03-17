package com.demo.jobportal.contact.service;

import com.demo.jobportal.dto.ContactRequestDto;

public interface ContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);

}