package Entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String firstname;
	private String password;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "Userid")
	private Set<Notifications> notifications = new HashSet<>();

	public Users() {

	}

	public Users(long id, String firstname, String password, Set<Notifications> notifications) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.password = password;
		this.notifications = notifications;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Notifications> getNotifications() {
		return notifications;
	}

	public void setNotifications(Set<Notifications> notifications) {
		this.notifications = notifications;
	}

}
