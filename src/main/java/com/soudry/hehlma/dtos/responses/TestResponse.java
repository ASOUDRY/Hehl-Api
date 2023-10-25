package com.soudry.hehlma.dtos.responses;

import java.util.List;

import com.soudry.hehlma.Models.Character;

public class TestResponse {

    private List<Character> test;

    public TestResponse(List<Character> c1) {
        this.test = c1;
    }

    public TestResponse() {

    }

    public List<Character> getTest() {
        return this.test;
    }

     public void setTest(List<Character> c1) {
        this.test = c1;
    }
    
}
