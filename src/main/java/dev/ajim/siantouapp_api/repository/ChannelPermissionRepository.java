package dev.ajim.siantouapp_api.repository;

import dev.ajim.siantouapp_api.models.ChannelPermission;
import dev.ajim.siantouapp_api.models.composite_keys.ChannelPermissionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelPermissionRepository extends JpaRepository<ChannelPermission, ChannelPermissionKey> {
}
