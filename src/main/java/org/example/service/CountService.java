package org.example.service;

import org.nfunk.jep.JEP;

import java.util.logging.Logger;

public class CountService implements CountInterface{
    public static final Logger logger = Logger.getLogger(CountService.class.getName());
    @Override
    public double count(String s) {
        JEP parser = new JEP();
        try{
            parser.parseExpression(s);
        } catch (Exception e){
            logger.warning(e.getMessage());
        }
        return parser.getValue();
    }
}
