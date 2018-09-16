package team.whatdev.shop.utils.algorithm;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import team.whatdev.shop.utils.constant.Charset;
import team.whatdev.shop.utils.constant.UtilsProperties;
import team.whatdev.shop.utils.exception.AlgorithmException;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @create_time 2018-9-13 20:23:13
 * @author 王超
 * @email wangchao@suztz.com
 * @version 1.0
 * @introduce 暂只支持MD5 与SHA1 的加密处理
 */
public class KeyGeneration {

    private String charset = Charset.UTF_8;
    private final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /**
     * 进行MD5 加密
     * @param str 需要处理的字符串
     * @return MD5 加密后字符串
     */
    public String doMD5Digest(String str){
        return this.doMD5Digest(str, this.charset);
    }
    /**
     * 进行MD5 加密
     * @param str 需要处理的字符串
     * @param charset 字节编码
     * @return MD5 加密后字符串
     */
    public String doMD5Digest(String str, String charset){
        return this.doString("MD5", str, charset);
    }
    /**
     * 进行sha1 加密
     * @param str 需要处理的字符串
     * @return sha1 加密后字符串
     */
    public String doSha1Digest(String str){
        return this.doMD5Digest(str, this.charset);
    }
    /**
     * 进行sha1 加密
     * @param str 需要处理的字符串
     * @param charset 字节编码
     * @return sha1 加密后字符串
     */
    public String doSha1Digest(String str, String charset){
        return this.doString("sha1", str, charset);
    }

    private String doString(String algorithm, String str, String charset) throws AlgorithmException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(str.getBytes( charset));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new AlgorithmException(algorithm, str, e.fillInStackTrace());
        }
        byte[] bytes = messageDigest.digest();
        StringBuilder buf = new StringBuilder(bytes.length * 2);
        for (byte aByte : bytes) {
            buf.append(this.HEX_DIGITS[aByte >> 4 & 0xf]);
            buf.append(this.HEX_DIGITS[aByte & 0xf]);
        }
        return buf.toString();
    }

    public KeyGeneration(){}
    public KeyGeneration(String charset) {
        this.charset = charset;
    }

}
