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
	
	public long findByStatus(long userid) {
		return repo.count(userid);
		
	}
	
//	public Notifications getdataByid(long userid) {
//		return repo.findByuserid(userid);
//		
//	}
	
	
	
//	//Update data
//	public Notifications getdataByid(long userid) {
//		return repo.findByid(userid);		
//	}
	
	public Integer Updatedata(Long userid) {
		return repo.findByuserid(userid);
		
	}
	
}
