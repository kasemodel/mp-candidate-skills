package com.kasemodel.test;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ServerAppApplication extends Application<ServerAppConfiguration> {

	public static void main(String[] args) throws Exception {
		new ServerAppApplication().run(args);
	}

	@Override
	public String getName() {
		return "test";
	}

	@Override
	public void initialize(Bootstrap<ServerAppConfiguration> bootstrap) {
	}

	@Override
	public void run(ServerAppConfiguration arg0, Environment arg1) throws Exception {
	}

}
