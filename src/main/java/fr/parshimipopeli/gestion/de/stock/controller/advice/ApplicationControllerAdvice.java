package fr.parshimipopeli.gestion.de.stock.controller.advice;

import fr.parshimipopeli.gestion.de.stock.dto.ErrorEntity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class ApplicationControllerAdvice {

    /**
     * Méthode qui retoure des erreurEntity
     * @param exception
     * @return message
     */
    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler({EntityNotFoundException.class})
    public @ResponseBody ErrorEntity handleException(EntityNotFoundException exception) {
        return new ErrorEntity(null, exception.getMessage());
    }
}
