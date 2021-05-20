package com.gotmail.gotmailapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gotmail.gotmailapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
