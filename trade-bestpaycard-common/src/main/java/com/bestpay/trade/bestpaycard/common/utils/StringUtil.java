package com.bestpay.trade.bestpaycard.common.utils;

import com.google.common.base.Strings;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 *
 * 字符串工具类
 * 1、随机产生6位字符串
 * 2、格式化字符串工
 * Created by tianshuo on 2016/3/10.
 */
public class StringUtil {

    /**
     * 生成签约申请编码
     */
    public static String getTimeUUid(){
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat("YYYYMMDDHHmmssSSS");
        String uuId = UUID.randomUUID().randomUUID().toString().replace("-","");
        String str = "PD"+sdFormatter.format(nowTime)+ uuId.substring(0,6).toUpperCase();
        return str;
    }

    public static void main(String[] args) {
        System.out.println(getTimeUUid());
    }

    /**
     * 产生随机的六位数
     * @return
     */
    public static String getSixNbr(){
        Random rad=new Random();
        String result  = rad.nextInt(1000000) +"";

        if(result.length()!=6){
            return getSixNbr();
        }
        return result;
    }

    /**
     * 生成随机数
     * @param length
     * @return
     */
    public static String getRandomNbr(int length){
        Random random = new Random();
        // 设置备选验证码:数字"0-9"
        String base = "0123456789";
        int size = base.length();
        StringBuffer randomCode = new StringBuffer();

        // 随机产生legnth位数字的验证码。
        for (int i = 0; i < length; i++) {
            // 得到随机产生的验证码数字。
            int start = random.nextInt(size);
            String strRand = base.substring(start, start + 1);
            randomCode.append(strRand);
        }
        return randomCode.toString();
    }

    /**
     * 格式化字符串
     * @param msgTemplate
     * @param positionValues
     * @return
     */
    public static String formatMsg(String msgTemplate, Object... positionValues) {
        try {
            return MessageFormat.format(msgTemplate, positionValues);
        } catch (Exception var5) {
            StringBuilder buf = new StringBuilder("资源信息占位符替换异常，占位符参数信息：");

            for(int i = 0; i < positionValues.length; ++i) {
                buf.append(" arg[" + i + "]=" + positionValues[i]);
            }

            return msgTemplate;
        }
    }

    public static String fillLeft(String orignalString, char fillchar, int lenth) {
        return Strings.padStart(orignalString, lenth, fillchar);
    }


    public static boolean isNotEmpty(String str) {
        return !Strings.isNullOrEmpty(str);
    }


    public static String generateRandomString(int i) {
        char ac[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        };
        StringBuilder stringbuffer = new StringBuilder();
        Random random = new Random();
        for (int j = 0; j < i; j++)
            stringbuffer.append(ac[random.nextInt(ac.length)]);

        return stringbuffer.toString();
    }

    public static byte[] hexStringToBytes(String s) {
        if (s == null || s.equals(""))
            return null;
        s = s.toUpperCase();
        int i = s.length() / 2;
        char ac[] = s.toCharArray();
        byte abyte0[] = new byte[i];
        for (int j = 0; j < i; j++) {
            int k = j * 2;
            abyte0[j] = (byte) (charToByte(ac[k]) << 4 | charToByte(ac[k + 1]));
        }

        return abyte0;
    }

    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }


    public static String bytesToHexString(byte abyte0[]) {
        StringBuilder stringbuilder = new StringBuilder("");
        if (abyte0 == null || abyte0.length <= 0)
            return null;
        for (int i = 0; i < abyte0.length; i++) {
            int j = abyte0[i] & 0xff;
            String s = Integer.toHexString(j);
            if (s.length() < 2)
                stringbuilder.append(0);
            stringbuilder.append(s);
        }

        return stringbuilder.toString();
    }

    public static String replaceString(String oldString, String... arg)
    {
        for(String replaceStr:arg){
            oldString = oldString.replaceFirst("#", replaceStr);

        }
        return oldString;

    }
    public static String formatNumber(double paramDouble, int paramInt)
    {
        return NumberFormat.getNumberInstance().format(round(paramDouble, paramInt));
    }
    public static double round(double paramDouble, int paramInt)
    {
        if (paramInt < 0) {
            throw new RuntimeException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal localBigDecimal1 = new BigDecimal(Double.toString(paramDouble));
        BigDecimal localBigDecimal2 = new BigDecimal("1");
        return localBigDecimal1.divide(localBigDecimal2, paramInt, 4).doubleValue();
    }

    /**
     * 屏蔽字符串中间字符
     * @param str 原字符串
     * @param leftCount 保留左边位数
     * @param lightCount 保留右边位数
     * @param replaceChar 中间替换的字符
     * @return
     */
    public static String encryptString(String str, int leftCount, int lightCount, String replaceChar) {

        if (str != null) {
            StringBuffer cardNoEn = new StringBuffer();
            int strLength = str.length();
            int sumCount = leftCount + lightCount;
            String cardNoLeft = "";
            String cardNoLight = "";
            String strEn = "";

            if (strLength > sumCount){
                //取前leftCount位
                cardNoLeft = str.substring(0, leftCount);
                //取后lightCount位
                cardNoLight = str.substring(strLength - lightCount, strLength);
                //需要补充加密字符
                strEn = String.format("%" + (strLength - sumCount) + "s", "").replaceAll("\\s", replaceChar);

                str = cardNoEn.append(cardNoLeft).append(strEn).append(cardNoLight).toString();
            }
        }
        return str;
    }

    /**
     * 判断是否为全数字
     * @param str
     * @return
     */
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public static boolean isNumber(String s) {
        if (s == null || s.equals(""))
            return false;
        String s1 = "0123456789";
        for (int i = 0; i < s.length(); i++)
            if (s1.indexOf(s.charAt(i)) < 0)
                return false;

        return true;
    }
}
