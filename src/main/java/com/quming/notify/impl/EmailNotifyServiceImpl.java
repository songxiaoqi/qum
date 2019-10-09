package com.quming.notify.impl;

import com.quming.entity.Order;
import com.quming.exception.SendMailException;
import com.quming.notify.NotifyService;
import com.quming.utils.EmailUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;

@Service("notifyService")
public class EmailNotifyServiceImpl implements NotifyService {

    @Override
    public int advise(Order order) throws SendMailException {
        if(null!=order&&!StringUtils.isEmpty(order.getEmail())){
            EmailUtils.config(EmailUtils.SMTP_163(false), "wosongxiaoqi@163.com", "a18792532544");
            EmailUtils.subject("处理结果").from("大师","wosongxiaoqi@163.com").to("897044323@qq.com").text("我尼玛。。。。。。。").send();
            EmailUtils.subject("处理结果").from("大师","wosongxiaoqi@163.com").to("897044323@qq.com").text("我尼玛。。。。。。。").attach(new File("C:\\Users\\zlc\\Pictures\\Saved Pictures\\8.jpeg"), "测试图片.jpeg").send();
            return 1;
        }
        return 0;
    }
}
