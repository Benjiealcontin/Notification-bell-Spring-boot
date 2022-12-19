package Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entities.Notifications;

@Repository
public interface NotiRepository extends JpaRepository<Notifications, Long>{

		@Query(value = "SELECT COUNT(*) AS totalcount FROM notifications WHERE status = ?1", nativeQuery = true)
		long count(long id);

		

}
