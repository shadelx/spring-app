# Movie app wih reactjs and spring-boot

This is a simple movie app created with reactjs and spring-boot, using mongodb as it backend

## installation
For this project we use npm package manager on the frontend and for the back we use maven
```


server
mvnw spring-boot:run

client
npm install
npm run dev
```

## dependencies
front
- React
- Bootstrap
back
- spring-boot
database
-mongodb

## server properties

Routes:
- GET /api/movies
- GET /{imdbId}"
- POST /api/reviews
   ```
    body : {
                "reviewBody":"awesome performance",
                "imdbId":"tt3915174"
            }
    ```
- DELETE /api/reviews