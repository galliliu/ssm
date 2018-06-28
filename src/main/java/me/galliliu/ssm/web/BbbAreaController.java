package me.galliliu.ssm.web;

import me.galliliu.ssm.model.BbbArea;
import me.galliliu.ssm.service.IBbbAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 区域管理控制器
 *
 * @author galliliu
 * @createTime 2018-06-28
 */
@Controller
@RequestMapping("/bbbArea")
public class BbbAreaController {

    @Autowired
    private IBbbAreaService bbbAreaService;

    @RequestMapping("save")
    public void save(BbbArea bbbArea) {
        this.bbbAreaService.save(bbbArea);
        System.out.println("save");
    }

    @RequestMapping("selectById")
    @ResponseBody
    public BbbArea selectById(Long id) {
        BbbArea bbbArea = this.bbbAreaService.selectById(id);
        System.out.println("sss");
        System.out.println("test conflict");
        return bbbArea;
    }
}
