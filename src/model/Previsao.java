package model;
import java.beans.ConstructorProperties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Previsao {
    private final int codigo;
    private final double temperaturaMinima;
    private final double temperaturaMaxima;
    @Getter
    private final String cidade; 
    private final String data;
    
    
   
    }


