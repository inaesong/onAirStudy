package com.kh.onairstudy.scheduler.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.onairstudy.scheduler.model.dao.SchedulerDAO;

/*@Transactional(propagation = Propagation.REQUIRED,
isolation = Isolation.READ_COMMITTED,
rollbackFor = Exception.class)*/
@Service
public class SchedulerServiceImpl implements SchedulerService {

	@Autowired
	private SchedulerDAO schedulerDAO;
	
	
}
