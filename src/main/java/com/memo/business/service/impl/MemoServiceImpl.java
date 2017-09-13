package com.memo.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memo.business.entity.Memo;
import com.memo.business.repository.MemoRepository;
import com.memo.business.service.MemoService;

@Service
public class MemoServiceImpl implements MemoService {
	
	@Autowired
    private MemoRepository memoRepository;

	@Override
	public List<Memo> findAll() {
		// TODO Auto-generated method stub
		return memoRepository.findAll();
	}

	@Override
	public void saveAndFlush(Memo memo) {
		memoRepository.saveAndFlush(memo);
		
	}

}
