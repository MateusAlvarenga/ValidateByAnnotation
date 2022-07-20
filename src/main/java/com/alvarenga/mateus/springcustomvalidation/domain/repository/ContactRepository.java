package com.alvarenga.mateus.springcustomvalidation.domain.repository;

import com.alvarenga.mateus.springcustomvalidation.domain.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
