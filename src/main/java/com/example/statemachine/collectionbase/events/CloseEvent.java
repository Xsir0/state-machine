package com.example.statemachine.collectionbase.events;

/**
 * @ClassName CloseEvent
 * @Description 关门
 * @Author xsir
 * @Date 2021/6/28 下午7:30
 * @Version V1.0
 */
public class CloseEvent implements Event {
    @Override
    public String execute() {
        return "close";
    }
}
