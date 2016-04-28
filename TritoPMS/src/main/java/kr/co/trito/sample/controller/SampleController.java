package kr.co.trito.sample.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.trito.sample.service.SampleService;

@Controller
public class SampleController {
    Logger log = Logger.getLogger(this.getClass());
     
    @Resource(name="sampleService")
    private SampleService sampleService;
     
    @RequestMapping(value="/sample/sampleMenuList.do")
    public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/sample/board");
        List<Map<String,Object>> list = sampleService.selectMenuList(commandMap);
        mv.addObject("list", list);
         
        return mv;
    }
}
