package com.vue.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;

@Slf4j
public class DingtalkUtil {

    public static void main(String[] args) throws Exception {
        sendMsg();
    }

    public static void sendMsg() throws Exception {

    }

    public static String sign(Long timestamp) throws Exception {
        String secret = "SECb3ab86c1bc033b29f08bc3b718e1c0836d0428f16b55ef12c9c23264beacda36";

        String stringToSign = timestamp + "\n" + secret;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
        String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)), "UTF-8");

        return sign;
    }

}
