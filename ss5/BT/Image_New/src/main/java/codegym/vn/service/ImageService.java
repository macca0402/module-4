package codegym.vn.service;

import codegym.vn.entity.Image;

import java.util.List;

public interface ImageService {
    boolean createComment(Image image);
    List<Image> listImage();
}
