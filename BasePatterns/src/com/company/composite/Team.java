package com.company.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    //наша команда будем иметь коллекциюю разработчиков
    private List<Developer> developers = new ArrayList<Developer>();

    //для добавления разработчиков
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    //метод для удаления разработчика
    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }
    //главный метод создания проекта, создаем цикл и перебирая всех разработчиков вызываем метод writecode
    public void createProject(){
        System.out.println("Team creates project...\n");
        for (Developer developer: developers){
            developer.writeCode();
        }
    }
}
