package com.Project.Service;


import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.DAO.RegDAO;
import com.Project.Model.RegVO;

@Service
@Transactional
public class RegServiceImpl implements RegService {

	@Autowired
	RegDAO regDAO;

	@Override
	public void reginsert(RegVO regVO) {

		this.regDAO.insert(regVO);
	}
	@Override	
	public List search() {
		return this.regDAO.search();

	}

	@Override
	public List searchbyid(RegVO regVO) {
		return this.regDAO.searchbyid(regVO);
	}

}
