package com.zepto.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.bean.OrderInfo;

@RestController
public class OrderController {

	@PostMapping("/placeOrder")
	public ResponseEntity placeOrder(@RequestBody OrderInfo orderInfo) {
		
		System.out.println("order details.." +orderInfo.getItemName());
		
		
		return ResponseEntity.ok("order recived");  // response back to client
		
		
	}
	
}
