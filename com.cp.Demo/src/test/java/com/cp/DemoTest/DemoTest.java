package com.cp.DemoTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.cp.Demo.Demo;

public class DemoTest {
	Demo ad = new Demo();
	@Test
	public void test() {
		assertEquals(ad.add(2, 3),5);
		}   
	}

