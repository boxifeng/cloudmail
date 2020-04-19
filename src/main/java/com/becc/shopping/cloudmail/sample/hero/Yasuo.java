package com.becc.shopping.cloudmail.sample.hero;

import org.springframework.stereotype.Component;

@Component
public class Yasuo implements Hero {
    @Override
    public String q(){
        return "yasuo q";
    }

    @Override
    public String w() {
        return "yasuo w";
    }

    @Override
    public String e() {
        return "yasuo e";
    }

    @Override
    public String r() {
        return "yasuo r";
    }
}
