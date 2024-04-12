package dev.ajim.siantouapp_api.repository;

import dev.ajim.siantouapp_api.models.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Integer> {
}
