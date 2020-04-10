package com.zhihao.common.orderpay.enums;

/**
 * @Author: zhihao
 * @Date: 2020/4/10 11:56
 * @Description: 功能成功后业务逻辑实现类Bean名称
 * <p>
 *  例:  咖啡需要App支付功能:
 *       1.先把异步通知支付成功后需要处理的业务功能逻辑,根据HandlerAfterSuccess规范接口进行实现,并需要指定实现类注册Bean的名称。
 *       2.实现后把实现类注册Bean的名称添加到此枚举。并增加说明。
 *       3.在调用{@link UnifiedPlaceAnOrder#placeAnOrder(PayType, String, String, String, String, String)}
 *       (...Bean的名称)统一下单的时候传递对应此枚举的beanName名称传递过去
 * </p>
 * @Versions 1.0
 **/
public enum HandlerSuccessBeanName {

    /**{@link com.zhihao.order.service.service.impl.CoffeeHandlerAfterSuccessImpl} */
    COFFEE_SUCCESS_HANDLER("咖啡异步通知支付成功状态码后的业务处理实现类","coffeeHandlerAfterSuccess"),

    /**{@link com.zhihao.order.service.service.impl.MemberHandlerAfterSuccessImpl} */
    MEMBER_SUCCESS_HANDLER("会员异步通知支付成功状态码后的业务处理实现类","memberHandlerAfterSuccess");

    private String description;

    private String beanName;

    HandlerSuccessBeanName(String description, String beanName) {
        this.description = description;
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
