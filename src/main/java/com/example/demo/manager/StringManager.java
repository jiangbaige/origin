package com.example.demo.manager;

import org.springframework.stereotype.Component;

@Component
public class StringManager {

    public String formatStr(String sourceStr) {
        return sourceStr.replace("", "");
    }

}
