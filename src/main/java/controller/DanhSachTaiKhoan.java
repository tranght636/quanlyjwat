package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DanhSachTaiKhoan {
	@GetMapping("/danhsachtaikhoan")
	public String themthongbao() {
		return "DanhSachTaiKhoan";
	}
}
