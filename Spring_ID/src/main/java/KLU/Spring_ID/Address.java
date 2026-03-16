package KLU.Spring_ID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("klu")
	
	String street,city;
	
     public Address() {
		
	}
	

	public String getStreet() {
		return street;
	}
    @Autowired
    @Qualifier("add2")
	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

	
}
