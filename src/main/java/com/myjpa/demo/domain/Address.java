package com.myjpa.demo.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable //내장될수 있다
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address(){
        //함부로 객체생성하지 못하도록 protected로 설정.
    }

    public Address(String city, String street, String zipcode){
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
