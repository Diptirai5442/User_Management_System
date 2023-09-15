package com.dipti.UsermanagementSystem.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    private Integer userId;
    private String name;


    private String userName;


    private String userContact;


    private String userAddress;

    public User(int i, String demo, String dmo, String number, String dmoDmoDmoDmoDmo) {
    }

    public Object getUserId() {
        return null;
    }

    public void setUserContact(String userContact) {
    }
}