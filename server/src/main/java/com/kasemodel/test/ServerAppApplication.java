package com.kasemodel.test;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;

import org.eclipse.jetty.servlets.CrossOriginFilter;

import com.hubspot.dropwizard.guice.GuiceBundle;
import com.kasemodel.test.core.injections.TestAppModule;
import com.kasemodel.test.health.AppHealthCheck;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ServerAppApplication extends Application<ServerAppConfiguration> {

	private GuiceBundle<ServerAppConfiguration> guiceBundle;

	public static void main(String[] args) throws Exception {
		new ServerAppApplication().run(args);
	}

	@Override
	public String getName() {
		return "test";
	}

	@Override
	public void initialize(Bootstrap<ServerAppConfiguration> bootstrap) {
		guiceBundle = GuiceBundle.<ServerAppConfiguration> newBuilder().addModule(new TestAppModule())
				.enableAutoConfig(getClass().getPackage().getName()).setConfigClass(ServerAppConfiguration.class)
				.build();
	}

	@Override
	public void run(ServerAppConfiguration arg0, Environment environment) throws Exception {
		// Enable CORS headers
		final FilterRegistration.Dynamic cors = environment.servlets().addFilter("CORS", CrossOriginFilter.class);

		// Configure CORS parameters
		cors.setInitParameter("allowedOrigins", "*");
		cors.setInitParameter("allowedHeaders", "X-Requested-With,Content-Type,Accept,Origin");
		cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");

		// Add URL mapping
		cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");

		environment.healthChecks().register("health", new AppHealthCheck());
	}

}
