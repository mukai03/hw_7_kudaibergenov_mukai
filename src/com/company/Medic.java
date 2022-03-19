package com.company;

public class Medic extends Hero{
    @Override
    public String applySuperAbility() {
        return "Медик применил суперспособность CRITICAL DAMAGE";
    }
    int healPoints;
    double point = 0.1;
    public void increaseExperience(){
        System.out.println(healPoints * point);
    }
}
