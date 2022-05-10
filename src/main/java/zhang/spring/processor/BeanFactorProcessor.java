package zhang.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

public class BeanFactorProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        AbstractBeanDefinition beanDefinition =(AbstractBeanDefinition) configurableListableBeanFactory.getBeanDefinition("user");
        //System.out.println(beanDefinition.getBeanClass());
        // System.out.println(beanDefinition);
        // System.out.println("getBeanClassName():"+beanDefinition.getBeanClassName());
        // System.out.println("getPropertyValues():"+beanDefinition.getPropertyValues());
        // System.out.println("getPropertyValueList():"+beanDefinition.getPropertyValues().getPropertyValueList());
        // System.out.println("getFactoryBeanName():"+beanDefinition.getFactoryBeanName());
        // System.out.println(beanDefinition);
        //beanDefinition.getPropertyValues().addPropertyValue("userName","李伟");
    }
}
