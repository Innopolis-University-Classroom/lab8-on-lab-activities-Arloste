package com.muwaffaq.innopolis.solid.homework;

public class Name
{
    private String name;
    private String nickname;
    
    void createNickname();
}

public interface Languages
{
    String sayHello();
}

public class Russian implements Languages
{
    @Override
    String sayHello()
    {return "Дарова";}
}


public class PersonalNeeds
{
    private List<String> hobbies;
    
    int addHobby(String hobby);
    void pray();
    void playSports();
    void getMarried();
}

public class Business
{
    private double salary;
    
    double calculateTax();
    void ownCompany();
    void becomeEmployee();
}
