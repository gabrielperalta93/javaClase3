package com.company.Ejercicio1;

public class PasswordSimple extends Password{
    /*
        (?=.*[0-9]) a digit must occur at least once
        (?=.*[a-z]) a lower case letter must occur at least once
        (?=.*[A-Z]) an upper case letter must occur at least once
        (?=.*[@#$%^&+=]) a special character must occur at least once
        (?=\\S+$) no whitespace allowed in the entire string
        .{8,} at least 8 characters
    */
    public PasswordSimple(){
        super("(?=.*[a-z])(?=\\S+$).{8,}");
    }
}
