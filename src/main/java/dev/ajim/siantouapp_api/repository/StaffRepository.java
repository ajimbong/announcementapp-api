package dev.ajim.siantouapp_api.repository;

import dev.ajim.siantouapp_api.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
}
