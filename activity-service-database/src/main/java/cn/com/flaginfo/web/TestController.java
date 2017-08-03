package cn.com.flaginfo.web;

import cn.com.flaginfo.service.impl.DictUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenovo on 2017/7/28.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private DictUtil dictUtil;

    @RequestMapping("database")
    public Object testDataBaseChange(){


        dictUtil.initDict();


        return  null;
    }


}
