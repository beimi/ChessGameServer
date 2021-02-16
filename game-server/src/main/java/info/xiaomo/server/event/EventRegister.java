package info.xiaomo.server.event;

import info.xiaomo.server.listener.SecondEventListener;

import static info.xiaomo.server.event.EventUtil.addListener;

public class EventRegister {

    /**
     * 可以隨時新增事件
     */
    public static void registerPreparedListeners() {
        addLoginListener(); // 登录监听器
        addLogoutListener(); // 登出事件
        addServerSecondListener(); // 1秒钟一次的事件
        addServerMinuteListener(); // 1分钟一次的事件

    }

    private static void addLogoutListener() {
    }

    private static void addServerMinuteListener() {
    }

    private static void addServerSecondListener() {
        addListener(new SecondEventListener(), EventType.SERVER_SECOND_HEART);
    }

    /**
     * 登录事件监听器
     */
    private static void addLoginListener() {
    }
}
