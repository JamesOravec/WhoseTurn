package edu.unlv.cs673.whoseturn.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.google.appengine.api.datastore.Blob;

@Entity
public class Turn {
//	TurnID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
//	TurnDateAndTime DateTime,
//	CategoryId int,
//	InitiatedId int,
//	Deleted int
	
	@Id
	Long turnId;
    private Date turnDateAndTime;
    @OneToOne
    private Category category;
    @OneToOne
    private User initiatedBy;
    private Boolean deleted;
    
	public Long getTurnId() {
		return turnId;
	}
	public void setTurnId(Long turnId) {
		this.turnId = turnId;
	}
	public Date getTurnDateAndTime() {
		return turnDateAndTime;
	}
	public void setTurnDateAndTime(Date turnDateAndTime) {
		this.turnDateAndTime = turnDateAndTime;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public User getInitiatedBy() {
		return initiatedBy;
	}
	public void setInitiatedBy(User initiatedBy) {
		this.initiatedBy = initiatedBy;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
    
	

}
