# Photo Voting Application

A coding exercise. Users can register and pick from photos in a tournament.

# Approach and Concessions

In order to make sure that my application was deployable to Heroku, I used a Spring Boot/Java starter barebones application provided by heroku on GitHub. I had trouble using the Heroku provided database so spent some time troubleshooting that. I added Spring Security, and the login and registration forms, and used a combination of Thymeleaf and Vue.js in the front end for the home and winners pages. This kept it simple for me to focus on deploying to Heroku, but if I were to revisit this, I would either use Thymeleaf without Vue.js or deploy two separate applications, with a Vue.js ui and a Spring Boot api/service. It should also be noted that while registration and login is possible, the security could be improved and that this application should not handle private information. If time, the accessibility of the application could also be improved.

# Resources
- [https://github.com/heroku/java-getting-started](https://github.com/heroku/java-getting-started)

- [https://github.com/hellokoding/hellokoding-courses/tree/master/springboot-examples/springboot-security-login-thymeleaf/src/main/resources](https://github.com/hellokoding/hellokoding-courses/tree/master/springboot-examples/springboot-security-login-thymeleaf/src/main/resources)

- [https://spring.io/guides/gs/securing-web/](https://spring.io/guides/gs/securing-web/)

- [https://devcenter.heroku.com/articles/getting-started-with-java#push-local-changes](https://devcenter.heroku.com/articles/getting-started-with-java#push-local-changes)

- [Java on Heroku](https://devcenter.heroku.com/categories/java)

## Running Locally

Make sure you have Java and Maven installed. Also, install the [Heroku CLI](https://cli.heroku.com/).
Clone the repository and navigate to the directory the project is in.

```sh
$ mvn install
$ heroku local:start
```
The app should run on [localhost:5000](http://localhost:5000/).

## Updating Locally
```sh
$ mvn clean install
$ heroku local web
```

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku main
$ heroku open
```

