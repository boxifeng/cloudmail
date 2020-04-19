package com.becc.shopping.cloudmail.sample.hero;

import org.springframework.stereotype.Component;

@Component
public class Diana implements Hero{
    @Override
    public String q(){
        return "diana q";
    }

    @Override
    public String w() {
        return "diana w";
    }

    @Override
    public String e() {
        return "diana e";
    }

    @Override
    public String r() {
        return "diana r";
    }
}
