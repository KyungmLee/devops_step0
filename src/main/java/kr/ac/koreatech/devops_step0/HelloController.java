package kr.ac.koreatech.devops_step0;

import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@Slf4j
public class HelloController {
  @GetMapping("/")  
  
  public String index() {
    log.info("안녕하세요. 서버에서 실행됨");
    return "index.html";
  }
}