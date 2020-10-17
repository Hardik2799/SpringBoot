package com.Project.DAO;

import java.util.List;

import com.Project.Model.RegVO;

public interface RegDAO {
	public void insert(RegVO regVO);
	
	public List search();
	
	public List searchbyid(RegVO regVO);
}
