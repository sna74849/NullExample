package model;

import java.io.Serializable;
/**
 * @author http://software-engineering-lab.com/
 *
 */
public class NullExampleBean  implements Serializable {

	/**
	 * 市区町村名
	 */
	private String city;
	
	/**
	 * 被災者数
	 */
	private int number;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
