package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Book {
    public int id;
    public String name;
    public String press;
    public String author;
}
