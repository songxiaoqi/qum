package com.quming.notify;

import com.quming.entity.Order;
import com.quming.exception.SendMailException;

/**
 * 通知
 */
public interface NotifyService {

    int advise(Order order) throws SendMailException;
}
