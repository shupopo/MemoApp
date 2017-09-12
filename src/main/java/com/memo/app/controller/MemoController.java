package com.memo.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.memo.business.entity.Memo;
import com.memo.business.service.MemoService;

@Controller
public class MemoController {
  @Autowired
  MemoService memoService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(Model model) {
    model.addAttribute("memos", memoService.findAll());
    return "index";
  }
  
  @RequestMapping(value = "/memos", method = RequestMethod.POST)
  public String create(@ModelAttribute("memo") Memo memo) {
    memoService.saveAndFlush(memo);
    return "redirect:/";
  }
}