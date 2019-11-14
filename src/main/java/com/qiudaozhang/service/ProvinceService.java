package com.qiudaozhang.service;

import com.qiudaozhang.model.Province;

import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/9/29
 */
public interface ProvinceService {
    List<Province> findAll();

   void delById(Long id);

    void save(Province province);

    Province findById(Long id);
}
