package com.company;

import java.util.ArrayList;

public class Order {
    // add item
    private int id;
    private String date;
    private double totalValue;
    private String customerCPF;
    private boolean status;

    private Item item;
    private JuridicPerson jp;
    private PhysicalPerson pp;

    ArrayList<Item> listItens = new ArrayList();
    
    public Order() {}

	public Order(int id, String date, double totalValue, String customerCPF, boolean status, Item item,
			ArrayList<Item> listItens) {
		super();
		this.id = id;
		this.item = item;
		this.date = date;
		this.totalValue = totalValue;
		this.customerCPF = customerCPF;
		this.status = status;
		this.listItens = listItens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public String getCustomerCPF() {
		return customerCPF;
	}

	public void setCustomerCPF(String customerCPF) {
		this.customerCPF = customerCPF;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String printInOrders() {
		String info = "";
		info += "\nNumero: " + getCustomerCPF();
		info += "\nSaldo: " + getId();
		return info;
	}


    

}
