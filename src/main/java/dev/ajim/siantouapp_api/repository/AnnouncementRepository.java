package dev.ajim.siantouapp_api.repository;

import dev.ajim.siantouapp_api.models.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Integer>{
}
