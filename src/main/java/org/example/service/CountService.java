package org.example.service;

import org.nfunk.jep.JEP;

public class CountService implements CountInterface{
    @Override
    public double count(String s) {
        JEP parser = new JEP();
        try{
            parser.parseExpression(s);
        } catch (Exception e){
            System.out.println("EXCEPTION HAS BEEN THROWN");
        }
        return parser.getValue();
    }
}
