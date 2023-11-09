package com.app.core;

import java.time.LocalDate;

public class Pens {
	private static int id;
	private String brand;
	private Color color;
	private InkColor icol;
	private Material mat;
	private static int stock;
	private LocalDate udate;
	private LocalDate ldate;
	private Double price;
	private Double disc;

	public Double getDisc() {
		return disc;
	}

	public void setDisc(Double disc) {
		this.disc = disc;
	}

	public Pens(String brand, Color color, InkColor icol, Material mat, LocalDate ldate, Double price) {
		super();
		Pens.id = id++;
		this.brand = brand;
		this.color = color;
		this.icol = icol;
		this.mat = mat;
		Pens.stock = stock++;
		this.udate = udate;
		this.ldate = ldate;
		this.price = price;
		this.disc = disc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getLdate() {
		return ldate;
	}

	public static int getStock() {
		return stock;
	}

	@Override
	public String toString() {
		return "Pens [brand=" + brand + ", color=" + color + ", icol=" + icol + ", mat=" + mat + ", stock=" + stock
				+ ", udate=" + udate + ", ldate=" + ldate + ", price=" + price + ", disc=" + disc + "]";
	}

	public static int getId() {
		return id;
	}

	public void setUdate(LocalDate now) {
		this.udate = LocalDate.now();
	}

}
