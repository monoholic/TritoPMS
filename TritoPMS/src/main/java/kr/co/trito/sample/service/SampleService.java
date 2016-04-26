package kr.co.trito.sample.service;

import java.util.List;
import java.util.Map;

public interface SampleService {
	
	List<Map<String,Object>> selectMenuList(Map<String,Object> map) throws Exception;
	
}
