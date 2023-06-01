package com.chungnguyen.orderfoodserver.Common;

import com.chungnguyen.orderfoodserver.Model.Request;
import com.chungnguyen.orderfoodserver.Model.User;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static User currentUser;
    public static final String UPDATE = "Cập nhật";
    public static final String DELETE = "Xóa";
    public static final int PICK_IMAGE_REQUEST =71;
    public static Request currentRequest;

    public static String convertCodeToStatus(String code){
        if (code.equals("0"))
            return "Đã đặt hàng";
        else if (code.equals("1"))
            return "Đang giao";
        else
            return "Giao thành công";

    }
    public static String getDate() {
        long currentTimeMillis = System.currentTimeMillis();
        Date date = new Date(currentTimeMillis);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String formattedDateTime = formatter.format(date);
        return formattedDateTime;
    }
}
