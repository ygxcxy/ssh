package com.qiudaozhang.service.impl;

import com.qiudaozhang.dao.CityDao;
import com.qiudaozhang.model.City;
import com.qiudaozhang.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 深圳邱道长
 * @since 2019/9/29
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public void save(City city) {

        cityDao.save(city);

    }
}
