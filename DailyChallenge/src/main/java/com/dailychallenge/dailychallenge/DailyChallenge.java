/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.dailychallenge.dailychallenge;

/**
 *
 * @author konate-mk
 */
public class DailyChallenge {

    public static void main(String[] args) {
        Person person1 = new Person();
        
        Person person2 = new Person("Konate Mamadou", 27, 1000000);
        
        person1.DisplayInfo();
        
        person2.DisplayInfo();
        
        Person person3 = new Person("Toto Tata", 38);
        
        person3.DisplayInfo();
    }
}
