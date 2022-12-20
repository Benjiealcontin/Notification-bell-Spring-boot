package Entities;

import javax.persistence.*;

@Entity
public class Notifications {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String text;

	private String status;

	private long userid;
	
	public Notifications() {
	}



	public Notifications(long id, String text, String status, long userid) {
		super();
		this.id = id;
		this.text = text;
		this.status = status;
		this.userid = userid;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}
	

}
