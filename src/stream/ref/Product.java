package stream.ref;

public class Product {
private int pno;
private String name;
private String company;
private int price;

public Product(int pno, String name, String company, int price) {
	this.pno = pno;
	this.name = name;
	this.company = company;
	this.price = price;
}

public synchronized int getPno() {
	return pno;
}
public synchronized void setPno(int pno) {
	this.pno = pno;
}
public synchronized String getName() {
	return name;
}
public synchronized void setName(String name) {
	this.name = name;
}
public synchronized String getCompany() {
	return company;
}
public synchronized void setCompany(String company) {
	this.company = company;
}
public synchronized int getPrice() {
	return price;
}
public synchronized void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return new StringBuilder()
		.append("{")
		.append("pno: " + pno + ", ")
		.append("company: " +  company + ", ")
		.append("price:"+price)
		.append("}")
		.toString();
}









}
