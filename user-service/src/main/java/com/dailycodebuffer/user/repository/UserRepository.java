package com.dailycodebuffer.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.user.entity.Userd;

@Repository
public interface UserRepository extends JpaRepository<Userd, Long> {

	Userd findByUserId(long userId);

}
