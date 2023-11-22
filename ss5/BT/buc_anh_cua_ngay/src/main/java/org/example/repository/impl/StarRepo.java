package org.example.repository.impl;

import org.example.entity.Star;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StarRepo implements org.example.repository.StarRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean create(Star star) {
        entityManager.persist(star);
        return true;
    }

    @Override
    public boolean update(Star star) {
        entityManager.merge(star);
        return false;
    }

    @Override
    public Star findById(int id) {
        return entityManager.find(Star.class, id);
    }

    @Override
    public List<Star> findAll() {
        return entityManager.createQuery("From Star ").getResultList();
    }

    @Override
    public boolean delete(int id) {
        entityManager.remove(findById(id));
        return true;
    }
}
