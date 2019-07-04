package com.nuc.calvin.ssm.web;

import com.nuc.calvin.ssm.entity.BannerCustom;
import com.nuc.calvin.ssm.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Controller("bannerController")
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @ResponseBody
    @RequestMapping("/queryAllBanner")
    public List<BannerCustom> queryAllBanner() {
        List<BannerCustom> list = bannerService.queryAllBanner();
        return list;
    }
}
