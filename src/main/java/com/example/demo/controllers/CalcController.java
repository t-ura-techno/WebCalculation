package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.CalcService;

@Controller
public class CalcController {

	@Autowired
	private CalcService service;

	// 足し算呼び出し
	@PostMapping("resAdd")
	public String resAdd
	(
		Model model,
		@RequestParam("addNumA") String numA,
		@RequestParam("addNumB") String numB
	) {

		model.addAttribute("kotae", service.calculateAdd(numA, numB));

		return "res";

	}
	
	//	引き算、掛け算、割り算を記載していきましょう。
	//	ですが、割り算はちょっと特殊なので注意しましょう！
	//	割り算の答えの出し方をよく思い出してくださいね、他の掛け算までの答え方とは別で回答パターンが複数あると思います、
	//	それを意識してコードを書いていってください。
}