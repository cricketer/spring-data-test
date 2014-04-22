package lan.localhost.repository;

import lan.localhost.entity.EventAccountRelation;
import lan.localhost.entity.EventAccountRelationPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventAccountRelationRepository extends JpaRepository<EventAccountRelation,EventAccountRelationPk> {

}
