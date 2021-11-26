package com.tom;

public class ServiceWithDependency {
    private SpecialService specialService = new SpecialService();

    public String doSomething() {
        System.out.println("");
        return specialService.callMe();
    }
}