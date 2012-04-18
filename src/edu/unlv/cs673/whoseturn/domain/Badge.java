package edu.unlv.cs673.whoseturn.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Badge implements Serializable {
//	BadgeID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
//	BadgeName VARCHAR(100),
//	BadgeDescription VARCHAR(255),
//	BadgeCriteria VARCHAR(255),
//	Deleted int
    
    /**
	 * Default serial version uid. 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	Long badgeId;
    private String badgeName;
    private String badgeDescription;
    private String badgeCriteria;
    private boolean deleted;
    
	public Long getBadgeId() {
		return badgeId;
	}
	public void setBadgeId(Long badgeId) {
		this.badgeId = badgeId;
	}
	public String getBadgeName() {
		return badgeName;
	}
	public void setBadgeName(String badgeName) {
		this.badgeName = badgeName;
	}
	public String getBadgeDescription() {
		return badgeDescription;
	}
	public void setBadgeDescription(String badgeDescription) {
		this.badgeDescription = badgeDescription;
	}
	public String getBadgeCriteria() {
		return badgeCriteria;
	}
	public void setBadgeCriteria(String badgeCriteria) {
		this.badgeCriteria = badgeCriteria;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	
}
