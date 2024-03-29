package com.example.account.po;

import java.io.Serializable;

public class SysUser implements Serializable {
    private Integer id;

    private String name;

    private String code;

    private static final long serialVersionUID = 1L;

    public SysUser(Integer id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public SysUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}