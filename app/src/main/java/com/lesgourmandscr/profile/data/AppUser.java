package com.lesgourmandscr.profile.data;

import com.lesgourmandscr.restaurant.data.Restaurant;
import com.lesgourmandscr.profile.enums.RegisterType;

import java.util.ArrayList;

/**
 * Created by pamobo0609 on 6/12/16.
 */
public class AppUser {
    /** Class attributes */
    private String emailOrUsername;
    private RegisterType registerType;
    private ArrayList<Restaurant> favorites;
    /** Personal info, for app purposes only */
    private String firstName;
    private String lastName;

    public AppUser() {

    }

    public AppUser(String emailOrUsername, RegisterType registerType, ArrayList<Restaurant> favorites, String firstName, String lastName) {
        this.emailOrUsername = emailOrUsername;
        this.registerType = registerType;
        this.favorites = favorites;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailOrUsername() {
        return emailOrUsername;
    }

    public void setEmailOrUsername(String emailOrUsername) {
        this.emailOrUsername = emailOrUsername;
    }

    public RegisterType getRegisterType() {
        return registerType;
    }

    public void setRegisterType(RegisterType registerType) {
        this.registerType = registerType;
    }

    public ArrayList<Restaurant> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<Restaurant> favorites) {
        this.favorites = favorites;
    }
}
