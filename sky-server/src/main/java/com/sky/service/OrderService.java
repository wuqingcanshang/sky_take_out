package com.sky.service;

import com.sky.dto.*;
import com.sky.result.PageResult;
import com.sky.vo.OrderPaymentVO;
import com.sky.vo.OrderStatisticsVO;
import com.sky.vo.OrderSubmitVO;
import com.sky.vo.OrderVO;

public interface OrderService {
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);


    PageResult pageQuery4User(int page, int pageSize, Integer status);


    OrderVO detail(Long id);

    /**
     * 取消订单
     * @param id
     */
    void userCancelById(Long id) throws Exception;

    void repetition(Long id);
    /**
     * 订单支付
     * @param ordersPaymentDTO
     * @return
     */
    OrderPaymentVO payment(OrdersPaymentDTO ordersPaymentDTO) throws Exception;

    /**
     * 支付成功，修改订单状态
     * @param outTradeNo
     */
    void paySuccess(String outTradeNo);

    PageResult conditionSearch(OrdersPageQueryDTO ordersPageQueryDTO);


    /**
     * 各订单状态的数量统计
     * @param
     * @return
     */
    OrderStatisticsVO statistics();


    /**
     * 接单
     */
    void confirm(OrdersConfirmDTO orderConfirmDTO);

    void rejection(OrdersRejectionDTO ordersRejectionDTO);

    void cancel(OrdersCancelDTO ordersCancelDTO) throws Exception;

    void delivery(Long id);

    void complete(Long id);

    /**
     * 催单
     * @param id
     */
    void reminder(Long id);
}
