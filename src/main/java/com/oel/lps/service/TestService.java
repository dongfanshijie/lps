package com.oel.lps.service;

import com.oel.lps.bean.TestBean;

import java.util.HashMap;
import java.util.List;

public interface TestService {
    HashMap<String, Object> querTest(TestBean testBean);
}
