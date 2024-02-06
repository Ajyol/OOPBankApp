import java.util.Random;

public class CDetails {
private String name;
private String address;
private int accno;
private double blc;
Random rand = new Random(); //generates a random number

public CDetails() {
	this.accno = rand.nextInt(1000); //generated a random number till 1000
}

public int getAccno() {
	return this.accno; //displays the generated digits
}

public void setName(String name) { 
	this.name = name;
}

public String getName() {
	return this.name;
}

public void setAddress(String address) { 
	this.address = address;
}

public String getAddress() {
	return this.address;
}

public void addToBlc(double deposit) { 
	this.blc = deposit + blc;
}

public double getblc() {
	return this.blc;
}
}
