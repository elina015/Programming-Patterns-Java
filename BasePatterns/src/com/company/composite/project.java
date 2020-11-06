package com.company.composite;

public class project {
    public static void main (String[] args){
        //cоздаем команду разработчиков для создания какого то проекта
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        //создаем методы добавления разработчиков
        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        //вызовем метод команды кот заставит разработчиков писать код
        team.createProject();


    }
}
