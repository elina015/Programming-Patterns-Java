package com.company.singleton;
//класс клиент
public class ProgramRunner {
    //будет записывать данные в лог
    public static void main(String[] args){
        //System.out.println(ProgramLogger.getProgramLogger().toString());

        //Запись в лог файл
        ProgramLogger.getProgramLogger().addLogInfo("First log ...");
         ProgramLogger.getProgramLogger().addLogInfo("Second log ...");
         ProgramLogger.getProgramLogger().addLogInfo("Third log ...");

         //Отобразим содержимое лог файла
         ProgramLogger.getProgramLogger().showLogFile();
    }
}
