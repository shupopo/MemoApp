package com.memo.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memo.business.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {

}
