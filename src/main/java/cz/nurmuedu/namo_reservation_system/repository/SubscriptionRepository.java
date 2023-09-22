package cz.nurmuedu.namo_reservation_system.repository;

import cz.nurmuedu.namo_reservation_system.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
