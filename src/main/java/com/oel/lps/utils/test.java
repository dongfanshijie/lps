package com.oel.lps.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: lps
 * @description: test
 * @author: ws
 * @create: 2019-11-21 13:33
 **/
public class test {


        /**
         * 生成规则设备编号:设备类型+五位编号（从1开始，不够前补0）
         *
         * @param equipmentType
         *              设备类型
         * @param equipmentNo
         *              最新设备编号
         * @return
         */
        public static String getNewEquipmentNo(String equipmentType, String equipmentNo){
            String newEquipmentNo = "00001";

            if(equipmentNo != null && !equipmentNo.isEmpty()){
                int newEquipment = Integer.parseInt(equipmentNo) + 1;
                newEquipmentNo = String.format(equipmentType + "%05d", newEquipment);
            }

            return newEquipmentNo;
        }

        public static void main(String[] args) {
            String equipmentNo = test.getNewEquipmentNo("SYXH", "00032");
            SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            String time = format0.format(date.getTime());
            System.out.println("生成设备编号：" + equipmentNo);
            System.out.println("时间：" + time);
        }



    }


