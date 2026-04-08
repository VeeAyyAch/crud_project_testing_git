package com.example.simplespringboot.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Hello Controller", description = "API endpoints for greeting messages")
public class HelloController {

    @GetMapping("/hello/{id}")
    @Operation(summary = "Get greeting message by ID", description = "Returns a personalized greeting message based on the provided ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved greeting message")
    })
    public String getHelloMessage(
            @Parameter(description = "ID of the user. Use 1 for Vaibhav, any other number for general greeting", required = true)
            @PathVariable Long id) {
        if (id == 1) {
            return "Hello vaibhav rokde haha";
        } else {
            return "Hello all haha";
        }
    }
}
