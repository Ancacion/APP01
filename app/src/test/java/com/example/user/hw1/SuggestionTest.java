package com.example.user.hw1;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class SuggestionTest {

    @Test
    public void getSuggestion(){
        Suggestion gradeSuggestion = new Suggestion();
        String s = gradeSuggestion.getSuggestion(-10);
        assertEquals(s, "輸入錯誤");

    }
}
