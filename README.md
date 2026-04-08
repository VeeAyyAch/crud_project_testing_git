# Simple Spring Boot Project

A simple Spring Boot application with a GET endpoint that returns different messages based on the ID.

## Endpoints

### GET /hello/{id}

Returns a greeting message based on the ID:
- If `id = 1`: Returns "Hello vaibhav"
- For any other `id`: Returns "Hello all"

## How to Run

1. Make sure you have Java 17+ and Maven installed
2. Run the application:
   ```bash
   mvn spring-boot:run
   ```
3. The application will start on `http://localhost:8080`

## Testing

Once the application is running, you can test the endpoints:

- `http://localhost:8080/hello/1` -> Returns "Hello vaibhav"
- `http://localhost:8080/hello/2` -> Returns "Hello all"
- `http://localhost:8080/hello/5` -> Returns "Hello all"

## Swagger Documentation

The application includes Swagger (OpenAPI 3) documentation. Once the application is running:

- **Swagger UI URL**: `http://localhost:8080/swagger-ui.html`
- **OpenAPI JSON**: `http://localhost:8080/v3/api-docs`

The Swagger UI provides an interactive interface to:
- View all available endpoints
- Test API endpoints directly from the browser
- View request/response schemas and documentation

## Project Structure

```
src/main/java/com/example/simplespringboot/
|-- SimpleSpringBootApplication.java  # Main application class
|-- config/
|   `-- SwaggerConfig.java           # Swagger/OpenAPI configuration
`-- controller/
    `-- HelloController.java           # REST controller with the endpoint
```
