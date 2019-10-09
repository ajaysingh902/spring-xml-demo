package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
            
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println( "beans is loadedz" );
//        Actor actor=context.getBean("actor",Actor.class);
//
//        System.out.println(actor.getAge());
        Movie movie=context.getBean("movie",Movie.class);
        movie.name();



//        Movie movie2=context.getBean("movie",Movie.class);
//        movie2.name();



//        System.out.println(movie2==movie);
    }
}
