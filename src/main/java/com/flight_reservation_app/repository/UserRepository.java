package com.flight_reservation_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
