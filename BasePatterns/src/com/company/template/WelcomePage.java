package com.company.template;

//Он будет выводить фразу Велком
public class WelcomePage extends WebsiteTemplate {
    @Override
    public  void showPageContent(){
        System.out.println("Welcome");
    }

}
