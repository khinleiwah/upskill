package com.in28minutes.microservices.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class ApiGatewayConfiguration {
//	
//	@Bean
//	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(p -> p
//						.path("/get")
//						.filters(f -> f
//								.addRequestHeader("MyHeader", "MyURI")
//								.addRequestParameter("Param", "MyValue"))
//						.uri("http://httpbin.org:80"))
//				.route(p -> p.path("/cateogry/**")
//						.uri("lb://cateogry"))
//				.route(p -> p.path("/product/**")
//						.uri("lb://product"))
//				.route(p -> p.path("/product-feign/**")
//						.uri("lb://product"))
//				.route(p -> p.path("/product-new/**")
//						.filters(f -> f.rewritePath(
//								"/product-new/(?<segment>.*)", 
//								"/product-feign/${segment}"))
//						.uri("lb://product"))
//				.build();
//	}
//
//}
