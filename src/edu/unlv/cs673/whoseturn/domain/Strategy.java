package edu.unlv.cs673.whoseturn.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.appengine.api.datastore.Blob;

@Entity
public class Strategy implements Serializable {
//	StrategyID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
//	StrategyName VARCHAR(100),
//	Deleted int
	
	@Id
	Long strategyId;
    private String strategyName;
    private Boolean deleted;
	public Long getStrategyId() {
		return strategyId;
	}
	public void setStrategyId(Long strategyId) {
		this.strategyId = strategyId;
	}
	public String getStrategyName() {
		return strategyName;
	}
	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
}
