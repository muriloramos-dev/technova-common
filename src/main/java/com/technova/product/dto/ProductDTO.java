package com.technova.product.dto;

public class ProductDTO {
    private String id;

    private String name;

    private String description;

    private String category;

    private String imageURL;

    private Double price;

    private String vendorId;

    private String companyName;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ProductDTO(String id, String name, String description, String category, String imageURL, Double price, String vendorId, String companyName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.imageURL = imageURL;
        this.price = price;
        this.vendorId = vendorId;
        this.companyName = companyName;
    }

    public ProductDTO() {
    }
}
