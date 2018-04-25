package com.example.user.hw1;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class Suggestion {
    public String getSuggestion(int grade)
    {
        String strSug = "";
        if(grade < 0)
            strSug += "輸入錯誤";
        else if(grade >= 0 && grade <= 59)
            strSug += " = F";
        else if(grade >= 60 && grade <= 69)
            strSug += " = D";
        else if(grade >= 70 && grade <= 79)
            strSug += " = C";
        else if(grade >= 80 && grade <= 89)
            strSug += " = B";
        else if(grade >= 90 && grade <= 100)
            strSug += " = A";
        else if(grade > 100)
            strSug += "輸入錯誤";

        return strSug;
    }
}
