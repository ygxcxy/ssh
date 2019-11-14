package com.qiudaozhang.dao.impl;

import com.qiudaozhang.dao.ProvinceDao;
import com.qiudaozhang.model.Province;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/9/29
 */
@Repository
@Transactional
public class ProvinceDaoImpl implements ProvinceDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Province> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Province").list();
    }

    @Override
    public void delById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Province province = session.get(Province.class, id);
        session.delete(province);
    }

    @Override
    public void save(Province province) {
        Session session = sessionFactory.getCurrentSession();
        session.save(province);
    }

    @Override
    public Province findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Province.class,id);
    }
}
