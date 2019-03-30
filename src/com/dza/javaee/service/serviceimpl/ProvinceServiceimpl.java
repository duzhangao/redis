package com.dza.javaee.service.serviceimpl;

import com.dza.javaee.dao.ProviceDao;
import com.dza.javaee.dao.daoimpl.ProviceDaoimpl;
import com.dza.javaee.domain.Province;
import com.dza.javaee.service.ProvinceService;

import java.util.List;

public class ProvinceServiceimpl implements ProvinceService {
    private ProviceDao dao=new ProviceDaoimpl();
    @Override
    public List<Province> findall() {
        return dao.findall();
    }
}
