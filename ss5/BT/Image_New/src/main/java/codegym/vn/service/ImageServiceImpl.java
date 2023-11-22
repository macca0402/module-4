package codegym.vn.service;

import codegym.vn.entity.Image;
import codegym.vn.repository.ImageRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImageServiceImpl implements ImageService{
    @Autowired
    private ImageRepoImpl imageRepo;
    @Override
    public boolean createComment(Image image) {
        return imageRepo.createComment(image);
    }

    @Override
    public List<Image> listImage() {
        return imageRepo.listImage();
    }
}
