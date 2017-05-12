package com.corebanking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corebanking.dao.NetBankingDAO;
import com.corebanking.domain.NetBankingBO;
import com.corebanking.dto.NetBankingDTO;

@Service
public class NetBankingServiceImpl implements NetBankingService {
	@Autowired
	private NetBankingDAO dao;

	@Override
	public String registerNetBanking(NetBankingDTO dto) {
		Long result = 0l;
		NetBankingBO bo = null;
		// convert dto to bo
		bo = new NetBankingBO();
		BeanUtils.copyProperties(dto, bo);

		// call dao
		result = dao.insertNet(bo);

		if (result > 0)

			return "You Are SuccessFully Registered For NetBanking";

		else
			return "NetBanking Registration Failed";
	}

}
