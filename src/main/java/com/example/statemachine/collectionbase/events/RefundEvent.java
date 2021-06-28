package com.example.statemachine.collectionbase.events;

/**
 * @ClassName RefundEvent
 * @Description 退款
 * @Author xsir
 * @Date 2021/6/28 下午7:31
 * @Version V1.0
 */
public class RefundEvent implements Event {
    @Override
    public String execute() {
        return "refund";
    }
}
