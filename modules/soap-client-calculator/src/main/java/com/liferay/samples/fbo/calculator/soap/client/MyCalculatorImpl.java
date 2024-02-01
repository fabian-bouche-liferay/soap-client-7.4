package com.liferay.samples.fbo.calculator.soap.client;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"osgi.command.function=add",
				"osgi.command.scope=soapcalc"
		},		
		service = MyCalculator.class
		)
public class MyCalculatorImpl implements MyCalculator {

	public int add(int intA, int intB) {
		return _calculatorFactory.getPort().add(intA, intB);
	}

	@Reference
	private CalculatorFactory _calculatorFactory;
	
}
