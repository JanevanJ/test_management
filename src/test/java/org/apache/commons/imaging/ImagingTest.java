package org.apache.commons.imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ImagingTest {

    // 测试getAllBufferedImages方法
    @Test
    public void testGetAllBufferedImages() {
        File file = new File("C:\\Users\\ASUS\\Desktop\\000021.jpg");
        try {
            List<BufferedImage> images = Imaging.getAllBufferedImages(file);
            assertNull(images);
        }catch (Exception e) {
                // 忽略异常，只关注返回值是否为null
        }
    }

    // 测试getImageInfo方法
    @Test
    public void testGetImageInfo() {
        File file = new File("C:\\Users\\ASUS\\Desktop\\000021.jpg");
        try {
            ImageInfo imageInfo = Imaging.getImageInfo(file);
            assertNull(imageInfo);
        } catch (Exception e) {
        }
    }

    // 测试getMetadata方法
    @Test
    public void testGetMetadata() {
        File file = new File("C:\\Users\\ASUS\\Desktop\\000021.jpg");
        try {
            ImageMetadata metadata = Imaging.getMetadata(file);
            assertNull(metadata);
        } catch (Exception e) {
        }
    }
}