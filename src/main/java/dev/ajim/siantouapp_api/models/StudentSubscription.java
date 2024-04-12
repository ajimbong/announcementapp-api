package dev.ajim.siantouapp_api.models;

import dev.ajim.siantouapp_api.models.composite_keys.StudentSubscriptionKey;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentSubscription {
    @EmbeddedId
    private StudentSubscriptionKey id;

    private Timestamp createdAt;
}
