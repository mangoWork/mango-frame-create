package org.mango.work.ssm.web.utils;

/**
 * Created by 戴礼明 on 2017/6/4.
 * 对象基础工具
 */
public class ObjectUtils {


	/**
	 * 根据{regex}分割字符串val
	 * @param val
	 * @param regex
	 * @return
	 */
	public static String[] stringToArray(String val,String regex) {
          if(val == null){
            return null;
		  }

		  String[] values = val.split(regex);
          for(int i=0;i<values.length;i++){
              values[i] = values[i] == null?"":values[i].trim();
		  }
		  return values;
 	}
}
