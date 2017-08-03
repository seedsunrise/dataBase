package cn.com.flaginfo.utils;

import cn.com.flaginfo.diamond.DynamicProperties;

/**
 * 淇℃伅鏀瑰彉鐩戝惉鑰� * @author Rain
 *
 */
public abstract class MessageChangeLinstener {

    public MessageChangeLinstener(){
        DynamicProperties.getInstance().addChangeLinstener(this);
    }

    /**
     * 鐩戝惉浠�箞鏁版嵁鐨勫彉鍔紝杩斿洖鐨刱ey鍊间负閰嶇疆鍙橀噺鐨剆tartWith鍖归厤
     * @return
     */
    public abstract String[] register();

    public abstract void change();



}
