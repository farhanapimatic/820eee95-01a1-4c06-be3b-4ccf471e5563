/*
 * ProductAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.www.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RetrieveASingleProductResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5677727411257875093L;
    private String id;
    private String name;
    private String description;
    private String url;
    private String image;
    private String thumbnailUrl;
    private String keywords;
    private String brand;
    private String color;
    private String itemCondition;
    private String manufacturer;
    private String model;
    private String sku;
    private String weight;
    private String width;
    private String height;
    private String depth;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
        notifyObservers(this.description);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
        notifyObservers(this.url);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("image")
    public String getImage ( ) { 
        return this.image;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("image")
    public void setImage (String value) { 
        this.image = value;
        notifyObservers(this.image);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("thumbnailUrl")
    public String getThumbnailUrl ( ) { 
        return this.thumbnailUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("thumbnailUrl")
    public void setThumbnailUrl (String value) { 
        this.thumbnailUrl = value;
        notifyObservers(this.thumbnailUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("keywords")
    public String getKeywords ( ) { 
        return this.keywords;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("keywords")
    public void setKeywords (String value) { 
        this.keywords = value;
        notifyObservers(this.keywords);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("brand")
    public String getBrand ( ) { 
        return this.brand;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("brand")
    public void setBrand (String value) { 
        this.brand = value;
        notifyObservers(this.brand);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("color")
    public String getColor ( ) { 
        return this.color;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("color")
    public void setColor (String value) { 
        this.color = value;
        notifyObservers(this.color);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("itemCondition")
    public String getItemCondition ( ) { 
        return this.itemCondition;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("itemCondition")
    public void setItemCondition (String value) { 
        this.itemCondition = value;
        notifyObservers(this.itemCondition);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("manufacturer")
    public String getManufacturer ( ) { 
        return this.manufacturer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("manufacturer")
    public void setManufacturer (String value) { 
        this.manufacturer = value;
        notifyObservers(this.manufacturer);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("model")
    public String getModel ( ) { 
        return this.model;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("model")
    public void setModel (String value) { 
        this.model = value;
        notifyObservers(this.model);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("sku")
    public String getSku ( ) { 
        return this.sku;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("sku")
    public void setSku (String value) { 
        this.sku = value;
        notifyObservers(this.sku);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("weight")
    public String getWeight ( ) { 
        return this.weight;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("weight")
    public void setWeight (String value) { 
        this.weight = value;
        notifyObservers(this.weight);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("width")
    public String getWidth ( ) { 
        return this.width;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("width")
    public void setWidth (String value) { 
        this.width = value;
        notifyObservers(this.width);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("height")
    public String getHeight ( ) { 
        return this.height;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("height")
    public void setHeight (String value) { 
        this.height = value;
        notifyObservers(this.height);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("depth")
    public String getDepth ( ) { 
        return this.depth;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("depth")
    public void setDepth (String value) { 
        this.depth = value;
        notifyObservers(this.depth);
    }
 
}
 