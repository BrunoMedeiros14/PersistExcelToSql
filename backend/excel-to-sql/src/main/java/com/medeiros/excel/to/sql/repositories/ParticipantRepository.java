package com.medeiros.excel.to.sql.repositories;

import com.medeiros.excel.to.sql.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
