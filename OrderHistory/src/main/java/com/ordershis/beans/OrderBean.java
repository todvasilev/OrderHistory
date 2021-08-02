package main.java.com.ordershis.beans;

public class OrderBean {
	
	private String order;
	private String customer;
	private String startTime;
	private String endTime;
	
	public String getOrder() {
		return this.order;
	}
	
	public void setOrder(String order) {
		this.order = order;
	}
	
	public String getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getStartTime() {
		return this.startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getEndTime() {
		return this.endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
