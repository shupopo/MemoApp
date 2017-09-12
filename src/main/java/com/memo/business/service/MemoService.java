package com.memo.business.service;

import java.util.List;

import com.memo.business.entity.Memo;

public interface MemoService {
	
	List<Memo> findAll();
	
	void saveAndFlush(Memo memo);

}
