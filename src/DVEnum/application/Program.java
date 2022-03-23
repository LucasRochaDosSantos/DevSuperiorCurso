package DVEnum.application;

import java.util.Date;

import DVEnum.entities.Order;
import DVEnum.entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) 
	{
      Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
      System.out.println(order);
	}
}
