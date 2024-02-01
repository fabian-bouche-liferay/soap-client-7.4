package com.liferay.samples.fbo.calculator.soap.client;

import java.net.URL;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

import javax.xml.ws.spi.Provider;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.spi.ProviderImpl;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

@Component(
		immediate = true,
		service = CalculatorFactory.class
		)
public class CalculatorFactory {

    private Calculator calculatorService;
    private URL wsdlURL;

	@Activate
	@Modified
	public void activate(BundleContext bundleContext, Map<String, Object> properties) {

		ServiceReference<Provider> providerServiceReference = bundleContext.getServiceReference(Provider.class);
		if(providerServiceReference == null) {

			ProviderImpl providerImpl = new ProviderImpl();
			
			Dictionary<String, Object> providerProperties = new Hashtable<>();
			
			bundleContext.registerService(Provider.class, providerImpl, providerProperties);
		}
		
		this.wsdlURL = getClass().getClassLoader().getResource("calculator.wsdl");
	    this.calculatorService = new Calculator(wsdlURL);
	}
	
	public CalculatorSoap getPort() {
		
		CalculatorSoap port = calculatorService.getCalculatorSoap12();
		
		Client cxfClient = (Client) port;
		
		return port;
	}
	
}
