package in.SSAAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.SSAAPI.binding.SsaWebRequest;
import in.SSAAPI.binding.SsaWebResponse;
import in.SSAAPI.service.SsaWebServiceImpl;

@RestController
public class SsaWebRestController {
	
	@Autowired
	private SsaWebServiceImpl service;
	
	
	@PostMapping("/ssa")
	public SsaWebResponse getCitizenInfo(@RequestBody SsaWebRequest req) {
		return service.getCitizenInfo(req);
		
	}
	
	


}
