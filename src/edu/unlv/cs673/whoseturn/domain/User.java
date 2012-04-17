package edu.unlv.cs673.whoseturn.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.google.appengine.api.datastore.Blob;

@Entity
public class User {
//	UserID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
//	UserName VARCHAR(100),
//	UserEmail VARCHAR(100),
//	UserDescription VARCHAR(255),
//	Admin int,
//	AvatarBlob mediumBlob,
//	LieCount int,
//	Deleted int
	
	@Id
	Long userId;
    private String userName;
    private String userEmail;
    private String userDescription;
    private Boolean admin;
    private Blob blob;
    private int lieCount;
    private Boolean deleted;
    
    
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserDescription() {
		return userDescription;
	}
	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	public Blob getBlob() {
		return blob;
	}
	public void setBlob(Blob blob) {
		this.blob = blob;
	}
	public int getLieCount() {
		return lieCount;
	}
	public void setLieCount(int lieCount) {
		this.lieCount = lieCount;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
}
