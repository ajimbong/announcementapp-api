package dev.ajim.siantouapp_api.models;

import dev.ajim.siantouapp_api.models.composite_keys.ChannelPermissionKey;
import dev.ajim.siantouapp_api.models.enums.AccessLevel;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ChannelPermission {
    @EmbeddedId
    private ChannelPermissionKey id;

    @Enumerated(EnumType.STRING)
    private AccessLevel accessLevel;

    private Timestamp createdAt;

    private Timestamp updatedAt;
}
