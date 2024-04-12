package dev.ajim.siantouapp_api.repository;

import dev.ajim.siantouapp_api.models.StudentSubscription;
import dev.ajim.siantouapp_api.models.composite_keys.StudentSubscriptionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentSubscriptionRepository extends JpaRepository<StudentSubscription, StudentSubscriptionKey> {
}
