package com.javarush.task.task14.task1408;


public class MoldovanHen extends Hen implements Country {

    @Override
    int getCountOfEggsPerMonth() {
        return 36;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}