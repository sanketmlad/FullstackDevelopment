package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {
    public static void main(String[] args){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        /*
        Calculator calc = (Calculator) applicationContext.getBean("calc");
        System.out.println(calc.add());
        System.out.println(calc.divide());
        System.out.println(calc.multiply());
        System.out.println(calc.substract());
        */
        /*
        Point p = (Point)applicationContext.getBean("Point10");
        System.out.println(p.getX());
        System.out.println(p.getY());
        p.setX(20);
        p.setY(30);
        System.out.println(p.getX());
        System.out.println(p.getY());*/

        animal species = (animal) applicationContext.getBean("zebra1");
        //System.out.println(species.getSpeciesName());
        //System.out.println(species.getHeight());
        //System.out.println(species.getWeight());
        //System.out.println(species.getColor().getColorName());
        //System.out.println(species.getSize().getHeight());
        //System.out.println(species.getValidator());

        //BeanValidator bv = (BeanValidator) applicationContext.getBean("validatorBean");
        //System.out.println(bv);
        //System.out.println(species.getNames());
        System.out.println(species.getColor().getColorName());
    }

}
