package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class SignInSignUpController {
	@GetMapping("/dangnhap")
	public String dangNhap() {
		return "signin";
	}

	@GetMapping("/dangky")
	public String dangKy() {
		return "dangky";
	}
	
	@PostMapping("/dangky")
	public String xuLyDangKy(@RequestParam String tenNhanVien, @RequestParam int tuoi) {
		return "redirect:/";
	}
}
