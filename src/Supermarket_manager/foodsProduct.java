package Supermarket_manager;

import java.util.Date;
import java.util.Scanner;

public class foodsProduct extends product {
	private int mfg_year;
	private int mfg_month;
	private int mfg_date;
	private int exp_year;
	private int exp_month;
	private int exp_date;
	private String supplier;
	int current_year;
	int current_month;
	int current_date;

//	public foodsProduct(int id, String nameProduct, int quantity_stock, double price, double vat, int mfg_year,
//			int mfg_month, int mfg_date, int exp_year, int exp_month, int exp_date, String supplier) {
//		this.ID=id;
//		this.nameProduct= nameProduct;
//		this.quantity_stock = quantity_stock;
//		this.price= price;
//		this.vat=vat;
//		this.mfg_year = mfg_year;
//		this.mfg_month = mfg_month;
//		this.mfg_date = mfg_date;
//		this.exp_year = exp_year;
//		this.exp_month = exp_month;
//		this.exp_date = exp_date;
//		this.supplier = supplier;
//	}
	
	

	public int getMfg_year() {
		return mfg_year;
	}

	public foodsProduct(int id, String nameProduct, int quantity_stock, double price, double vat,int mfg_year, int mfg_month, int mfg_date, int exp_year, int exp_month, int exp_date,
			String supplier) {
		super(id, nameProduct, quantity_stock, price, vat);
		this.mfg_year = mfg_year;
		this.mfg_month = mfg_month;
		this.mfg_date = mfg_date;
		this.exp_year = exp_year;
		this.exp_month = exp_month;
		this.exp_date = exp_date;
		this.supplier = supplier;
	}

	public void setMfg_year(int mfg_year) {
		this.mfg_year = mfg_year;
	}

	public int getMfg_month() {
		return mfg_month;
	}

	public void setMfg_month(int mfg_month) {
		this.mfg_month = mfg_month;
	}

	public int getMfg_date() {
		return mfg_date;
	}

	public void setMfg_date(int mfg_date) {
		this.mfg_date = mfg_date;
	}

	public int getExp_year() {
		return exp_year;
	}

	public void setExp_year(int exp_year) {
		this.exp_year = exp_year;
	}

	public int getExp_month() {
		return exp_month;
	}

	public void setExp_month(int exp_month) {
		this.exp_month = exp_month;
	}

	public int getExp_date() {
		return exp_date;
	}

	public void setExp_date(int exp_date) {
		this.exp_date = exp_date;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	@Override
	public void VAT() {
		// TODO Auto-generated method stub
		System.out.println("VAT c???a th???c ph???m l??:" + getPrice() * 0.05);

	}

	public void input_current() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	    System.out.print("Nh???p n??m hi???n t???i: ");
	    current_year =input.nextInt();
	    System.out.print("Nh???p th??ng hi???n t???i: ");
	    current_month =input.nextInt();
	    System.out.print("Nh???p ng??y hi???n t???i: ");
	    current_date =input.nextInt();

	}
	
	@Override
	public void Inventory_number() {
		// TODO Auto-generated method stub
//		H??ng th???c ph???m: N???u v???n c??n trong kho v?? b??? h???t h???n - ????nh gi?? l?? kh?? b??n

		if (getquantity_stock() > 0) {
			if (current_year > exp_year) {
				System.out.println("Kh?? b??n");
				return;
			}
			if (current_year == exp_year) {
				if (current_month > exp_month) {
					System.out.println("Kh?? b??n");
					return;
				}
				if (current_month == exp_month) {
					if (current_date - exp_date >= 10) {
						System.out.println("Kh?? b??n");
						return;
					}
				}
			}
			if (current_year < exp_year) {
				System.out.println("v???n c??n h???n s??? d???ng");
				return;
			}

		}
		System.out.println("Kh??ng ????nh gi??");

	}
}
