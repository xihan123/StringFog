package com.xihan.stringfog;

import com.github.megatronking.stringfog.IStringFog;

public class CustomStringFogImpl implements IStringFog {

    @Override
    public String encrypt(String data, String key) {
        // 自己实现加密算法，这里举例将key添加到所有String数据前面
        return key + data;
    }

    @Override
    public String decrypt(String data, String key) {
        // 自己实现解密算法，这里举例将String数据前面的key移除
        return data.replace(key, "");
    }

    @Override
    public boolean overflow(String data, String key) {
        return false;
    }

}

