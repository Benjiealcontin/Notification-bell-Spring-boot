package Repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entities.Notifications;

@Repository
public interface NotiRepository extends JpaRepository<Notifications, Long>{

		Notifications findByid(long id);
	

		
		//Count Notifications
		@Query(value = "SELECT COUNT(status) AS totalcount FROM notifications WHERE userid = ?1 AND status = 1", nativeQuery = true)
		long count(long userid);

		//Show notifications
		@Query(value = "SELECT * FROM notifications WHERE userid = ?1 ORDER BY id DESC", nativeQuery = true)
		List<Notifications> counts(long userid);

		@Modifying
		@Transactional
		@Query(value = "UPDATE notifications SET status='0' WHERE userid = :userid", nativeQuery = true)
		Integer findByuserid(long userid);

		
		
		
}
