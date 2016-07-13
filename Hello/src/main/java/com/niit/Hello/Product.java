package com.niit.Hello;
import org.springframework.stereotype.Component;

@Component

public class Product {
private String id;
private String name;
private String quality;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQuality() {
	return quality;
}
public void setQuality(String quality) {
	this.quality = quality;
}
}
