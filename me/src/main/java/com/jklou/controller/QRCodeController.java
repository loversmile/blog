package com.jklou.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import static com.jklou.utils.QRCodeUtil.generateQRCode;
import static com.jklou.utils.QRCodeUtil.parseQRCode;

@RestController
@RequestMapping("/QRCode")
public class QRCodeController {
    private final static String QRName = "./QR.jpg";

    @RequestMapping("/local/{text}")
    public String getQRCode(@PathVariable String text){
        // String text = "hello world!"; // 随机生成验证码
        System.out.println("随机码： " + text);
        fileQRCode(text);
        return "ok";
    }

    @RequestMapping(value = "/image/{text}", produces = MediaType.IMAGE_JPEG_VALUE)
    public BufferedImage getQRCodeImage(@PathVariable String text) throws IOException {
        System.out.println("随机码： " + text);
        fileQRCode(text);
        System.out.println("Before Response !!");
        return ImageIO.read(new FileInputStream(new File(QRName)));
    }

    /* /getimage?text=thisistest*/
    @RequestMapping(value = "/getimage", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getQRCodeImageBytes(@RequestParam("text") String text) throws IOException {
        System.out.println("随机码： " + text);
        fileQRCode(text);

        System.out.println("Before Response !!");
        File file = new File(QRName);
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }

    public static void fileQRCode(String text) {
        int width = 256; // 二维码图片的宽
        int height = 256; // 二维码图片的高
        String format = "png"; // 二维码图片的格式
        try {
            // 生成二维码图片，并返回图片路径
            String pathName = generateQRCode(text, width, height, format, QRName);
            System.out.println("生成二维码的图片路径： " + pathName);

            String content = parseQRCode(pathName);
            System.out.println("解析出二维码的图片的内容为： " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
