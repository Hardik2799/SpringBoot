package com.Project.Service;

import java.util.List;

import com.Project.Model.RegVO;

public interface RegService {

	public void reginsert(RegVO regvo);
	
	public List search();
	
	public List searchbyid(RegVO regVO);


}
