package com.loner.base.lang.reflect;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * Introspector反省工具类
 * ['ɪntrəspektɜ:]
 * @author pengcheng.tian
 *
 */
public class BeanInfoUtil {
	public static void setPropertyByIntrospector(UserInfo userInfo, String userName, Object value) throws Exception {
		BeanInfo beanInfo = Introspector.getBeanInfo(UserInfo.class);
		PropertyDescriptor[] proDescrtptors = beanInfo.getPropertyDescriptors();
		if (proDescrtptors != null && proDescrtptors.length > 0) {
			for (PropertyDescriptor propDesc : proDescrtptors) {
				if (propDesc.getName().equals(userName)) {
					Method methodSetUserName = propDesc.getWriteMethod();
					methodSetUserName.invoke(userInfo, value);
					System.out.println("set userName:" + userInfo.getUserName());
					break;
				}
			}
		}
	}

	public static void getPropertyByIntrospector(UserInfo userInfo, String userName) throws Exception {
		BeanInfo beanInfo = Introspector.getBeanInfo(UserInfo.class);
		PropertyDescriptor[] proDescrtptors = beanInfo.getPropertyDescriptors();
		if (proDescrtptors != null && proDescrtptors.length > 0) {
			for (PropertyDescriptor propDesc : proDescrtptors) {
				if (propDesc.getName().equals(userName)) {
					Method methodGetUserName = propDesc.getReadMethod();
					Object objUserName = methodGetUserName.invoke(userInfo);
					System.out.println("get userName:" + objUserName.toString());
					break;
				}
			}
		}
	}

}
