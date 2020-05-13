/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context.annotation;

import org.springframework.aop.config.AopConfigUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 这个类是通过@Import()引入的，说明它会像spring容器中注册一个AnnotationAwareAspectJAutoProxyCreator类，
 * 而 AnnotationAwareAspectJAutoProxyCreator的继承结构如下
 *     AnnotationAwareAspectJAutoProxyCreator
 *        -->AspectJAwareAdvisorAutoProxyCreator
 *           -->AbstractAdvisorAutoProxyCreator
 *              -->AbstractAutoProxyCreator
 *                 -->SmartInstantiationAwareBeanPostProcessor
 *                    -->InstantiationAwareBeanPostProcessor
 *                       -->BeanPostProcessor
 *  所以这个类其实就是一个后置处理器，
 * Registers an {@link org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator
 * AnnotationAwareAspectJAutoProxyCreator} against the current {@link BeanDefinitionRegistry}
 * as appropriate based on a given @{@link EnableAspectJAutoProxy} annotation.
 *
 * @author Chris Beams
 * @author Juergen Hoeller
 * @since 3.1
 * @see EnableAspectJAutoProxy
 */
class AspectJAutoProxyRegistrar implements ImportBeanDefinitionRegistrar {

	/**
	 * Register, escalate, and configure the AspectJ auto proxy creator based on the value
	 * of the @{@link EnableAspectJAutoProxy#proxyTargetClass()} attribute on the importing
	 * {@code @Configuration} class.
	 */
	@Override
	public void registerBeanDefinitions(
			AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		/**
		 * 将 AnnotationAwareAspectJAutoProxyCreator 这个类添加到spring容器中的beanDefinitionMap集合中去。
		 * key:AUTO_PROXY_CREATOR_BEAN_NAME
		 * value:封装了AnnotationAwareAspectJAutoProxyCreator这个类的Class对象的BeanDefinition
		 */
		AopConfigUtils.registerAspectJAnnotationAutoProxyCreatorIfNecessary(registry);
		//获取注解EnableAspectJAutoProxy
		AnnotationAttributes enableAspectJAutoProxy =
				AnnotationConfigUtils.attributesFor(importingClassMetadata, EnableAspectJAutoProxy.class);
		if (enableAspectJAutoProxy != null) {
			/**
			 * 如果这个注解proxyTargetClass属性为true，则需要把这个属性添加到BeanDefinition的propertyValues属性中
			 */
			if (enableAspectJAutoProxy.getBoolean("proxyTargetClass")) {
				AopConfigUtils.forceAutoProxyCreatorToUseClassProxying(registry);
			}
			/**
			 * 如果这个注解 exposeProxy 属性为true，则需要把这个属性添加到BeanDefinition的propertyValues属性中
			 */
			if (enableAspectJAutoProxy.getBoolean("exposeProxy")) {
				AopConfigUtils.forceAutoProxyCreatorToExposeProxy(registry);
			}
		}
	}

}
