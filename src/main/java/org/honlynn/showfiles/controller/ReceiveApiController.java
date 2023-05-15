package org.honlynn.showfiles.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PDF")
public class ReceiveApiController {

	@RequestMapping("/showPDF")
	@ResponseBody
	public String show() {
		// 測試報表PDF可以自動顯示
		return "<center><H1>Hello Show PDF success!</H1></center>\n";
	}

	@RequestMapping("/showHello")
	@ResponseBody
	public String showHello() {
		return "<center><H1>Hello Show PDF success!</H1></center>\n";
	}
}
