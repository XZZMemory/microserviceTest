package test;


import test.service.beans.ErpCustomerVo;
import test.service.beans.ResponseVo;

import java.util.HashMap;

public class MyMethodClassService {
    public void add(int a, int b) {
        int result = a + b;
        System.out.println(a + "+" + b + "=" + result);

    }


    public PageResponse<ErpCustomerVo> getErpCustomer() {
        //获取响应数据 数据源 或者你的下划线对象
        ResponseVo erpCustomer = new ResponseVo();
        //封装map
        HashMap<String,Object> hashMap=( HashMap<String,Object> )erpCustomer.getData;
        //转为json 用阿里巴巴的JSON
        String s = JSON.toJSONString(hashMap);
        //封装分页 这个你不用的话不用管
        DataVo data = JSON.parseObject(s,DataVo.class);
        //获取data数据层 items 看你获取的数据实体类这一层用的什么封装了
        String items1 = JSON.toJSONString(hashMap.get("items"));
        //转换为指定对象 驼峰映射阿里解决了
        List<ErpCustomerVo> erpCustomerVos = JSON.parseArray(items1, ErpCustomerVo.class);
        //分页返回 不用的话不写
        PageResponse<ErpCustomerVo> erpCustomerVoPage =new PageResponse<>();
        erpCustomerVoPage.setTotal(data.getCount());
        erpCustomerVoPage.setPageSize(data.getLimit());
        erpCustomerVoPage.setRecords(erpCustomerVos);

        return erpCustomerVoPage;
    }





}
