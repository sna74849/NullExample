package model;

import java.io.Serializable;
/**
 * @author http://software-engineering-lab.com/
 *
 */
public class NullExampleBean  implements Serializable {

	/**
	 * �s�撬����
	 */
	private String city;
	
	/**
	 * ��ЎҐ�
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
