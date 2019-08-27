package com.ch.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller + ResponseBody
public class SampleController {

    @RequestMapping("/sample")
//	@ResponseBody // spring 4 버전 이상에서 RestController 사용하면서 생략가능
    public SampleVo sample() {
        SampleVo sv = new SampleVo();
        sv.setMno(23);
        sv.setFirstName("홍");
        sv.setLastName("길동");
        return sv;
    }

    @RequestMapping("/list")
//	@ResponseBody
    public List<SampleVo> list() {
        List<SampleVo> list = new ArrayList<SampleVo>();
        for (int i = 1; i <= 10; i++) {
            SampleVo sv = new SampleVo();
            sv.setMno(i);
            sv.setFirstName("홍");
            sv.setLastName("길동" + i);
            list.add(sv);
        }
        return list;
    }
}