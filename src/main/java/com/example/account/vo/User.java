package com.example.account.vo;

import lombok.Data;

/**
 * @description: demo
 * @author: mal
 * @date: 2019/10/24
 */
@Data
public class User {

    private int id;
    private String name;
    private Balance balance;

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }


}
