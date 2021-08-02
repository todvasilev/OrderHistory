package test.java.com.ordershis;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import main.java.com.ordershis.DataResourceReader;
import main.java.com.ordershis.beans.OrderBean;

public class DataResourceReaderTest {

	@Test
	public void testReadData() {
			DataResourceReader drr = new DataResourceReader();
			List<OrderBean> lstOrders = new LinkedList<OrderBean>();
			//lstOrders = drr.readData();
			
  		    OrderBean order = new OrderBean();
			order.setOrder("pizza");
			order.setCustomer("Pesho");
			order.setStartTime("10:00:00");
			order.setEndTime("11:00:00");
			lstOrders.add(order);
			
			assertNotNull(lstOrders);
	}

}
