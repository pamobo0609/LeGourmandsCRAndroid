package com.legourmandscr.data;

import com.legourmandscr.enums.RegisterType;

import java.util.ArrayList;

/**
 * Created by pamobo0609 on 6/12/16.
 */
public class AppUser {
    /** Class attributes */
    private String emailOrUsername;
    private RegisterType registerType;
    private ArrayList<Restaurant> favorites;

    public AppUser() {

    }

    public AppUser(String emailOrUsername, RegisterType registerType, ArrayList<Restaurant> favorites) {
        this.emailOrUsername = emailOrUsername;
        this.registerType = registerType;
        this.favorites = favorites;
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
