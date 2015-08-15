package com.redhat.poc.colpensiones;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.*;

public class TestRoute extends CamelSpringTestSupport {

	@Override
	protected AbstractApplicationContext createApplicationContext() {

		return new ClassPathXmlApplicationContext("META-INF/camelContext.xml");
	}

	@Test
	public void testing() throws Exception {
		// Este test despliega el contexto de Camely espera 100000 ms antes de
		// bajar el servicio
		Thread.sleep(100000);
	}
}
