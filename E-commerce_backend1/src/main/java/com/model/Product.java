package com.model;

import java.io.Serializable;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.validation.constraints.Min;
import javax.persistence.Transient;

//import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
@Entity
@Table(name="Product")

public class Product implements Serializable {
/**
* 
*/
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
private int price;
private int category_id;
private int supplier_id;
@ManyToOne
@JoinColumn(name = "category_id", updatable = false, insertable = false, nullable = false)
private Category category;

@ManyToOne
@JoinColumn(name = "supplier_id", nullable = false, updatable = false, insertable = false)
private Supplier supplier;
private String specification;
private String Highlights;



public String getSpecification() {
	return specification;
}

public void setSpecification(String specification) {
	this.specification = specification;
}

public String getHighlights() {
	return Highlights;
}

public void setHighlights(String highlights) {
	Highlights = highlights;
}





public Category getCategory() {
return category;
}

public void setCategory(Category category) {
this.category = category;
}

public Supplier getSupplier() {
return supplier;
}

public void setSupplier(Supplier supplier) {
this.supplier = supplier;
}

//Will not persist in database
@Transient
private MultipartFile image;

public MultipartFile getImage() {
return image;
}

public void setImage(MultipartFile image) {
this.image = image;
}

public int getId() {
return id;
}

public void setId(int id) {
System.out.println("id vaues is" +id);
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}


public int getPrice() {
return price;
}

public void setPrice(int price) {
this.price = price;
}

public int getCategory_id() {
return category_id;
}

public void setCategory_id(int category_id) {
this.category_id = category_id;
}

public int getSupplier_id() {
return supplier_id;
}

public void setSupplier_id(int supplier_id) {
this.supplier_id = supplier_id;
}
}