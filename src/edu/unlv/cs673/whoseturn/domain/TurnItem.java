package edu.unlv.cs673.whoseturn.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TurnItem implements Serializable {
//	TurnItemID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
//	TurnID int,
//	UserID int,
//	Selected int,
//	Vote int,
//	Deleted int
    
    /**
	 * Default serial version uid. 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	Long turnItemId;
	@OneToOne
	private Turn turn;
	@OneToOne
	private User user;
	private boolean selected;
	private int vote;
    private boolean deleted;
	
	public Long getTurnItemId() {
		return turnItemId;
	}
	public void setTurnItemId(Long turnItemId) {
		this.turnItemId = turnItemId;
	}
	public Turn getTurn() {
		return turn;
	}
	public void setTurn(Turn turn) {
		this.turn = turn;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public int getVote() {
		return vote;
	}
	public void setVote(int vote) {
		this.vote = vote;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
    
	

}
