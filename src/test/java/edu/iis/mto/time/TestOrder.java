package edu.iis.mto.time;

import edu.iis.mto.sourcetime.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOrder {
	private Order order;
	

	@Test
	public void test_OrderWithSystemTimeSource() {
		order = new Order(new SystemTimeSource());
		order.submit();
		order.confirm();
	}

}
