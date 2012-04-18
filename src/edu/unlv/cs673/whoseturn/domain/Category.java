package edu.unlv.cs673.whoseturn.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Category implements Serializable {
//	CategoryID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
//	CategoryName VARCHAR(100),
//	StrategyId int,
//	TimeBoundaryInHours int,
//	Deleted int
    
    /**
	 * Default serial version uid. 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	Long categoryId;
    private String categoryName;
    @OneToOne
    private Strategy strategy;
	private int timeBoundaryInHours;
    private Boolean deleted;
    
    
    public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public int getTimeBoundaryInHours() {
		return timeBoundaryInHours;
	}
	public void setTimeBoundaryInHours(int timeBoundaryInHours) {
		this.timeBoundaryInHours = timeBoundaryInHours;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
}
