package com.cts.eezee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;
import com.cts.eezee.service.TransportService;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		TransportService ts = context.getBean("transportService", TransportService.class);
		Booking book = context.getBean("booking", Booking.class);
		Vehicle v=context.getBean("vehicle",Vehicle.class);
		
		//Sample Input 1
		book.setCustomername("Antony Prakash");
		book.setDestination("Delhi");
		book.setMobileNumber(9845623456L);
		book.setDateOfJourney("27-04-2020");
		ts.registerBooking(book);
		
		//ts.calculateTravelCost(v.getSource(), book.getDestination(), book.getDateOfJourney());
		ts.calculateTravelCost("Chennai", "Pune", "26-07-2001");
		System.out.println(ts.checkAvailableDateForTravel("25-06-2001"));
		System.out.println("The total cost is " + ts.getCost("Delhi"));
		
	}
}
