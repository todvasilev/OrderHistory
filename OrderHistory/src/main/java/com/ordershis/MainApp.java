package main.java.com.ordershis;

import java.util.LinkedList;
import java.util.List;
import java.io.InputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.ordershis.beans.OrderBean;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
@RestController
public class MainApp {
		
  public static void main(String[] args) {
	SpringApplication.run(MainApp.class, args);
  }
  
  @RequestMapping(value = "/orders")
  public List<OrderBean> orders() {
	  DataResourceReader drr = new DataResourceReader();
	  return drr.readData();  
  }

}
