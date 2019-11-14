package com.qiudaozhang.service.impl;

import com.qiudaozhang.dao.ProvinceDao;
import com.qiudaozhang.model.Province;
import com.qiudaozhang.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/9/29
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceDao provinceDao;

    @Override
    public List<Province> findAll() {
        return provinceDao.findAll();
    }

    @Override
    public  void delById(Long id) {

         provinceDao.delById(id);
    }

    @Override
    public void save(Province province) {
        provinceDao.save(province);
    }

    @Override
    public Province findById(Long id) {

        return provinceDao.findById(id);
    }
}
