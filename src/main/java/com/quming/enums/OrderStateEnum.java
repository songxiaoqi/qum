package com.quming.enums;

/**
 * 订单状态
 */
public enum OrderStateEnum {

    ORDERSTATE_UNPAY(1,"待付款"),
    ORDERSTATE_PAYED(2,"已付款"),
    ORDERSTATE_SEND(3,"已发货");

    private Integer orderState;

    private String desc;

    private OrderStateEnum(Integer orderState, String desc) {
        this.orderState = orderState;
        this.desc = desc;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static OrderStateEnum getOrderStateEnumByOrderState(Integer orderState) {
        for(OrderStateEnum orderStateEnum : OrderStateEnum.values()) {
            if(orderStateEnum.getOrderState() == orderState) {
                return orderStateEnum;
            }
        }
        return null;
    }
}
