package org.example.repository.impl;

import org.example.entity.Image;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class ImageRepo implements org.example.repository.ImageRepo {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public boolean create(Image image) {
        entityManager.persist(image);
        return true;
    }

    @Override
    public boolean update(Image image) {
        entityManager.merge(image);
        return true;
    }

    @Override
    public Image findById(int id) {

        return entityManager.find(Image.class,id);
    }

    @Override
    public List<Image> findAll() {
        return entityManager.createQuery("From Image ").getResultList();
    }

    @Override
    public boolean delete(int id) {
        entityManager.remove(findById(id));
        return true;
    }
}
