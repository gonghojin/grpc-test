package com.gongdel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

	@Autowired
	private GrpcClientService grpcClientService;

	@GetMapping("/test")
	public String printMessage() {
		return grpcClientService.sendMessage("test");
	}
}