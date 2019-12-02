package com.oel.lps.service.impl;

import com.oel.lps.mapper.VolumeMappper;
import com.oel.lps.service.VolumeServiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: lps
 * @description: VolumeServiserImpl
 * @author: ws
 * @create: 2019-12-02 09:55
 **/
@Service
public class VolumeServiserImpl implements VolumeServiser {

    @Autowired
    private VolumeMappper volumeMappper;



}
