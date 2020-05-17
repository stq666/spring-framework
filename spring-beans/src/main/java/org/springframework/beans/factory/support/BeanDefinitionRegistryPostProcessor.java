/*
 * Copyright 2002-2010 the original author or authors.
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

package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * Extension to the standard {@link BeanFactoryPostProcessor} SPI, allowing for
 * the registration of further bean definitions <i>before</i> regular
 * BeanFactoryPostProcessor detection kicks in. In particular,
 * BeanDefinitionRegistryPostProcessor may register further bean definitions
 * which in turn define BeanFactoryPostProcessor instances.
 *
 * @author Juergen Hoeller
 * @since 3.0.1
 * @see org.springframework.context.annotation.ConfigurationClassPostProcessor
 */
public interface BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor {

	/**
	 * 标准初始化后能够修改spring应用上下文的bean定义信息，所有的常规的bean的definition信息已经
	 * 加载完成，但是所有的bean都没有被实例化，在进一步处理此对象对应的BeanDefinition信息之前，
	 * 你能够对BeanDefinition进行修改。
	 * 总结一句话就是：你可以在一个对象实例化之前对这个对象对应的BeanDefinition进行修改。
	 * 可以看一下这个方法的参数BeanDefinitionRegistry：注册BeanDefinition到一个beanDefinitionMap中。
	 * 1）他有一个方法，能够将BeanDefinition注册到beanDefinitionMap中
	 *  registerBeanDefinition(String beanName, BeanDefinition beanDefinition)
	 *  所有我们可以把修改的BeanDefinition重新注册到beanDefinitionMap中去
	 *
	 * 通过这个方法我们可以获取到一个BeanDefinitionRegistry对象，获取到这个对象就可以获取到这个
	 * 对象中注册的所有BeanDefinition对象，我们拥有了这个对象就可以对里面的所有BeanDefinition对象修改和新增操作。
	 *
	 * Modify the application context's internal bean definition registry after its
	 * standard initialization. All regular bean definitions will have been loaded,
	 * but no beans will have been instantiated yet. This allows for adding further
	 * bean definitions before the next post-processing phase kicks in.
	 * @param registry the bean definition registry used by the application context
	 * @throws org.springframework.beans.BeansException in case of errors
	 */
	void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException;

}
