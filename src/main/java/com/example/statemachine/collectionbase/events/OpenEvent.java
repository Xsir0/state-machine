package com.example.statemachine.collectionbase.events;

/**
 * @ClassName OpenEvent
 * @Description 开门
 * @Author xsir
 * @Date 2021/6/28 下午7:31
 * @Version V1.0
 */
public class OpenEvent implements Event {
    @Override
    public String execute() {
        return "open";
    }
}
