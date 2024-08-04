package in.SSAAPI.service;

import in.SSAAPI.binding.SsaWebRequest;
import in.SSAAPI.binding.SsaWebResponse;

public interface SsaWebService {
	
	public SsaWebResponse getCitizenInfo(SsaWebRequest request);

}
