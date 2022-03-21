package com.muwaffaq.innopolis.solid.homework;


import java.util.List;

// lab work
// This Class violates all SOLID Principles, fix it in a Logical way
public class Human implements Language
{
    private Name name;
    private PersonalNeeds pNeeds;
    private Business business;

    String sayHello() {
        return Languages.sayHello();
    }
    
    @Override
    int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }

    @Override
    void creatNickName(String postFix) {
        nickname = name.concat(postFix);
    }
    
    @Override
    void calculateTax(int percentage) {
        salary = salary * percentage;
    }
    
    @Override
    public void pray() {
    }

    @Override
    public void playSports() {
    }

    @Override
    public void getMarried() {
    }

    @Override
    public void ownCompany() {
    }

    @Override
    public void becomeEmployee() {
    }
}
