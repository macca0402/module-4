package codegym.vn.repository;

import codegym.vn.entity.Image;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ImageRepoImpl implements ImageRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean createComment(Image image) {
        entityManager.persist(image);
        return true;
    }
    @Override
    public List<Image> listImage() {
        return entityManager.createQuery("From Image ").getResultList();
    }
}
