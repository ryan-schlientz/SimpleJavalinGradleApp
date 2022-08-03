package app;

import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;

public class App {

    public static void main(String[] args) {

        Javalin app = Javalin.create(JavalinConfig::enableCorsForAllOrigins);

        app.get("/", ctx -> { ctx.result("Simple Javalin App using Gradle"); });
        app.get("/hello", ctx -> { ctx.result("Hello World!"); });
        app.get("/test", ctx -> {  ctx.status(201); ctx.result("Test Test Test"); });

        app.start();

    }
}