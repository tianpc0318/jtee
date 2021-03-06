package com.loner.ioc.parser;

import java.util.List;

import org.dom4j.Element;

import com.loner.ioc.autowire.Autowire;
import com.loner.ioc.element.LeafElement;
import com.loner.ioc.element.PropertyElement;

public interface BeanElementParser {
	/**
	 * 判断一个bean元素是否需要延迟加载
	 * @param element
	 * @return
	 */
	public boolean isLazy(Element beanElement);
	
	/**
	 * 获得一个bean元素下的constructor-arg（构造方法参数）的子标签
	 * @param element
	 * @return
	 */
	public List<Element> getConstructorArgsElements(Element bean);
	
	/**
	 * 得到元素属性为name的属性值
	 * @param element
	 * @param name
	 * @return
	 */
	public String getAttribute(Element element, String name);
	
	/**
	 * 判断一个bean元素是否配置为单态
	 * @param element
	 * @return
	 */
	public boolean isSingleton(Element bean);
	
	/**
	 * 获得一个bean元素下所有property元素
	 * @param element
	 * @return
	 */
	public List<Element> getPropertyElements(Element bean);
	
	/**
	 * 返回一个bean元素对应的Autowire对象
	 * @param element
	 * @return
	 */
	public Autowire getAutowire(Element bean);
	
	/**
	 * 获取bean元素下所有constructor-arg的值(包括value和ref)
	 * @param element
	 * @return
	 */
	public List<LeafElement> getConstructorValue(Element bean);
	
	/**
	 * 获取bean元素下所有property元素的值(包括value和ref)
	 * @param element
	 * @return
	 */
	List<PropertyElement> getPropertyValue(Element bean);
}