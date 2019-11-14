package com.qiudaozhang.dao;

import com.qiudaozhang.model.Province;

import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/9/29
 */
public interface ProvinceDao {
    List<Province> findAll();

    void delById(Long id);

    void save(Province province);

    Province findById(Long id);
}
