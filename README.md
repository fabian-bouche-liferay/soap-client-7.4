# Sample SOAP Client
This is a sample Liferay workspace which includes a soap client

## Workspace pre-requisites

This workspace uses a more recent version of the gradle wrapper than the one which is usually included in a Liferay workspace:

https://github.com/fabian-bouche-liferay/soap-client-7.4/blob/master/gradle/wrapper/gradle-wrapper.properties#L3

There might be an impact with your existing modules. Please check those blogs for some guidance:
 - https://liferay.dev/blogs/-/blogs/gradle-7-is-here
 - https://liferay.dev/blogs/-/blogs/gradle-7-liferay-and-version-catalogs

Please also pay attention to this: https://github.com/fabian-bouche-liferay/soap-client-7.4/blob/master/settings.gradle#L4

The default blade workspace is initially created with a very old version of the plugin.

You'll have to update this as well.

## Code generation

The SOAP Client code is generated by this plugin:

https://github.com/fabian-bouche-liferay/soap-client-7.4/blob/master/modules/soap-client/build.gradle#L2

The Apache CXF only provides the maven plugin and there's no official Gradle plugin, hence the usage of this community plugin instead.

https://github.com/bjornvester/wsdl2java-gradle-plugin

I've configured the generated code to be put there:

https://github.com/fabian-bouche-liferay/soap-client-7.4/tree/master/modules/soap-client/src/generated/wsdl2java/com/dataaccess/webservicesserver

I could have chosen to put a .gitignore file as all those classes are automatically regenerated from the wsdl I've included under src/main/resources.

## JDK 11

This code runs on JDK 11.

One important change between JDK 8 and JDK 11 is that JAXB and JAXWS are no longer part of the JDK.

If you have some old Liferay project, it might rely on the Sun implementation of javax.xml.ws.spi.Provider which is no longer provided in the JDK > 8.

My strategy to workaround is to use the CXF implementation included in the Liferay DXP project.

The critical parts are:
 - https://github.com/fabian-bouche-liferay/soap-client-7.4/blob/master/modules/soap-client/src/main/java/com/liferay/samples/fbo/soap/client/NumberConversionFactory.java#L41
 - https://github.com/fabian-bouche-liferay/soap-client-7.4/blob/master/modules/cxf-provider-fragment/bnd.bnd#L4
