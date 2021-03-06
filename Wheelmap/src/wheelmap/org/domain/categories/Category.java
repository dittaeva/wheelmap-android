/*
Copyright (C) 2011 Michal Harakal and Michael Kroez

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS-IS" BASIS
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
        
*/

package wheelmap.org.domain.categories;

import java.math.BigInteger;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class Category {

    protected BigInteger id;
    @JsonProperty( value="localized_name" )
    protected String localizedName;
    protected String identifier;
	
	/**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }
    
	/**
     * Gets the value of the localized_name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizedName() {
    	return localizedName;
    }
    
    /**
     * Sets the value of the localized_name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    
    public void setLocalizedName( String localized_name) {
    	this.localizedName = localized_name;
    }
    
    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }
    
    public String toString() {
    	return "id=" + id + ", identifier=" + identifier;
    }
}
