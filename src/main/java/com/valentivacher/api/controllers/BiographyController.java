package com.valentivacher.api.controllers;

import com.valentivacher.api.models.Biography;
import com.valentivacher.api.services.BiographyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/biography")
@Tag(name = "Biography")
public class BiographyController {
    final BiographyService biographyService;

    public BiographyController(BiographyService biographyService) {
        this.biographyService = biographyService;
    }

    @Operation(summary = "Récupère la dernière biographie ajoutée")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Biographie trouvée", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Biography.class))}),
    })
    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity<Biography> getBiography() {
        return new ResponseEntity<>(biographyService.getBiography(), HttpStatus.OK);
    }

    @Operation(summary = "Créer une nouvelle biographie")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Biographie créée", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Biography.class))}),
            @ApiResponse(responseCode = "400", description = "Les données sont invalides", content = @Content),
    })
    @io.swagger.v3.oas.annotations.parameters.RequestBody(content = @Content(examples = {
            @ExampleObject(
                    name = "Biography",
                    summary = "Biography",
                    value = """
                            {
                            "city": "string",
                            "phoneNumber": "string",
                            "biography": "string"
                            }
                            """
            )
    }))
    @PostMapping(value = "", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Biography> addBiography(@Valid @RequestBody Biography biography) {
        return new ResponseEntity<>(biographyService.addBiography(biography), HttpStatus.CREATED);
    }
}
