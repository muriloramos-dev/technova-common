package com.technova.user.constants;

public class RabbitUserConstants {
    public static final String USER_SAVE_REQUEST_QUEUE = "user-save-request";
    public static final String USER_LOGIN_REQUEST_QUEUE = "user-login-request";
    public static final String USER_FIND_BY_ID_REQUEST_QUEUE = "user-find-by-id-request";
    public static final String USER_SAVE_REQUEST_ROUTING_KEY = "user.save";
    public static final String USER_LOGIN_REQUEST_ROUTING_KEY = "user.login";
    public static final String USER_FIND_BY_ID_REQUEST_ROUTING_KEY = "user.find_by_id";
    public static final String USER_DELETE_REQUEST_QUEUE = "user-delete-request";
    public static final String USER_DELETE_REQUEST_ROUTING_KEY = "user.delete";
    public static final String USER_UPDATE_REQUEST_QUEUE = "user-update-request";
    public static final String USER_UPDATE_REQUEST_ROUTING_KEY = "user.update";
    public static final String USER_CONFIRM_EMAIL_ROUTING_KEY = "user.confirm_email";
    public static final String USER_CONFIRM_EMAIL_QUEUE = "user-confirm-email";
    public static final String USER_EXCHANGE = "user-exchange";

    public RabbitUserConstants() {}
}
