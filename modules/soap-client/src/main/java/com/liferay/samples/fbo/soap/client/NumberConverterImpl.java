package com.liferay.samples.fbo.soap.client;

import java.math.BigInteger;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"osgi.command.function=convert",
				"osgi.command.scope=soap"
		},		
		service = NumberConverter.class
		)
public class NumberConverterImpl implements NumberConverter {

	@Override
	public String convert(int number) {
		String text = _numberConversionFactory.getPort().numberToWords(BigInteger.valueOf(number));
		return text;
	}
	
	@Reference
	private NumberConversionFactory _numberConversionFactory;

}
