package com.prototype.update;

import com.prototype.AdvTemplate;

import java.util.Random;

/**
 * @Author 李非凡
 * @Description: 修改后的场景类
 * @Date 2020/9/25 15:40
 * @Version 1.0
 */
public class Client {

    /**
     * 发送账单的数量，这个值是从数据库中获得
     */
    private static final int MAX_COUNT = 6;

    public static void main(String[] args) {
        // 模拟邮件发送
        int i = 0;
        // 把模板定义出来，这个是从数据中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            // 以下是每封邮件不同的地方
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + "先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            // 然后发送邮件
            sendMail(cloneMail);
            i++;
        }

    }

    /**
     * 发送邮件
     * @param mail 邮件
     */
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人： " + mail.getReceiver() + "\t...发送成功！");
    }

    /**
     * 获得指定长度的随机字符串
     * @param maxLength 指定长度
     * @return 随机字符串
     */
    public static String getRandString(int maxLength) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrskuvwxyz";

        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }

        return sb.toString();
    }
}
