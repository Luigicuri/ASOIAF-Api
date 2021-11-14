package com.asoiaf.asoiafApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asoiaf.asoiafApi.Controller.Character_;
@Repository
public interface CharacterRepository extends JpaRepository<Character_, Long> {

}
