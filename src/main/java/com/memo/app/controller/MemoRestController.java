package com.memo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.memo.business.entity.Memo;
import com.memo.business.service.MemoService;

@RestController
public class MemoRestController {
  @Autowired
  private MemoService memoService;

  @RequestMapping(value = "/memos", method = RequestMethod.POST)
  @ResponseBody
  public Memo create(@RequestBody Memo memo) {
    memoService.saveAndFlush(memo);
    return memo;
  }
}
