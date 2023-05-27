package org.jason.getLocalTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void getCurrentTime(String content) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("[" + formattedDateTime + "] " + content);
    }
}

//目前这部分的代码仍然存在问题，暂时不选择启用
//预期想要实现的目标是如何去实现反馈print时的时间