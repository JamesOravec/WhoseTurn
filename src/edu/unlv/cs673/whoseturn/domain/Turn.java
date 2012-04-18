package edu.unlv.cs673.whoseturn.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Turn implements Serializable {
//	TurnID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
//	TurnDateAndTime DateTime,
//	CategoryId int,
//	InitiatedId int,
//	Deleted int
    
    /**
	 * Default serial version uid. 
	 */
	private static final long serialVersionUID = 1L;
	
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
