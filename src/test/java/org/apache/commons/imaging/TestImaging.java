package org.apache.commons.imaging;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// 测试类
public class TestImaging {
    private static boolean allTestsPassed = true;

    public static void main(String[] args) throws IOException, ImagingException {
        // 测试 getBufferedImage 方法
        testGetBufferedImage();
        // 测试 getImageInfo 方法
        testGetImageInfo();
        // 测试 getImageSize 方法
        testGetImageSize();
        if (allTestsPassed) {
            System.out.println("All tests passed successfully!");
        } else {
            System.err.println("Some tests failed.");
        }
    }

    // 测试 getBufferedImage 方法
    private static void testGetBufferedImage() throws IOException, ImagingException {
        File file = new File("C:\\Users\\ASUS\\Desktop\\000021.jpg");
        InputStream is = new FileInputStream(file);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[16384];
        while ((nRead = is.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();
        byte[] bytes = buffer.toByteArray();

        BufferedImage image = Imaging.getBufferedImage(bytes);
        if (image != null) {
            System.err.println("Test failed: getBufferedImage should return null due to injected error.");
            allTestsPassed = false;
        }
    }

    // 测试 getImageInfo 方法
    private static void testGetImageInfo() throws IOException, ImagingException {
        File file = new File("C:\\Users\\ASUS\\Desktop\\000021.jpg");
        ImageInfo imageInfo = Imaging.getImageInfo(file);
        if (imageInfo != null) {
            System.err.println("Test failed: getImageInfo should return null due to injected error.");
            allTestsPassed = false;
        }
    }

    // 测试 getImageSize 方法
    private static void testGetImageSize() throws IOException, ImagingException {
        File file = new File("C:\\Users\\ASUS\\Desktop\\000021.jpg");
        Dimension size = Imaging.getImageSize(file);
        if (size != null) {
            System.err.println("Test failed: getImageSize should return null due to injected error.");
            allTestsPassed = false;
        }
    }
}