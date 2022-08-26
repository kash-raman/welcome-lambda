package me.kash.lambda;
import com.amazonaws.services.lambda.runtime.*;
public class Welcome implements RequestHandler<Object,Object>{
    @Override
    public Object handleRequest(Object o, Context context) {
        System.out.println("Welcome to lambda");
        return null;
    }
}
