// Example code from: http://www.fishbonecloud.com/2010/11/use-objectify-to-store-data-in-google.html
package edu.unlv.cs673.whoseturn.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal implements Serializable {
    
    /**
	 * Default serial version uid. 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
    Long id;
    private String species;
    private String color;

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
}