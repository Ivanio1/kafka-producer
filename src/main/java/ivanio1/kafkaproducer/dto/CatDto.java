package ivanio1.kafkaproducer.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CatDto {
    String name ;
    int weight ;
    int age ;
}
