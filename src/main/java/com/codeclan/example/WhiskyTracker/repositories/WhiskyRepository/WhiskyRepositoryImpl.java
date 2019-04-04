package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Whisky> getAllWhiskyFromNamedYear(int year){
        List<Whisky> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria criteria = session.createCriteria(Whisky.class);
            criteria.createAlias("whiskies", "whiskiesAlias");
            criteria.add(Restrictions.eq("whiskiesAlias.year", year));
            result =  criteria.list();
        } catch (HibernateException exc) {
            exc.printStackTrace();
        }
        return result;
    }
}
