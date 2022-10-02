package com.example.springboot01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "peopleBuyRecord")
public class PeopleBuyRecord {
    @Value("默认人员")
    private String name;
    @Value("3")
    private Integer age;
    private Boolean isBuy;
    private Date buytime;
    private Map<String, Object> maps;
    private List<Object> lists;
    private CreatePeople createPeople;

    public PeopleBuyRecord(String name, Integer age, Boolean isBuy, Date buytime, Map<String, Object> maps, List<Object> lists, CreatePeople createPeople) {
        this.name = name;
        this.age = age;
        this.isBuy = isBuy;
        this.buytime = buytime;
        this.maps = maps;
        this.lists = lists;
        this.createPeople = createPeople;
    }

    public PeopleBuyRecord() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBuy() {
        return isBuy;
    }

    public void setBuy(Boolean buy) {
        isBuy = buy;
    }

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public CreatePeople getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(CreatePeople createPeople) {
        this.createPeople = createPeople;
    }
}
