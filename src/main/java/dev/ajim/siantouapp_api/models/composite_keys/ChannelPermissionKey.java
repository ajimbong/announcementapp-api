package dev.ajim.siantouapp_api.models.composite_keys;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class ChannelPermissionKey implements Serializable {
    private Integer staffId;

    private Integer channelId;
}
