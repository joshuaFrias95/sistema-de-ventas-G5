
package app.model;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor    
@ToString
public class Product {
    String name;
    ECategory category;
    Integer amount;
}
