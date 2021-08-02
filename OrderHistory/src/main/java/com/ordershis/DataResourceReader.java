package main.java.com.ordershis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import main.java.com.ordershis.beans.OrderBean;

public class DataResourceReader {
	
	public List<OrderBean> readData() {
		
		try {
			Resource resource = new ClassPathResource("classpath:data.txt");
			InputStream inputStream = resource.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			String strLine = null;
			List<OrderBean> lstOrders = new LinkedList<OrderBean>();
			
			while ((strLine = reader.readLine()) != null) {
				String[] fourStr = strLine.split(" ");
				OrderBean ob = new OrderBean();
				ob.setOrder(fourStr[0]);
				ob.setCustomer(fourStr[1]);
				ob.setStartTime(fourStr[2]);
				ob.setEndTime(fourStr[3]);
				lstOrders.add(ob);
			}
			
			return lstOrders;
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		return null;
	}

}
