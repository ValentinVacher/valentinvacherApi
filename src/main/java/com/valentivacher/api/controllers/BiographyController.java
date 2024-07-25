package com.valentivacher.api.controllers;

import com.valentivacher.api.models.Biography;
import com.valentivacher.api.services.BiographyService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/biography")
@Tag(name = "Biography")
public class BiographyController {
    @Autowired
    BiographyService biographyService;

    @io.swagger.v3.oas.annotations.parameters.RequestBody(content = @Content(examples = {
            @ExampleObject(
                    name = "Biography",
                    summary = "Biography",
                    value = """
                            {
                            "city": "city",
                            "phoneNumber": "phoneNumber",
                            "biography": "biography"
                            }
                            """
            )
    }))
    @PostMapping(value = "", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Biography> addBiography(@Valid @RequestBody Biography biography) {
        return new ResponseEntity<>(biographyService.addBiography(biography), HttpStatus.CREATED);
    }
}
