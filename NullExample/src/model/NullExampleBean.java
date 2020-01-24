package model;

import java.io.Serializable;
/**
 * @author http://software-engineering-lab.com/
 *
 */
public class NullExampleBean  implements Serializable {

	/**
	 * s‹æ’¬‘º–¼
	 */
	private String city;
	
	/**
	 * ”íĞÒ”
	 */
	private Integer number;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
