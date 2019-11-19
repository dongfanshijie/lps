package com.oel.lps.mapper;

import com.oel.lps.bean.TestBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {



    List<TestBean> queryPage(TestBean testBean);
}
