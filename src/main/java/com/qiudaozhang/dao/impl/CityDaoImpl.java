package com.qiudaozhang.dao.impl;

import com.qiudaozhang.dao.CityDao;
import com.qiudaozhang.model.City;
import com.qiudaozhang.model.Province;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @author 深圳邱道长
 * @since 2019/9/29
 */
@Repository
@Transactional
public class CityDaoImpl implements CityDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void save(City city) {
        Session session = sessionFactory.getCurrentSession();
        Province province = session.get(Province.class, city.getProvince().getId());
        city.setProvince(province);
        session.save(city);
    }
}
