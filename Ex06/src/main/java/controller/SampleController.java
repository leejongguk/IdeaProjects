package controller;


import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.extern.log4j.Log4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j
@RequestMapping("/sample/*")
@Controller
public class SampleController {


    @GetMapping("/all")
    public void doAll() {

    }

    @GetMapping("/member")
    public void doMember() {

    }

    @GetMapping("/admin")
    public void doAdmin() {

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
    @GetMapping("/annoMember")
    public void doMember2(){
        log.info("logined annotation member");
    }

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/annoAdmin")
    public void doAdmin2(){
        log.info("admin annotation only");
    }

}
