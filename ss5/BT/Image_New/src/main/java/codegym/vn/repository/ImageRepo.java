package codegym.vn.repository;

import codegym.vn.entity.Image;

import java.util.List;
public interface ImageRepo {
    boolean createComment(Image image);
    List<Image> listImage();
}
