package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entities.Notifications;
import Repositories.NotiRepository;

@Service
public class Services {

	@Autowired
	private NotiRepository repo;
	
	public long findByStatus(long id) {
		return repo.count(id);
		
	}
	
}
