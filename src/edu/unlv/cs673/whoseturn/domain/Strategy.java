package edu.unlv.cs673.whoseturn.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Strategy implements Serializable {
//	StrategyID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
//	StrategyName VARCHAR(100),
//	Deleted int
    
    /**
	 * Default serial version uid. 
	 */
	private static final long serialVersionUID = 1L;
	
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
