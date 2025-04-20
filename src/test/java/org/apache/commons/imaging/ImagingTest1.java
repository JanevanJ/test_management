package org.apache.commons.imaging;

import org.junit.jupiter.api.Test;

import java.awt.Dimension;
import java.awt.color.ICC_Profile;
import java.io.File;
import java.io.FileInputStream;


import static org.junit.jupiter.api.Assertions.*;

public class ImagingTest1 {

        // 测试 getFormatCompliance 方法
    @Test
    public void testGetFormatCompliance() {
        try {
            File file = new File("C:\\Users\\ASUS\\Desktop\\000021.jpg");
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = fis.readAllBytes();
            fis.close();

            FormatCompliance formatCompliance = Imaging.getFormatCompliance(bytes);
            // 由于 getBufferedImage 被注入错误，这里可能为 null
            assertNull(formatCompliance);
        } catch (Exception e) {
        }
    }

    // 测试 getIccProfile 方法
    @Test
    public void testGetIccProfile() {
        try {
            File file = new File("C:\\Users\\ASUS\\Desktop\\000021.jpg");
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = fis.readAllBytes();
            fis.close();

            ICC_Profile iccProfile = Imaging.getIccProfile(bytes);
            // 由于 getBufferedImage 被注入错误，这里可能为 null
            assertNull(iccProfile);
        } catch (Exception e) {
        }
    }

    // 测试 getImageSize 方法
    @Test
    public void testGetImageSize() {
        try {
            File file = new File("C:\\Users\\ASUS\\Desktop\\000021.jpg");
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = fis.readAllBytes();
            fis.close();

            Dimension imageSize = Imaging.getImageSize(bytes);
            // 由于 getBufferedImage 被注入错误，这里可能为 null
            assertNull(imageSize);
        } catch (Exception e) {
        }
    }
}