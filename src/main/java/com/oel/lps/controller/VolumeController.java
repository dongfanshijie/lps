package com.oel.lps.controller;

import com.oel.lps.bean.Volume;
import com.oel.lps.service.VolumeServiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: lps
 * @description: VolumeController
 * @author: ws
 * @create: 2019-12-02 09:54
 **/
@Controller
public class VolumeController {

    @Autowired
    private VolumeServiser volumeServiser;



    /**
     * @Author ws
     * @Description //TODO
     * @Date  2019/12/2
     * @Param [id] 题目id
    * @return java.util.List<com.oel.lps.bean.Volume>
     *   查询题目内容
    **/

}
