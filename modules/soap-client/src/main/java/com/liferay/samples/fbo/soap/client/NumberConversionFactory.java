package com.liferay.samples.fbo.soap.client;

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

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

@Component(
		immediate = true,
		service = NumberConversionFactory.class
		)
public class NumberConversionFactory {

    private NumberConversion numberConversionService;
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
		
		this.wsdlURL = getClass().getClassLoader().getResource("NumberConversion.wsdl");
	    this.numberConversionService = new NumberConversion(wsdlURL);
	}
	
	public NumberConversionSoapType getPort() {
		
		NumberConversionSoapType port = numberConversionService.getNumberConversionSoap12();
		
		Client cxfClient = (Client) port;
		
		return port;
	}
	
}
