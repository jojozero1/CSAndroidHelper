package com.example.csphonehelper;

public  abstract class AsrClientBase {
    public interface IAsrCallback {
        /**
         * 识别出错时的回调方法。
         *
         * @param msg 错误信息。
         */
        void onError(String msg);

        /**
         * 识别结果返回的回调方法。
         *
         * @param result 识别结果。
         */
        void onResult(String result);
    }

    /**
     * 开始识别操作，具体实现由子类提供。
     */
    public abstract void startRecognize();

    /**
     * 停止识别操作，具体实现由子类提供。
     */
    public abstract void stopRecognize();

    /**
     * 取消识别操作，具体实现由子类提供。
     */
    public abstract void cancelRecognize();

    /**
     * 设置识别回调，用于接收识别结果或错误信息。
     *
     * @param callback ASR回调接口实例。
     */
    public abstract void setCallback(IAsrCallback callback);

    /**
     * 设置识别参数，具体的参数键值对由子类定义和使用。
     *
     * @param key 参数的键。
     * @param value 参数的值。
     */
    public abstract void setParam(String key, Object value);

    /**
     * 销毁客户端实例，释放资源，具体实现由子类提供。
     */
    public abstract void destroy();
}

