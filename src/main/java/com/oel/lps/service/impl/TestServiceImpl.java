package com.oel.lps.service.impl;


import com.oel.lps.bean.TestBean;
import com.oel.lps.mapper.TestMapper;
import com.oel.lps.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;



    @Override
    public HashMap<String, Object> querTest(TestBean testBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        List<TestBean> list = testMapper.queryPage(testBean);
        hashMap.put("rows", list);//list集合
        return hashMap;
    }
}
