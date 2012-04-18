package edu.unlv.cs673.whoseturn.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BadgeAwarded implements Serializable {
//	BadgeAwardedID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
//	BadgeID int,
//	UserID int,
//	Deleted int
    
    /**
	 * Default serial version uid. 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	Long badgeAwardedId;
	@OneToOne
    private Badge badge;
	@OneToOne
	private User user;
    private boolean deleted;
    
	public Long getBadgeAwardedId() {
		return badgeAwardedId;
	}
	public void setBadgeAwardedId(Long badgeAwardedId) {
		this.badgeAwardedId = badgeAwardedId;
	}
	public Badge getBadge() {
		return badge;
	}
	public void setBadge(Badge badge) {
		this.badge = badge;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
}
