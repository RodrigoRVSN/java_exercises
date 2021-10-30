package com.company;

public class Provider {
    private String providerName;
    private String providerCNPJ;

    public Provider(){}

    public Provider(String providerName, String providerCNPJ) {
        this.providerName = providerName;
        this.providerCNPJ = providerCNPJ;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderCNPJ() {
        return providerCNPJ;
    }

    public void setProviderCNPJ(String providerCNPJ) {
        this.providerCNPJ = providerCNPJ;
    }

    public void print(){
        System.out.println("-------------------------------------------------");
        System.out.println("Nome: " + getProviderName());
        System.out.println("E-mail: " + getProviderCNPJ());
    }
}
