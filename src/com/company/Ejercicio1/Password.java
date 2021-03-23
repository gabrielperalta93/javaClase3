package com.company.Ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String pattern;
    public String getPattern() {
        return pattern;
    }

    public Password(String pattern){
       this.pattern = pattern;
    }

    public void setValue(String pwd) throws Exception{
            Pattern p = Pattern.compile(this.pattern);
            Matcher m = p.matcher(pwd);
            if (!m.matches()){
                throw new Exception("La contraseña no cumple las condiciones");
            }else{
                System.out.println("La contraseña SI cumple las condiciones");
            }
    }
}
