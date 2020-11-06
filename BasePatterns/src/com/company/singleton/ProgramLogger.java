package com.company.singleton;

public class ProgramLogger {
    //Создадим экземпляр
    private static ProgramLogger programLogger;
    //Сюда будем записывать действия программы
    private static String logFile = "This is log file";

    //Метод будет вовзвращать экземпляр программлоггер
    public static synchronized ProgramLogger getProgramLogger(){
        if(programLogger == null ){
            //Тогда осздаем новый экземпляр
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
    //приватный пустой конструктор
    private ProgramLogger(){

    }
    //метод, принимает хеш аргумента
    public void addLogInfo(String logInfo ){
        logFile += logInfo + "\n";
    }
    //Метод будет отобратить строку логфайл
    public void showLogFile(){
        System.out.println(logFile);
    }
}
