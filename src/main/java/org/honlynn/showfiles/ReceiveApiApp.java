package org.honlynn.showfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ReceiveApiApp {

	public static void main(String[] args) {
		SpringApplication.run(ReceiveApiApp.class, args);
	}

	@RequestMapping(value = "/")
	public String name() {
		return "此功能僅用來處理及顯示檔案文件.";
	}
}
