package com.upskill.api_gateway;

import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/get")
						.filters(f -> f
								.addRequestHeader("MyHeader", "MyUri")
								.addRequestParameter("MyParam", "MyValue"))
						.uri("http://httpbin.org:80"))
				
				.route(p -> p.path("/category/**")
						.uri("lb://category"))
				.route(p -> p.path("/categories/**")
						.uri("lb://category"))
				.route(p -> p.path("/products/**")
						.uri("lb://product"))
				.route(p -> p.path("/product/add")
						.filters(f -> f
								.addRequestHeader("Access-Control-Allow-Origin", "*")
								)
						.uri("lb://product"))
				.route(p -> p.path("/product/**")
						.uri("lb://product"))
				.route(p -> p.path("/register/**")
						.uri("lb://user"))
				.route(p -> p.path("/login/**")
						.uri("lb://user"))
				.route(p -> p.path("/hello/**")
						.uri("lb://user"))
				
				.build();
	}
	
}
