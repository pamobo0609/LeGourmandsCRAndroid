package com.lesgourmandscr.restaurant.data;

import com.lesgourmandscr.restaurant.enums.RestaurantType;

import java.util.ArrayList;

/**
 * Created by pamobo0609 on 6/12/16.
 */
public class Restaurant {
    private String name;
    private String address;
    private ArrayList<String> telephones;
    private long lattitude;
    private long longitude;
    private ArrayList<byte[]> photos;
    private ArrayList<RestaurantType> restaurantType;

    public Restaurant() {

    }

    public Restaurant(String name, String address, ArrayList<String> telephones, long lattitude,
                      long longitude, ArrayList<byte[]> photos, ArrayList<RestaurantType> restaurantType) {
        this.name = name;
        this.address = address;
        this.telephones = telephones;
        this.lattitude = lattitude;
        this.longitude = longitude;
        this.photos = photos;
        this.restaurantType = restaurantType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getTelephones() {
        return telephones;
    }

    public void setTelephones(ArrayList<String> telephones) {
        this.telephones = telephones;
    }

    public long getLattitude() {
        return lattitude;
    }

    public void setLattitude(long lattitude) {
        this.lattitude = lattitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public ArrayList<byte[]> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<byte[]> photos) {
        this.photos = photos;
    }

    public ArrayList<RestaurantType> getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(ArrayList<RestaurantType> restaurantType) {
        this.restaurantType = restaurantType;
    }
}
