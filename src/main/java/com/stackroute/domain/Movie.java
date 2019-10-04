package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private Actor actor;
    private ApplicationContext context = null;


    public Actor getActor() {
        return actor;
    }


//    public Movie(Actor actor) {
//        this.actor = actor;
//    }

    //
    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("this is movie actor");
    }
    public void name()
    {
        System.out.print(actor.getAge());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("this is beam factory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("beam name is"+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        System.out.println(context);
    }
}
