package in.SSAAPI.service;

import org.apache.catalina.connector.Response;
import org.springframework.stereotype.Service;

import in.SSAAPI.binding.SsaWebRequest;
import in.SSAAPI.binding.SsaWebResponse;


@Service
public class SsaWebServiceImpl implements SsaWebService {
	
	public SsaWebResponse getCitizenInfo (SsaWebRequest request) {
		
		//2 &3. create a response object to give response
		
		SsaWebResponse response = new SsaWebResponse(); 
		
		//1. get your ssn
		Long ssn = request.getSsn();
		//2. set response for the ssn u got 
		response.setSsn(ssn);
		
		//4. changing my ssn data type from long to string
		
		String ssnString= String.valueOf(ssn);
		
		//5. giving conditions if ssn starts with 1 which state and so on.... We can use switch loop also here
		if (ssnString.startsWith("1")) {
			response.setStateName("New Jersey");	
		}else if (ssnString.startsWith("2")) {
			response.setStateName("NewYork");	
		}else if (ssnString.startsWith("3")) {
			response.setStateName("Arkansas");	
		}else if (ssnString.startsWith("4")) {
			response.setStateName("Rhode Island");	
		}else if (ssnString.startsWith("5")) {
			response.setStateName("Texas");	
		}else if (ssnString.startsWith("6")) {
			response.setStateName("Ohio");	
		}else if (ssnString.startsWith("7")) {
			response.setStateName("Colorado");	
		}else if (ssnString.startsWith("8")) {
			response.setStateName("GA");	
		}else if (ssnString.startsWith("9")) {
			response.setStateName("Missisipi");	
		}
		
		
		return response; 
	}
	
	

}
